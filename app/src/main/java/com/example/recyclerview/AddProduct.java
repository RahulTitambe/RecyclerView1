package com.example.recyclerview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class AddProduct extends AppCompatActivity {

    private EditText edtProductNumber, edtProductTitle, edtProductStock, edtProductDescription;
    private Button btnSave;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.add_product);

        init();

        btnSave.setOnClickListener(new btnSaveListner());
    }

    private class btnSaveListner implements View.OnClickListener{
        @Override
        public void onClick(View view) {



            if(TextUtils.isEmpty(edtProductNumber.getText().toString()) ||
                    TextUtils.isEmpty(edtProductTitle.getText().toString()) ||
                    TextUtils.isEmpty(edtProductStock.getText().toString()) ||
                    TextUtils.isEmpty(edtProductDescription.getText().toString()))
            {

                Toast.makeText(AddProduct.this,
                        "Please enter valid input",
                        Toast.LENGTH_LONG).show();
            }

            else {
                Intent intent = new Intent(AddProduct.this, MainActivity.class);
                startActivity(intent);
                finish();
            }
        }
    }

    private void init(){
        edtProductNumber = findViewById(R.id.edtProductNumber);
        edtProductTitle = findViewById(R.id.edtTitle);
        edtProductStock = findViewById(R.id.edtStock);
        edtProductDescription = findViewById(R.id.edtDescription);
        btnSave = findViewById(R.id.btnSave);
    }
}