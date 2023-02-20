package com.example.counteractivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private int count = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView num = (TextView)findViewById(R.id.num);
        Button btncup = (Button)findViewById(R.id.btncup);
        Button btncdown = (Button)findViewById(R.id.btncdown);

        btncup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                count++;
                num.setText(Integer.toString(count));
                Toast.makeText(MainActivity.this, "Count Up", Toast.LENGTH_SHORT).show();
            }
        });

        btncdown.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                count--;
                num.setText(Integer.toString(count));
                Toast.makeText(MainActivity.this, "Count Down", Toast.LENGTH_SHORT).show();
            }
        });
    }

}