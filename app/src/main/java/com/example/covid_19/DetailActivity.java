package com.example.covid_19;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity {

    private int positionCountry;
    TextView tvCountry,tvCases,tvRecovered,tvCritical,tvActive,tvTodayCases,tvTotalDeaths,tvTodayDeaths;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        Intent intent = getIntent();
        positionCountry = intent.getIntExtra("position",0);

        getSupportActionBar().setTitle(AffectedCountriesActivity.countryModelList.get(positionCountry).getCountry());
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        tvCountry = findViewById(R.id.tvCountryN);
        tvCases = findViewById(R.id.tvCases);
        tvRecovered = findViewById(R.id.tvRecovered);
        tvCritical = findViewById(R.id.tvCritical);
        tvActive = findViewById(R.id.tvActive);
        tvTodayCases = findViewById(R.id.tvTodayCases);
        tvTotalDeaths = findViewById(R.id.tvDeath);
        tvTodayDeaths = findViewById(R.id.tvTodayDeaths);

        tvCountry.setText(AffectedCountriesActivity.countryModelList.get(positionCountry).getCountry());
        tvCases.setText(AffectedCountriesActivity.countryModelList.get(positionCountry).getCases());
        tvRecovered.setText(AffectedCountriesActivity.countryModelList.get(positionCountry).getRecovered());
        tvCritical.setText(AffectedCountriesActivity.countryModelList.get(positionCountry).getCritical());
        tvActive.setText(AffectedCountriesActivity.countryModelList.get(positionCountry).getActive());
        tvTodayCases.setText(AffectedCountriesActivity.countryModelList.get(positionCountry).getTodayCases());
        tvTotalDeaths.setText(AffectedCountriesActivity.countryModelList.get(positionCountry).getDeaths());
        tvTodayDeaths.setText(AffectedCountriesActivity.countryModelList.get(positionCountry).getTodayDeaths());

    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if (item.getItemId() == android.R.id.home)
            finish();
        return super.onOptionsItemSelected(item);
    }
}