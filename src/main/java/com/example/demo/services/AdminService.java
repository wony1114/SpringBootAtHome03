package com.example.demo.services;

import java.util.List;

import com.example.demo.domains.AdminDto;

import org.springframework.stereotype.Component;

@Component
public interface AdminService {

	public int itemTitle();

	public  int crawling(String string);

	public List<AdminDto> pay();

}
