package com.example.android.pointarenatour;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

public class SightsFragment extends Fragment {

    public SightsFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.attractions_list, container, false);

        super.onCreate(savedInstanceState);

        final ArrayList<Attraction> attractions = new ArrayList<Attraction>();

        attractions.add(new Attraction("Point Arena-Stornetta Unit of the California Coastal National Monument", "Take the trail behind City Hall or head out on Lighthoue Road", "Head out for a bluff trail or meander into the beach cove"));
        attractions.add(new Attraction("Manchester Beach", "Access via Stonesboro Road in Manchester", "5 mile beach. Beautiful hiking & camping."));
        attractions.add(new Attraction("Arena Cove & Point Arena City Pier", "810 Port Rd, Point Arena, CA 95468", "Boat launch, hot showers, fishing, recycling drop-off."));
        attractions.add(new Attraction("Pelican Bluffs Trail", "Between mile-marker 14.3 & 13.5 (1 mile south of Point Arena)", "Bluff trails showcase a forsest of Bishops pines & our stunning white cliffs"));
        attractions.add(new Attraction("Bowling Ball Beach & Schooner Gulch", "Mile marker 11.41 (south of Point Arena)", "It is named for the spherical sandstone concretions found there at low tide."));

        AttractionAdapter attractionAdapter = new AttractionAdapter(getActivity(), attractions);

        ListView listView = (ListView) rootView.findViewById(R.id.list);
        listView.setAdapter(attractionAdapter);

        return rootView;
    }

}
