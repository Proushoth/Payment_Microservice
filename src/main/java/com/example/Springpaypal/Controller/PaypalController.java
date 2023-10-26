package com.example.Springpaypal.Controller;

import com.example.Springpaypal.Data.Order;
import com.example.Springpaypal.Service.PaypalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

@Controller
public class PaypalController {

    @Autowired
    PaypalService paypalService;

    @GetMapping
    public String home(){
        return "home";
    }

    public String payment (@ModelAttribute("order")Order order){
        paypalService.createPayment(order.getPrice(), order.getMethod(), )
    }
}
