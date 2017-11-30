package com.ssl.coressl;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class mainMenu extends AppCompatActivity {
public Context context;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.content_main_menu);

        Button btnindo = findViewById(R.id.bIndo);
        Button btnipa = findViewById(R.id.bIPA);
        Button btneng = findViewById(R.id.bEnglish);
        context=this;

        btnindo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onClickIndo(view);
            }
        });
        btnipa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
           onClikIpa(view);
            }
        });
        btneng.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onClickEng(view);
            }
        });


    }

    void onClickIndo(View view){
        startActivity(new Intent(this,pilihkelasindo.class));

    }
    void onClikIpa (View view){
        startActivity(new Intent(context,pilihkelasipa.class));
    }

    void onClickEng (View view){
        startActivity(new Intent(context,pilihkelaseng.class));
    }
}



