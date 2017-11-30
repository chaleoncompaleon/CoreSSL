package com.ssl.coressl;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class pilihkelaseng extends AppCompatActivity {
    public Context context;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pilihkelasipa);

        //inisial
        Button btneng4 = findViewById(R.id.bKelas4eng);
        context=this;

        //set onclick
        btneng4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                context.startActivity(new Intent(context,engkelas4.class));
            }
        });
    }

}
