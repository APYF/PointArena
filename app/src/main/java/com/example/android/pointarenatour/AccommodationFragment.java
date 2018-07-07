package com.example.android.pointarenatour;

import android.content.res.Resources;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

public class AccommodationFragment extends Fragment {


    public AccommodationFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.attractions_list, container, false);

        super.onCreate(savedInstanceState);

        final ArrayList<Attraction> attractions = new ArrayList<Attraction>();

        Resources res = getResources();

        String listingStrings1[] = res. getStringArray(R.array.accomodations_1);
        attractions.add(new Attraction(listingStrings1[0], listingStrings1[1], listingStrings1[2]));

        String listingStrings2[] = res. getStringArray(R.array.accomodations_2);
        attractions.add(new Attraction(listingStrings2[0], listingStrings2[1], listingStrings2[2]));

        String listingStrings3[] = res. getStringArray(R.array.accomodations_3);
        attractions.add(new Attraction(listingStrings3[0], listingStrings3[1], listingStrings3[2]));

        String listingStrings4[] = res. getStringArray(R.array.accomodations_4);
        attractions.add(new Attraction(listingStrings4[0], listingStrings4[1], listingStrings4[2]));

        String listingStrings5[] = res. getStringArray(R.array.accomodations_5);
        attractions.add(new Attraction(listingStrings5[0], listingStrings5[1], listingStrings5[2]));
        
        AttractionAdapter attractionAdapter = new AttractionAdapter(getActivity(), attractions);

        ListView listView = (ListView) rootView.findViewById(R.id.list);
        listView.setAdapter(attractionAdapter);

        return rootView;
    }

}
