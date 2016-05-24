package com.love.lixinxin.lee.ui.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.love.lixinxin.lee.R;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.btn_ripple)
    Button btnRipple;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

    }

    @OnClick({R.id.btn_ripple, R.id.btn_tabLayout})
    public void startActivity(View v) {

        Intent intent;

        switch (v.getId()) {
            case R.id.btn_ripple:
                intent = new Intent(this, RippleViewActivity.class);
                startActivity(intent);
                break;
            case R.id.btn_tabLayout:
                intent = new Intent(this, TabLayoutActivity.class);
                startActivity(intent);
                break;
        }

    }

}
