package com.beautiful.beautiful.activity;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import com.beautiful.beautiful.R;

/**
 * 详情页
 */
public class DetailActivity extends AppCompatActivity implements
        View.OnClickListener,RadioGroup.OnCheckedChangeListener{
    private ImageView img_back;//返回键
    private RadioButton rb_default;//默认
    private RadioButton rb_sale;//销量
    private RadioButton rb_update;//最新
    private RadioButton rb_price;//价格
    private RadioGroup rg_detail;
    private int tag = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        findView();
        setOnClick();
    }

    private void setOnClick() {
        img_back.setOnClickListener(DetailActivity.this);
        rg_detail.setOnCheckedChangeListener(DetailActivity.this);
    }

    private void findView() {
        img_back = (ImageView) findViewById(R.id.img_back);
        rb_default = (RadioButton) findViewById(R.id.rb_default);
        rb_sale = (RadioButton) findViewById(R.id.rb_sale);
        rb_update = (RadioButton) findViewById(R.id.rb_update);
        rb_price = (RadioButton) findViewById(R.id.rb_price);
        rg_detail = (RadioGroup) findViewById(R.id.rg_detail);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.img_back :
                finish();
                break;
        }
    }

    @Override
    public void onCheckedChanged(RadioGroup group, int checkedId) {
        switch (checkedId){
            case R.id.rb_default :
                break;
            case R.id.rb_sale :
                break;
            case R.id.rb_update :
                break;
            case R.id.rb_price :
                break;
        }
    }
}
