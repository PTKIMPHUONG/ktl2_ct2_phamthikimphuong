package com.example.ktl2_ct2_phamthikimphuong;

import com.example.ktl2_ct2_phamthikimphuong.ContinentFragment;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;


public class CountryViewPagerAdapter  extends FragmentPagerAdapter {
    final private int TAB_COUNT = 5;
    public CountryViewPagerAdapter(FragmentManager fm) {
        super(fm);
    }
    //
    @NonNull
    @Override
    public Fragment getItem(int position) {
        Fragment fragment = null;
        if (position == 0) {
            fragment = new ContinentFragment("Asia");
        } else if (position == 1) {
            fragment = new ContinentFragment("Africa");
        }
        else if (position == 2) {
            fragment = new ContinentFragment("Europe");
        }
        else if (position == 3) {
            fragment = new ContinentFragment("South America");
        }
        else if (position == 4) {
            fragment = new ContinentFragment("Oceania");
        }

        return fragment;
    }

    @Override
    public int getCount() {
        return TAB_COUNT;
    }
    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        String title = null;
        if (position == 0) {
            title = "Asia";
        } else if (position == 1) {
            title = "Africa";
        }
        else if (position == 2) {
            title = "Europe";
        }
        else if (position == 3) {
            title = "South America";
        }
        else if (position == 4) {
            title = "Oceania";
        }
        return title;
    }
}
