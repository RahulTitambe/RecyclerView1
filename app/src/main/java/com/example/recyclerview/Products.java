package com.example.recyclerview;

public class Products {
    int productNumer;
    String productTitle;
    int productStock;
    String productDescription;

    public int getProductNumer() {
        return productNumer;
    }

    public void setProductNumer(int productNumer) {
        this.productNumer = productNumer;
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
        this.productNumer = productNumer;
        this.productTitle = productTitle;
        this.productStock = productStock;
        this.productDescription = productDescription;
    }
}
