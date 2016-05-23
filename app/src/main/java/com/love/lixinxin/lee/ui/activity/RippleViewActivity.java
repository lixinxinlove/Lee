package com.love.lixinxin.lee.ui.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.love.lixinxin.lee.R;
import com.love.lixinxin.lee.view.RippleView;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * 水波纹效果
 */
public class RippleViewActivity extends AppCompatActivity {
    @BindView(R.id.rippleView)
    RippleView rippleView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ripple_view);
        ButterKnife.bind(this);
        
        rippleView.startAnim();


    }
}
