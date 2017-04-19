package com.example.trupti.game;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Three extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_three);

        final Bundle b=getIntent().getExtras();

        Button bn1=(Button)findViewById(R.id.lg);
        Button bn2=(Button)findViewById(R.id.gionee);


        bn1.setText(b.getString("temp1"));
        bn2.setText(b.getString("temp2"));

        bn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(Three.this,Four.class);
                i.putExtra("temp1", b.getString("temp2"));


                startActivity(i);

            }
        });
        bn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(Three.this,Four.class);

                i.putExtra("temp2", b.getString("temp1"));

                startActivity(i);

            }
        });

    }
}
