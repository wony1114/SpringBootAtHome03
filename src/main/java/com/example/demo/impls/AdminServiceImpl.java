package com.example.demo.impls;

import com.example.demo.domains.AdminDto;
import com.example.demo.repositories.AdminRepository;
import com.example.demo.services.AdminService;
import com.example.demo.utils.Box;
import com.example.demo.utils.Crawler;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class AdminServiceImpl implements AdminService{
    @Autowired AdminRepository adminRepository;
    @Autowired Crawler crawler;
    @Autowired AdminDto admin;

    @Override
    public Object itemTitle() {
        
        return null;
    }

    @Override
    public Object crawling(String string) {
       
        return null;
    }
  
    
}
