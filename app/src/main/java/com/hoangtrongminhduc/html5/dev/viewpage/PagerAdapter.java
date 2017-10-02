package com.hoangtrongminhduc.html5.dev.viewpage;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

public class PagerAdapter extends FragmentStatePagerAdapter {

    PagerAdapter(FragmentManager fragmentManager, int tabCount) {
        super(fragmentManager);
    }
    @Override
    public Fragment getItem(int position) {
        Fragment frag=null;
        switch (position){
            case 0:
                frag = new TabFragment1();
                break;
            case 1:
                frag = new TabFragment2();
                break;
            case 2:
                frag = new TabFragment3();
                break;
        }
        return frag;
    }

    @Override
    public int getCount() {
        return 3;
    }
}