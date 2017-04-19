package com.example.trupti.game;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Four extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_four);

        final Bundle b=getIntent().getExtras();

        Button bn=(Button)findViewById(R.id.gionee);

        bn.setText(b.getString("temp1"));
        bn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(Four.this,MainActivity.class);
                i.putExtra("temp1",b.getString("temp2"));
                startActivity(i);
            }
        });

    }
}
