package edu.lemon.DemoInternetStore.controller.controllers;

import com.sun.source.tree.BinaryTree;
import edu.lemon.DemoInternetStore.controller.services.AdminService;
import edu.lemon.DemoInternetStore.controller.services.ProductsService;
import edu.lemon.DemoInternetStore.model.dto.CustomersDto;
import edu.lemon.DemoInternetStore.model.dto.ProductsDto;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;

import java.math.BigDecimal;
import java.time.Instant;
import java.util.Arrays;
import java.util.Base64;
import java.util.TreeMap;
import java.util.TreeSet;

@Controller
@RequestMapping(path = "/admin")
public class AdminController {

    private final AdminService adminService;
    private final ProductsService productsService;

    public AdminController(AdminService adminService, ProductsService productsService) {
        this.adminService = adminService;
        this.productsService = productsService;
    }

    @GetMapping(value = "/products")
    public ModelAndView products(){
        return new ModelAndView(
                "/pages/admin/admin_products",
                new ModelMap()
                        .addAttribute("products", productsService.getAllProducts())
                        .addAttribute("productType", ProductsDto.builder().build()));
    }

    @GetMapping(value = "/customers")
    public ModelAndView customers(){
        return new ModelAndView("/pages/admin/admin_customers");
    }


    @PostMapping(value = "/add-customer")
    public RedirectView addNewCustomer(@ModelAttribute("response") ModelMap model,
                                       @RequestParam(value = "firstName") String firstName,
                                       @RequestParam(value = "lastName") String lastName,
                                       @RequestParam(value = "phone") String phone,
                                       @RequestParam(value = "email") String email,
                                       @RequestParam(value = "password") String pass,
                                       @RequestParam(value = "login") String login,
                                       @RequestParam(value = "taxId") String taxId,
                                       @RequestParam(value = "birthDate", required = false) String birthDate,
                                       @RequestParam(value = "passport", required = false) String passport) {

        adminService.addNewCustomer(
                CustomersDto.builder()
                .firstName(firstName)
                .lastName(lastName)
                .phone(phone)
                .email(email)
                .password(Arrays.toString(Base64.getEncoder().encode(pass.getBytes())))
                .login(login)
                .birthDate(Instant.parse(birthDate))
                .build());
        return new RedirectView("/customers");
    }

    @PostMapping("/add-product")
    public RedirectView addProduct(
                           @RequestParam(value = "name") String name,
                           @RequestParam(value = "quantity") String quantity,
                           @RequestParam(value = "price") String price,
                           @RequestParam(value = "vendorCode") String vendorCode,
                           @RequestParam(value = "supplier_id") String supplierId,
                           @RequestParam(value = "description") String description){
        adminService.addProduct(
                ProductsDto.builder()
                        .name(name)
                        .quantity(Double.parseDouble(quantity))
                        .price(new BigDecimal(price))
                        .vendorCode(vendorCode)
                        .description(description)
                        .build());
        return new RedirectView("/admin/products");
    }
}
