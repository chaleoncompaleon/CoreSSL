package com.ssl.coressl;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class pilihkelasipa extends AppCompatActivity {
    public Context context;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pilihkelasipa);

        //inisial
//        Button btnipa4 = findViewById(R.id.bKelas4Ipa);
        context=this;

        //set onclick
//        btnipa4.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                context.startActivity(new Intent(context,engkelas4.class));
//            }
//        });
    }

}
