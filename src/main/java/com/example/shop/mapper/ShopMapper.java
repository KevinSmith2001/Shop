package com.example.shop.mapper;

import com.example.shop.entity.Shop;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ShopMapper {
    public List<Shop> selectShop(Shop shop);
}
