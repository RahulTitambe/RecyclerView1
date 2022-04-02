package com.example.recyclerview;

import java.io.Serializable;

public class Products implements Serializable {
    int productNumber;
    String productTitle;
    int productStock;
    String productDescription;

    public int getProductNumber() {
        return productNumber;
    }

    public void setProductNumber(int productNumber) {
        this.productNumber = productNumber;
    }

    public String getProductTitle() {
        return productTitle;
    }

    public void setProductTitle(String productTitle) {
        this.productTitle = productTitle;
    }

    public int getProductStock() {
        return productStock;
    }

    public void setProductStock(int productStock) {
        this.productStock = productStock;
    }

    public String getProductDescription() {
        return productDescription;
    }

    public void setProductDescription(String productDescription) {
        this.productDescription = productDescription;
    }

    public Products(int productNumer, String productTitle, int productStock, String productDescription) {
        this.productNumber = productNumer;
        this.productTitle = productTitle;
        this.productStock = productStock;
        this.productDescription = productDescription;
    }
}
