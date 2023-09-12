package com.example.mypages;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;

public class ViewPagerAdapter extends FragmentStateAdapter {

    public ViewPagerAdapter(@NonNull FragmentActivity fragmentActivity) {
        super(fragmentActivity);
    }



    @NonNull
    @Override
    public Fragment createFragment(int position) {
        if(position==0){
            //Fragment1 f1 = new Fragment1();
            WebViewFragment f1 = new WebViewFragment("https://m.naver.com");
            return f1;
        }else if(position==1){
            //Fragment2 f2 = new Fragment2();
            WebViewFragment f2 = new WebViewFragment("https://www.google.com");
            return f2;
        }else if(position==2){
            //Fragment3 f3 = new Fragment3();
            WebViewFragment f3 = new WebViewFragment("https://nexon.com");
            return f3;
        }
        return null;
    }

    @Override
    public int getItemCount() {
        return 3;
    }
}
