package com.example.informationbook;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
Toolbar toolbar;
CardView cardCountries, cardLeaders, cardMuseums, cardWonders;
ImageView imageCountries, imageLeaders, imageMuseums, imageWonders;
TextView textCountries, textLeaders, textMuseums, textWonders;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        addControls();
        addEvents();
    }
    private void addControls(){
        toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar); // Đặt toolbar làm ActionBar

        cardCountries = findViewById(R.id.cardCountries);
        cardLeaders = findViewById(R.id.cardLeaders);
        cardMuseums = findViewById(R.id.cardMuseums);
        cardWonders = findViewById(R.id.cardWonders);

        imageCountries = findViewById(R.id.imageCountries);
        imageLeaders = findViewById(R.id.imageLeaders);
        imageMuseums = findViewById(R.id.imageMuseums);
        imageWonders = findViewById(R.id.imageWonders);

        textCountries = findViewById(R.id.textCountries);
        textLeaders = findViewById(R.id.textLeaders);
        textMuseums = findViewById(R.id.textMuseums);
        textWonders = findViewById(R.id.textWonders);
    }

    private void addEvents()
    {
        cardCountries.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, CountriesActivity.class);
                startActivity(intent);
            }
        });

        cardLeaders.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, LeadersActivity.class);
                startActivity(intent);
            }
        });

        cardMuseums.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, MuseumsActivity.class);
                startActivity(intent);
            }
        });

        cardWonders.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, SevenWondersActivity.class);
                startActivity(intent);
            }
        });
    }
}