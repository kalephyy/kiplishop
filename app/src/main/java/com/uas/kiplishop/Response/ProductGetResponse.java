package com.uas.kiplishop.Response;

import com.uas.kiplishop.Model.ProductModel;

import java.util.List;

public class ProductGetResponse {
    private List<ProductModel> data;

    public ProductGetResponse(List<ProductModel> data) {
        this.data = data;
    }

    public List<ProductModel> getData() {
        return data;
    }

    public void setData(List<ProductModel> data) {
        this.data = data;
    }
}
