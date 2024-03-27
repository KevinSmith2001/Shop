package com.example.shop.entity;
public class Shop {
    private String goodsId;
    private Integer cateId;
    private String goodsName;
    private String goodsDisc;
    private Integer goodsPrice;
    private Integer goodsDiscount;
    private Integer goodsStock;
    private String goodsOrigin;
    private String goodsMaterial;
    private String goodsPostalfee;
    private String goodsDate;
    private String goodsSales;
    private String goodsPic;

    public String getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(String goodsId) {
        this.goodsId = goodsId;
    }

    public Integer getCateId() {
        return cateId;
    }

    public void setCateId(Integer cateId) {
        this.cateId = cateId;
    }

    public String getGoodsName() {
        return goodsName;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName;
    }

    public String getGoodsDisc() {
        return goodsDisc;
    }

    public void setGoodsDisc(String goodsDisc) {
        this.goodsDisc = goodsDisc;
    }

    public Integer getGoodsPrice() {
        return goodsPrice;
    }

    public void setGoodsPrice(Integer goodsPrice) {
        this.goodsPrice = goodsPrice;
    }

    public Integer getGoodsDiscount() {
        return goodsDiscount;
    }

    public void setGoodsDiscount(Integer goodsDiscount) {
        this.goodsDiscount = goodsDiscount;
    }

    public Integer getGoodsStock() {
        return goodsStock;
    }

    public void setGoodsStock(Integer goodsStock) {
        this.goodsStock = goodsStock;
    }

    public String getGoodsOrigin() {
        return goodsOrigin;
    }

    public void setGoodsOrigin(String goodsOrigin) {
        this.goodsOrigin = goodsOrigin;
    }

    public String getGoodsMaterial() {
        return goodsMaterial;
    }

    public void setGoodsMaterial(String goodsMaterial) {
        this.goodsMaterial = goodsMaterial;
    }

    public String getGoodsPostalfee() {
        return goodsPostalfee;
    }

    public void setGoodsPostalfee(String goodsPostalfee) {
        this.goodsPostalfee = goodsPostalfee;
    }

    public String getGoodsDate() {
        return goodsDate;
    }

    public void setGoodsDate(String goodsDate) {
        this.goodsDate = goodsDate;
    }

    public String getGoodsSales() {
        return goodsSales;
    }

    public void setGoodsSales(String goodsSales) {
        this.goodsSales = goodsSales;
    }

    public String getGoodsPic() {
        return goodsPic;
    }

    public void setGoodsPic(String goodsPic) {
        this.goodsPic = goodsPic;
    }

    @Override
    public String toString() {
        return "Shop{" +
                "goodsId='" + goodsId + '\'' +
                ", cateId='" + cateId + '\'' +
                ", goodsName='" + goodsName + '\'' +
                ", goodsDisc='" + goodsDisc + '\'' +
                ", goodsPrice='" + goodsPrice + '\'' +
                ", goodsDiscount='" + goodsDiscount + '\'' +
                ", goodsStock='" + goodsStock + '\'' +
                ", goodsOrigin='" + goodsOrigin + '\'' +
                ", goodsMaterial='" + goodsMaterial + '\'' +
                ", goodsPostalfee='" + goodsPostalfee + '\'' +
                ", goodsDate='" + goodsDate + '\'' +
                ", goodsSales='" + goodsSales + '\'' +
                ", goodsPic='" + goodsPic + '\'' +
                '}';
    }
}
