package com.example.android.pointarenatour;

import android.content.Context;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class CategoryAdapter extends FragmentPagerAdapter {

    private Context mContext;

    public CategoryAdapter(Context context, FragmentManager fm) {

        super(fm);
        mContext = context;
    }

    @Override
    public Fragment getItem(int position) {
        if(position == 0) {
            return new SightsFragment();
        } else if (position == 1) {
            return new AccommodationFragment();
        } else if ( position == 2) {
            return new DiningFragment();
        } else {
            return new ShoppingFragment();
        }
    }

    @Override
    public int getCount() { return 4; }

    @Nullable
    @Override

    public CharSequence getPageTitle(int position) {
        if(position == 0) {
            return mContext.getString(R.string.category_sights);
        } else if (position == 1) {
            return mContext.getString(R.string.category_accommodation);
        } else if (position == 2) {
            return mContext.getString(R.string.category_dining);
        } else {
            return mContext.getString(R.string.category_retail);
        }

    }

}
