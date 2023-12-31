package com.example.mentorfind.adapter;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.annotation.NonNull;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

import java.util.ArrayList;
import java.util.List;

public class VIewPagerAdapter extends FragmentStatePagerAdapter {
    List<Fragment> fragmentList=new ArrayList<>();
    List<String> mTitleList=new ArrayList<>();


    public VIewPagerAdapter(@NonNull FragmentManager fm) {
        super(fm);
    }

    public void addFragment(Fragment fragment,String title){
        fragmentList.add(fragment);
        mTitleList.add(title);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        return fragmentList.get(position);
    }

    @Override
    public int getCount() {
        return fragmentList.size();
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return mTitleList.get(position);
    }
}

