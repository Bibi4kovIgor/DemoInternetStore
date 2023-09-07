package edu.lemon.DemoInternetStore.controller.controllers;

import edu.lemon.DemoInternetStore.controller.services.CustomersService;
import edu.lemon.DemoInternetStore.controller.services.ProductsService;
import edu.lemon.DemoInternetStore.model.dto.CustomersDto;
import edu.lemon.DemoInternetStore.model.dto.ProductsDto;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.Optional;

@Controller
public class MainPageController {

    CustomersService customersService;
    ProductsService productsService;

    public MainPageController(CustomersService customersService, ProductsService productsService) {
        this.customersService = customersService;
        this.productsService = productsService;
    }

    @GetMapping(value = {"/", "/index", "/home"})
    public ModelAndView index(
            @ModelAttribute("response") ModelMap model,
            @RequestParam(value = "name", required = false) String name) {
        Optional<CustomersDto> customerDaoOptional = customersService.getUserInfoByName(name);
/*
        ResponseEntity<CustomerDto> response =
                customerDaoOptional.map(ResponseEntity::ok).orElse(ResponseEntity.notFound().build());
*/

        String responseString = customerDaoOptional.isEmpty()
                ? "User was not found"
                : customerDaoOptional.toString();
        model.addAttribute("responseString", responseString);
        return new ModelAndView("/pages/index", model);
    }

    @GetMapping("/customers")
    public ModelAndView getCustomersByFirstName(
            @ModelAttribute("response") ModelMap model,
            @RequestParam(value = "name", required = false) String name) {
        model.addAttribute("customers", customersService.getCustomerByFirstName(name));
        model.addAttribute("customerType", CustomersDto.class);
        return new ModelAndView("/pages/customers", model);
    }

    @GetMapping("/products")
    public ModelAndView getProductsList(ModelMap modelMap){
        return new ModelAndView(
                "pages/products",
                modelMap
                        .addAttribute("products", productsService.getAllProducts())
                        .addAttribute("productType", ProductsDto.builder().build()));
    }

}
