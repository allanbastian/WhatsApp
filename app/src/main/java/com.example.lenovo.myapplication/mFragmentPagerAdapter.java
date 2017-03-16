package com.example.lenovo.whatsapp;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

class mFragmentPagerAdapter extends FragmentPagerAdapter {
    public mFragmentPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0: CallsFrag tab1 = new CallsFrag();
                return tab1;
            case 1: ChatsFrag tab2 = new ChatsFrag();
                return tab2;
            case 2: CallsFrag tab3 = new CallsFrag();
                return tab3;
        }
        return null;
    }

    @Override
    public int getCount() {
        //Number of tabs
        return 3;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        switch (position) {
            case 0: return "Calls";
            case 1: return "Chats";
            case 2: return "Contacts";
        }
        return null;
    }
}

