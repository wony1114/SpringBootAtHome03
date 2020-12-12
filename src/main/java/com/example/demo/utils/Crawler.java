package com.example.demo.utils;

import com.example.demo.domains.AdminDto;
import org.jsoup.nodes.Document;
import org.jsoup.Jsoup;

import org.jsoup.select.Elements;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
@Component
public class Crawler extends Proxy{
    @Autowired AdminDto admin;
    @Autowired Box<AdminDto> adminBox;
    public Box<AdminDto> crawling(String url){
        try{
            Document rawData = Jsoup.connect(url).timeout(10*100).get();
            Elements itemTitles =  rawData.select("a[class=title]");
            Elements itemInfo = rawData.select("aside[class=text]");
            Elements price = rawData.select("aside[class=sale_price]");
            for(int i=0; i<itemTitles.size(); i++){
                admin = new AdminDto();
                admin.setItemTitle(itemTitles.get(i).text());
                admin.setItemInfo(itemInfo.get(i).text());
                admin.setPrice(price.get(i).text());
                adminBox.add(admin);
            }
        }catch(Exception e){
            e.printStackTrace();
        }
        return adminBox;
    }
}
