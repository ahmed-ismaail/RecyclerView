package com.example.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<String> countriesList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setCountries();
    }

    private void setCountries() {
        countriesList.add("Paris");
        countriesList.add("Afghanistan");
        countriesList.add("Albania");
        countriesList.add("Algeria");
        countriesList.add("Andorra");
        countriesList.add("Angola");
        countriesList.add("Antigua and Barbuda");
        countriesList.add("Argentina");
        countriesList.add("Armenia");
        countriesList.add("Australia");
        countriesList.add("Austria");
        countriesList.add("Azerbaijan");
        countriesList.add("The Bahamas");
        countriesList.add("Bahrain");
        countriesList.add("Bangladesh");
        countriesList.add("Barbados");
        countriesList.add("Belarus");
        countriesList.add("Belgium");
        countriesList.add("Belize");
        countriesList.add("Benin");
        countriesList.add("Bhutan");
        countriesList.add("Bolivia");
        countriesList.add("Bosnia and Herzegovina");
        countriesList.add("Botswana");
        countriesList.add("Brazil");
        countriesList.add("Brunei");
        countriesList.add("Bulgaria");
        countriesList.add("Burkina Faso");
        countriesList.add("Burundi");
        countriesList.add("Cabo Verde");
        countriesList.add("Cambodia");
        countriesList.add("Cameroon");
        countriesList.add("Canada");
        countriesList.add("Central African Republic");
        countriesList.add("Chad");
        countriesList.add("Chile");
        countriesList.add("China");
        countriesList.add("Colombia");
        countriesList.add("Comoros");
        countriesList.add("Congo, Democratic Republic of the  ");
        countriesList.add("Congo, Republic of the ");
        countriesList.add("Costa Rica");
        countriesList.add("Côte d’Ivoire");
        countriesList.add("Croatia");
        countriesList.add("Cuba");
        countriesList.add("Cyprus");
        countriesList.add("Czech Republic ");
        countriesList.add("Denmark");
        countriesList.add("Djibouti");
        countriesList.add("Dominica");
        countriesList.add("Dominican Republic");
        countriesList.add("East Timor (Timor - Leste)");
        countriesList.add("Ecuador");
        countriesList.add("Egypt");
        countriesList.add("El Salvador");
        countriesList.add("Equatorial Guinea");
        countriesList.add("Eritrea");
        countriesList.add("Estonia");
        countriesList.add("Eswatini");
        countriesList.add("Ethiopia");

        setRecyclerView();
    }

    private void setRecyclerView(){
        RecyclerView recyclerView = findViewById(R.id.recyclerView);
        CountryListAdapter countryListAdapter = new CountryListAdapter(countriesList,this);
        recyclerView.setAdapter(countryListAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }
}
