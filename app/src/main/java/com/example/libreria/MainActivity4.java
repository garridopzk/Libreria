package com.example.libreria;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;
import java.util.List;

public class MainActivity4 extends AppCompatActivity {
    ImageButton lavueltaalmundoen80dias;
    ImageButton viajealcentrodelatierra;
    ImageButton delatierraalaluna;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main4);

        lavueltaalmundoen80dias = findViewById(R.id.lavueltaalmundoen80dias);
        viajealcentrodelatierra = findViewById(R.id.viajealcentrodelatierra);
        delatierraalaluna = findViewById(R.id.delatierraalaluna);

        lavueltaalmundoen80dias.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity4.this, MainActivity4.class);
                startActivity(intent);
            }
        });
        viajealcentrodelatierra.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity4.this, MainActivity4.class);
                startActivity(intent);
            }
        });
        delatierraalaluna.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity4.this, MainActivity4.class);
                startActivity(intent);
            }
        });
    }
}