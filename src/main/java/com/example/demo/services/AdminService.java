package com.example.demo.services;

import org.springframework.stereotype.Component;

@Component
public interface AdminService {

	public Object itemTitle();

	public Object crawling(String url);

}
