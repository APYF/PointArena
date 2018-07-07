package com.example.android.pointarenatour;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

public class ShoppingFragment extends Fragment {

    public ShoppingFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.attractions_list, container, false);

        super.onCreate(savedInstanceState);

        final ArrayList<Attraction> attractions = new ArrayList<Attraction>();

        attractions.add(new Attraction("Outback Garden & Feed", "240 Main St., Point Arena, CA 95468", "Garden Nursery, feed &  pet supplies."));
        attractions.add(new Attraction("Point Arena Tileworks", "80 Main St., Point Arena, CA 95468", "Handmade tiles. 1000's on display."));
        attractions.add(new Attraction("Arena Pharmacy", "235 Main St., Point Arena, CA 95468", "Prescription, over the counter remedies, sundries, gifts & cards."));
        attractions.add(new Attraction("Coast Highway Art Collective", "284 Main St., Point Arena, CA 95468", "Fine art and gifts made by local artists."));
        attractions.add(new Attraction("The Green Room", "138 Main St., Point Arena, CA 95468", "Cannabis dispensary & accessories."));

        AttractionAdapter attractionAdapter = new AttractionAdapter(getActivity(), attractions);

        ListView listView = (ListView) rootView.findViewById(R.id.list);
        listView.setAdapter(attractionAdapter);

        return rootView;
    }

}
