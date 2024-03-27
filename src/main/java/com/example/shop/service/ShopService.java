package com.example.shop.service;

import com.example.shop.entity.Shop;
import com.github.pagehelper.PageInfo;
import org.apache.ibatis.annotations.Mapper;

public interface ShopService {
    public PageInfo<Shop> selectShop(int page, int count, Shop shop);
}
