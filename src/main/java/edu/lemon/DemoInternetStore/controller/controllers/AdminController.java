package edu.lemon.DemoInternetStore.controller.controllers;

import edu.lemon.DemoInternetStore.controller.services.AdminService;
import edu.lemon.DemoInternetStore.model.dto.CustomersDto;
import edu.lemon.DemoInternetStore.model.dto.ProductsDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;

import java.math.BigDecimal;
import java.time.Instant;
import java.util.Arrays;
import java.util.Base64;

@Controller
public class AdminController {

    @Autowired
    private AdminService adminService;


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
        return new RedirectView("/products");
    }
}
