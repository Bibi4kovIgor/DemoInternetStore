package edu.lemon.DemoInternetStore.controller.controllers;

import edu.lemon.DemoInternetStore.controller.services.CustomerService;
import edu.lemon.DemoInternetStore.model.dao.CustomerDao;
import org.springframework.beans.factory.annotation.Autowired;
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
            @RequestParam("name") String name) {
        Optional<CustomerDao> customerDaoOptional = customerService.getUserInfoByName(name);
        String responseString = customerDaoOptional.isEmpty()
                ? "User was not found"
                : customerDaoOptional.get().toString();
        model.addAttribute("responseString", responseString);
        return new ModelAndView("index", model);
    }

}
