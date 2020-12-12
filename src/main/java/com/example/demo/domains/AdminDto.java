package com.example.demo.domains;

import org.springframework.stereotype.Component;

import lombok.Data;

@Component @Data 
public class AdminDto {
    private String itemTitle, itemInfo, price, paidMember, freeMember, paidDate, help;
}
