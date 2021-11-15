package com.rr.collections.uiservice.controllers;

import com.rr.collections.uiservice.model.Customer;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class HomeController {

    @GetMapping("/")
    public String getHomePage(Model model) {
        return "index";
    }

    @GetMapping("/signUp")
    public String signUp(Model model) {
        Customer newCustomer = new Customer();
        model.addAttribute("newCustomer", newCustomer);
        return "customer_registration";
    }

    @PostMapping("/registerCustomer")
    public String registerCustomer(@ModelAttribute("newCustomer") Customer customer) {
        //call central service here
        if(null != customer) {
            System.out.println("Customer " + customer);
        }
        return "customer_registration_success";
    }
}
