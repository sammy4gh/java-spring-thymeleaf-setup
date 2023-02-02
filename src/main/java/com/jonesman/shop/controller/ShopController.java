package com.jonesman.shop.controller;

import org.springframework.web.bind.annotation.GetMapping;

public class ShopController {

    @GetMapping("/")
        public String showHomePage(){
            return "index";
        }


}
