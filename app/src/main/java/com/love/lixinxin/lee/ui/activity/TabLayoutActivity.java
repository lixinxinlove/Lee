package com.love.lixinxin.lee.ui.activity;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

import com.love.lixinxin.lee.R;
import com.love.lixinxin.lee.ui.adapter.FragmentAdapter;
import com.love.lixinxin.lee.ui.fragment.TabLayoutFragment;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class TabLayoutActivity extends AppCompatActivity {

    @BindView(R.id.tabLayout)
    TabLayout tabLayout;
    @BindView(R.id.viewPager)
    ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tab_layout);
        ButterKnife.bind(this);

        initTabLayout();

    }

    private void initTabLayout() {
        List<String> titles = new ArrayList<>();
        titles.add("精选");
        titles.add("订阅");
        titles.add("消息");
        titles.add("发现");

        List<Fragment> fragments = new ArrayList<>();
        for (int i = 0; i < titles.size(); i++) {
            fragments.add(new TabLayoutFragment());
        }

        FragmentAdapter mFragmentAdapter = new FragmentAdapter(getSupportFragmentManager(), fragments, titles);
        //给ViewPager设置适配器
        viewPager.setAdapter(mFragmentAdapter);
        //将TabLayout和ViewPager关联起来。
        tabLayout.setupWithViewPager(viewPager);
        //给TabLayout设置适配器
        // tabLayout.setTabsFromPagerAdapter(mFragmentAdapteradapter);

    }
}
