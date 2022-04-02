package com.example.recyclerview;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class ProductsAdapter extends RecyclerView.Adapter<ProductsAdapter.ProductHolder> {

    private ArrayList<Products> productsList;

    public ProductsAdapter (ArrayList<Products> products){
        this.productsList = products;
    }

    class ProductHolder extends RecyclerView.ViewHolder{

        public TextView txtProductNumber, txtProductTitle;

        public  ProductHolder(View itemView){
            super(itemView);

            txtProductNumber = itemView.findViewById(R.id.txtProductNumber);
            txtProductTitle = itemView.findViewById(R.id.txtProductTitle);
        }
    }

    @Override
    public int getItemCount() {

        if(productsList==null){
        return 0;
        }
        return productsList.size();
    }

    @NonNull
    @Override
    public ProductHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

//        LinearLayout linearLayout = new LinearLayout(parent.getContext());
//        linearLayout.setLayoutParams(new ViewGroup.LayoutParams(
//                ViewGroup.LayoutParams.MATCH_PARENT,
//                ViewGroup.LayoutParams.WRAP_CONTENT));
//
//        TextView textView1 = new TextView(parent.getContext());
//        textView1.setLayoutParams(
//                new ViewGroup.LayoutParams(
//                        ViewGroup.LayoutParams.WRAP_CONTENT,
//                        ViewGroup.LayoutParams.WRAP_CONTENT
//                ));
//        textView1.setTextSize(20);
//        textView1.setPadding(20,5,10,5);

        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.products_container, null);

        return new ProductHolder(view);

    }

    @Override
    public void onBindViewHolder(@NonNull ProductHolder holder, int position) {
        Products products = productsList.get(position);
        holder.txtProductNumber.setText(products.getProductNumber());
        holder.txtProductTitle.setText(products.getProductTitle());
    }
}
