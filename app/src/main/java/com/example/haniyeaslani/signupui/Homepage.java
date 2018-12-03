package com.example.haniyeaslani.signupui;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Homepage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_homepage);


        Intent intent=getIntent();
        String name=intent.getStringExtra("nameContent");
        String family=intent.getStringExtra("familyContent");
        String age=intent.getStringExtra("ageContent");
        String email=intent.getStringExtra("emailContent");
        String phone=intent.getStringExtra("phoneContent");

        TextView textViewname=(TextView) findViewById(R.id.txtName);
        TextView textViewage=(TextView) findViewById(R.id.txtage);
        TextView textViewemail=(TextView) findViewById(R.id.txtemail);
        TextView textViewphone=(TextView) findViewById(R.id.txtphone);

        textViewname.setText("Hi"+" "+name+family+" "+"!");
        textViewage.setText("your age is : "+age);
        textViewemail.setText("your email is : "+email);
        textViewphone.setText("your phone number is : "+phone);

    }
}
