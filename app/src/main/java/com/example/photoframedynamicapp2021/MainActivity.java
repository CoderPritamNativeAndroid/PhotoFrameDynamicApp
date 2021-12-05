package com.example.photoframedynamicapp2021;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    int[] arr1 = {R.drawable.image1, R.drawable.image2, R.drawable.image3, R.drawable.image4, R.drawable.image5};
    int i = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ((ImageView) findViewById(R.id.imageView)).setImageResource(R.drawable.image1);
        findViewById(R.id.button).setOnClickListener(new View.OnClickListener() { //it is PREVIOUS-button
            @Override
            public void onClick(View view) {
                try {
                    i--;
                    ((ImageView) findViewById(R.id.imageView)).setImageResource(arr1[i]);
                } catch (Exception e) {
                    i = 0;
                    Toast.makeText(MainActivity.this, "No PREVIOUS image Found", Toast.LENGTH_SHORT).show();
                }
            }
        });
        findViewById(R.id.button2).setOnClickListener(new View.OnClickListener() { //it is NEXT-button2
            @Override
            public void onClick(View view) {
                try {
                    i++;
                    ((ImageView) findViewById(R.id.imageView)).setImageResource(arr1[i]);
                } catch (Exception e) {
                    i = 4;
                    Toast.makeText(MainActivity.this, "No NEXT image Found", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
