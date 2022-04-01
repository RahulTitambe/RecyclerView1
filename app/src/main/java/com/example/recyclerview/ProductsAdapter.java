package com.example.recyclerview;

import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class ProductsAdapter extends RecyclerView.Adapter<ProductsAdapter.ProductHolder> {

    private ArrayList<String> productsList;

    public ProductsAdapter (ArrayList<String> products){
        this.productsList = products;
    }

    class ProductHolder extends RecyclerView.ViewHolder{

        TextView productTitle;

        public  ProductHolder(View itemView){
            super(itemView);
            this.productTitle = (TextView) itemView;
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

        TextView textView1 = new TextView(parent.getContext());
        textView1.setLayoutParams(
                new ViewGroup.LayoutParams(
                        ViewGroup.LayoutParams.WRAP_CONTENT,
                        ViewGroup.LayoutParams.WRAP_CONTENT
                ));
        textView1.setTextSize(15);
//        textView1.setPadding(10,5,10,5);
//        textView1.setTextColor(000000);

        return new ProductHolder(textView1);

    }

    @Override
    public void onBindViewHolder(@NonNull ProductHolder holder, int position) {
        holder.productTitle.setText(productsList.get(position));
    }
}
