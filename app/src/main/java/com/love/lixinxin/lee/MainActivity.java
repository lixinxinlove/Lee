package com.love.lixinxin.lee;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.love.lixinxin.lee.ui.activity.RippleViewActivity;

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

    @OnClick(R.id.btn_ripple)
    public void startActivity(View v) {
        Intent intent;
        intent = new Intent(this, RippleViewActivity.class);
        startActivity(intent);
    }

}
