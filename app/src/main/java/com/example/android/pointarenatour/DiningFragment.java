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

        attractions.add(new Attraction("Wharf Master's Inn", "785 Port Rd, Point Arena, CA 95468", "Ocean views,private balconies, fireplaces, Jacuzzi tubs."));
        attractions.add(new Attraction("Wildflower", "160 Main Street", "Sustainable boutique motel, wifi & breakfast"));
        attractions.add(new Attraction("Roseman Creek Ranch", "42450 Roseman Creek Rd, Gualala, CA 95445", "Off-grid permaculture farm, farm stays & camping."));
        attractions.add(new Attraction("Oz Farm & Retreat Center", "Mt. View Road", "7 cabins, Community CHoue & Geodesic Domes."));
        attractions.add(new Attraction("Coast Guard House Historic Inn & Cottages", "695 Arena Cv, Point Arena, CA 95468", "Private ocean-view cottage with fireplaces & whirlpool spas."));

        AttractionAdapter attractionAdapter = new AttractionAdapter(getActivity(), attractions);

        ListView listView = (ListView) rootView.findViewById(R.id.list);
        listView.setAdapter(attractionAdapter);

        return rootView;
    }

}
