package com.example.afinal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class notification extends AppCompatActivity {

    Button b;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notification);
        b=(Button)findViewById(R.id.button);
        if(getIntent().hasExtra("win"))
        {
            EditText t=(EditText)findViewById(R.id.editText);
            String str=(getIntent().getExtras().getString("win"));
            if(str.equals("X"))
                t.setText("PLAYER1 (X) WON");
            else
                t.setText("PLAYER2 (0) WON");
        }
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i2=new Intent(notification.this,MainActivity.class);
                startActivity(i2);
            }
        });
    }
}
