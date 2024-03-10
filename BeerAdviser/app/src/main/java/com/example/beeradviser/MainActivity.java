package com.example.beeradviser;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    private BeerExpert expert = new BeerExpert();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClickFindBeer(View view) {
        TextView brands = (TextView) findViewById(R.id.brands);
        brands.setText("Gottle of Geer");

        Spinner spinner = (Spinner) findViewById(R.id.spinner);
        String beerType = String.valueOf(spinner.getSelectedItem());
        brands.setText(beerType);

        List<String> brandList = expert.getBrand(beerType);
        StringBuilder brandFormatter = new StringBuilder();

        for(String brand : brandList){
            brandFormatter.append(brand).append('\n');
        }
        brands.setText(brandFormatter);
    }
}