package com.example.demo.controllers;

import java.util.Map;

import com.example.demo.services.AdminService;
import com.example.demo.utils.Proxy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AdminController {
    @Autowired Proxy px;

    


    @GetMapping("/admins/crawling/{site}")
    public Map<?, ?> crawling(@PathVariable String site){
        var map = px.hashmap();
        var itemTitle = AdminService.itemTitle();
        if(itemTitle == "EMPTY"){
           switch (site) {
               case "melon":
               map.put("itemTitle", AdminService.crawling("https://www.melon.com/buy/pamphlet/all.htm"));
                break;
           }  
        }else{
            map.put("itemTitle", itemTitle);            
        }
        return map;    
    }
}
