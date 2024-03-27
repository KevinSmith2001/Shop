package com.example.shop.controller;

import com.example.shop.entity.Shop;
import com.example.shop.service.ShopService;
import com.github.pagehelper.PageInfo;
import com.sun.org.apache.xpath.internal.operations.Mod;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ShopController {
    @Autowired
    private ShopService shopService;
    @GetMapping("/")
    public String getArticleList(@RequestParam(value = "page",defaultValue = "1")int page,
                                 @RequestParam(value = "count",defaultValue = "10")int count,
                                 Shop shop,
                                 Model model){
        PageInfo<Shop> shopPageInfo=shopService.selectShop(page,count,shop);
        model.addAttribute("shops",shopPageInfo);
        return "index";
    }
}
