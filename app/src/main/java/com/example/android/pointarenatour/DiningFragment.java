package com.example.android.pointarenatour;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

public class DiningFragment extends Fragment {

    public DiningFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.attractions_list, container, false);

        super.onCreate(savedInstanceState);

        final ArrayList<Attraction> attractions = new ArrayList<Attraction>();

        attractions.add(new Attraction("215  Main", "215 Main St., Point Arena, CA 95468", "Friendly pub serving beer, wine, champagne, port & food."));
        attractions.add(new Attraction("Arena Market & Cafe", "185 Main St., Point Arena, CA 95468", "Organic produce, grocery, soup & salad bar, barista & wifi"));
        attractions.add(new Attraction("Bird Cafe & Supper Cafe", "192 Main St., Point Arena, CA 95468", "Food for the flock - seasonal & locally sourced cuisine."));
        attractions.add(new Attraction("Cove Coffee", "Arena Cove", "Coffee, sandwiches, smoothies, gifts & bait."));
        attractions.add(new Attraction("Fanny's Cup & Saucer", "213 Main St., Point Arena, CA 95468", "Exotic pastries & unusual ephemera."));
        attractions.add(new Attraction("River Grill Restaurant", "22215 Windy Hollow Drive, Point Arena, CA 95468", "Food, wine at beer at the Garcia River Casino"));
        attractions.add(new Attraction("Point Arena General Store", "187 Main St., Point Arena, CA 95468", "Groceries, deli, meats, beer, wine, pizza, ice & bait."));
        attractions.add(new Attraction("Rollerville Cafe", "22900 Hwy 1 North", "Breakfast & Lunch daily."));


        AttractionAdapter attractionAdapter = new AttractionAdapter(getActivity(), attractions);

        ListView listView = (ListView) rootView.findViewById(R.id.list);
        listView.setAdapter(attractionAdapter);

        return rootView;
    }

}
