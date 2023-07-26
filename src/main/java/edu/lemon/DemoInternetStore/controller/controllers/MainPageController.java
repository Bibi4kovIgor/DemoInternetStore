package edu.lemon.DemoInternetStore.controller.controllers;

import edu.lemon.DemoInternetStore.controller.services.CustomerService;
import edu.lemon.DemoInternetStore.model.dto.CustomerDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.Optional;

@Controller
public class MainPageController {
    @Autowired
    CustomerService customerService;
    @GetMapping(value = {"/", "/index", "/home"})
    public ModelAndView index(
            @ModelAttribute("response") ModelMap model,
            @RequestParam(value = "name", required = false) String name) {
        Optional<CustomerDto> customerDaoOptional = customerService.getUserInfoByName(name);
/*
        ResponseEntity<CustomerDto> response =
                customerDaoOptional.map(ResponseEntity::ok).orElse(ResponseEntity.notFound().build());
*/

        String responseString = customerDaoOptional.isEmpty()
                ? "User was not found"
                : customerDaoOptional.toString();
        model.addAttribute("responseString", responseString);
        return new ModelAndView("index", model);
    }

}
