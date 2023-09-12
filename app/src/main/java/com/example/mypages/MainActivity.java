package com.example.mypages;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.mypages.databinding.ActivityMainBinding;
import com.google.android.material.tabs.TabLayoutMediator;

public class MainActivity extends AppCompatActivity {

    ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());

        setContentView(binding.getRoot());

        binding.viewPager.setAdapter(new ViewPagerAdapter(this));

        new TabLayoutMediator(
                binding.tabLayout,
                binding.viewPager,
                ((tab, position) -> {
                    if (position == 0)
                        tab.setText("월요웹툰");
                    else if (position == 1)
                        tab.setText("화요웹툰");
                    else if (position == 2)
                        tab.setText("화요웹툰");
                })
        ).attach();
    }
}

/*
    주제를 정해서 2가지의 사이트 주소를 확보해 두세요.

    1) https://naver.com
    2) https://nexon.com

 */