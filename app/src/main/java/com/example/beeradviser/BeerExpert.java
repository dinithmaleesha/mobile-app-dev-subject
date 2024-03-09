package com.example.beeradviser;

import java.util.ArrayList;
import java.util.List;

public class BeerExpert {
    List<String> getBrand(String spinner){
        List<String> brand = new ArrayList<String>();

        if(spinner.equals("Amber")){
            brand.add("Jack Amber");
            brand.add("Red Rose");
        } else if (spinner.equals("Light")){
            brand.add("Light Beer 01");
            brand.add("Light Beer 02");
        } else if (spinner.equals("Beer")) {
            brand.add("Beer 01");
            brand.add("Beer 02");
        }

        return brand;
    }
}
