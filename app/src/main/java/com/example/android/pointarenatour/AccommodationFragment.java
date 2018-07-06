package com.example.android.pointarenatour;

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

        attractions.add(new Attraction("Buckridge Grove", "12 Addrsess drive", "Campsite"));
        attractions.add(new Attraction("Wildflower", "160 Main Street", "Sustainable boutique motel, wifi & breakfast"));

        AttractionAdapter attractionAdapter = new AttractionAdapter(getActivity(), attractions);

        ListView listView = (ListView) rootView.findViewById(R.id.list);
        listView.setAdapter(attractionAdapter);

        return rootView;
    }
}
