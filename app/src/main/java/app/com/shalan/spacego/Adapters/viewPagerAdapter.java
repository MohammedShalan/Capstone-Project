package app.com.shalan.spacego.Adapters;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.ArrayList;
import java.util.List;

import app.com.shalan.spacego.Fragments.AboutFragment;
import app.com.shalan.spacego.Fragments.FeatureFragment;
import app.com.shalan.spacego.Fragments.MapFragment;

/**
 * Created by noura on 31/07/2017.
 */

public class viewPagerAdapter extends FragmentPagerAdapter{
    private final List<Fragment> mFragmentList = new ArrayList<>();
    private final List<String> mFragmentTitleList = new ArrayList<>();
    public viewPagerAdapter(FragmentManager fm) {
        super(fm);
        mFragmentList.add(new AboutFragment());
        mFragmentList.add(new FeatureFragment());
        mFragmentList.add(new MapFragment());
        mFragmentTitleList.add("About") ;
        mFragmentTitleList.add("Feature") ;
        mFragmentTitleList.add("Map");
    }
    @Override
    public CharSequence getPageTitle(int position) {
        return mFragmentTitleList.get(position);
    }
    @Override
    public Fragment getItem(int position) {

        return mFragmentList.get(position);
    }

    @Override
    public int getCount() {
        return mFragmentList.size();
    }

}
