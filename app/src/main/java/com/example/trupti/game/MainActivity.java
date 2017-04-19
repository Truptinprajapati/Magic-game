package com.example.trupti.game;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button bn1=(Button)findViewById(R.id.android);
        Button bn2=(Button)findViewById(R.id.apple);
        Button bn3=(Button)findViewById(R.id.lg);
        Button bn4=(Button)findViewById(R.id.gionee);






        bn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i=new Intent(MainActivity.this,Second.class);


                i.putExtra("temp1", "Apple");
                i.putExtra("temp2", "LG");
                i.putExtra("temp3", "Gionee");
                startActivity(i);
            }
        });

        bn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i=new Intent(MainActivity.this,Second.class);

                i.putExtra("temp1", "Android");
                i.putExtra("temp2", "LG");
                i.putExtra("temp3", "Gionee");
                startActivity(i);

            }
        });


        bn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(MainActivity.this,Second.class);

                i.putExtra("temp1", "Android");
                i.putExtra("temp2", "Apple");
                i.putExtra("temp3", "Gionee");
                startActivity(i);

            }
        });
        bn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(MainActivity.this,Second.class);
                i.putExtra("temp1", "Android");
                i.putExtra("temp2", "Apple");
                i.putExtra("temp3", "LG");
                startActivity(i);

            }
        });
    }
}
