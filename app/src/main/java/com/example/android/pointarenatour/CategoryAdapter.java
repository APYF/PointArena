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
    public Fragment getItem(int postion) {
        if(postion == 0) {
            return new AccommodationFragment();
        } else {
            return new AccommodationFragment();
        }
    }

    @Override
    public int getCount() { return 1; }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        if(position == 0) {
            return mContext.getString(R.string.category_accommodation);
        } else {
            return mContext.getString(R.string.category_accommodation);
        }

    }
}
