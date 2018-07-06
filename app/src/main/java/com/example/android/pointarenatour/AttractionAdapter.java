package com.example.android.pointarenatour;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ActionMenuView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class AttractionAdapter extends ArrayAdapter<Attraction> {

    public AttractionAdapter(Activity context, ArrayList<Attraction> attractions) {
        super(context, 0, attractions);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listItemView = convertView;

        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        Attraction currentAttraction = getItem(position);

        TextView attractionNameTextView = (TextView) listItemView.findViewById(R.id.attraction_name);
        attractionNameTextView.setText(currentAttraction.getAttractionName());

        TextView attractionAddressTextView = (TextView) listItemView.findViewById(R.id.attraction_address);
        attractionAddressTextView.setText(currentAttraction.getAttractionAddress());

        TextView attractionDescriptionTextView = (TextView) listItemView.findViewById(R.id.attraction_description);
        attractionDescriptionTextView.setText(currentAttraction.getAttractionDescription());

        ImageView attractionImageView = (ImageView) listItemView.findViewById(R.id.attraction_image);
        if (currentAttraction.hasImage()) {
            attractionImageView.setImageResource(currentAttraction.getAttractionImageResource());
        }
        else {
            attractionImageView.setVisibility(View.GONE);
        }

        return listItemView;
    }
}
