package com.example.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private Button btnAddProduct;
    private ArrayList<Products> productsList;
//    private AddProduct addProduct;
    private ProductsAdapter productsAdapter;
    private RecyclerView recyclerProducts;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        init();

        btnAddProduct.setOnClickListener(new btnAddProductListner());
    }

    private class btnAddProductListner implements View.OnClickListener{
        @Override
        public void onClick(View view) {
            Intent intent = new Intent(MainActivity.this, AddProduct.class);
            startActivity(intent);
            finish();
        }
    }

    private void init(){

        productsList = new ArrayList<>();

        productsList.add(new Products(01,"Cabinate",100,"Microsoft Cabinate"));
        productsList.add(new Products(02,"Keyboard",100,"Logitec Keyboard"));
        productsList.add(new Products(03,"Mouse",100,"Logitec Mouse"));
        productsList.add(new Products(04,"PenTab",100,"iBall Cabinate"));


        btnAddProduct = findViewById(R.id.btnAddProduct);
        recyclerProducts = findViewById(R.id.recyclerProducts);
        recyclerProducts.setLayoutManager(
                new LinearLayoutManager(
                this,
                RecyclerView.VERTICAL,
                false
        ));

        productsAdapter = new ProductsAdapter(productsList);
        recyclerProducts.setAdapter(productsAdapter);
    }
}