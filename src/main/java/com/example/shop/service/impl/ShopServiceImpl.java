package com.example.shop.service.impl;

import com.example.shop.entity.Shop;
import com.example.shop.mapper.ShopMapper;
import com.example.shop.service.ShopService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class ShopServiceImpl implements ShopService {
    @Autowired
    private ShopMapper shopMapper;
    @Override
    public PageInfo<Shop> selectShop(int page,int count,Shop shop){
        PageHelper.startPage(page,count);
        List<Shop> list = shopMapper.selectShop(shop);
        System.out.println(list);
        PageInfo<Shop> shopPageInfo = new PageInfo<>(list);
        System.out.println("=====");
        System.out.println(shopPageInfo);
        return shopPageInfo;
    }

}
