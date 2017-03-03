package com.beautiful.beautiful.activity;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.support.annotation.IdRes;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import com.beautiful.beautiful.R;
import com.beautiful.beautiful.fragment.FragmentHome;
import com.beautiful.beautiful.fragment.FragmentMy;
import com.beautiful.beautiful.fragment.FragmentNine;
import com.beautiful.beautiful.fragment.FragmentShop;
import com.beautiful.beautiful.fragment.FragmentSift;
import com.beautiful.beautiful.fragment.TypeFragment;

import org.xutils.view.annotation.ContentView;
import org.xutils.view.annotation.Event;
import org.xutils.view.annotation.ViewInject;
import org.xutils.x;

@ContentView(R.layout.activity_main)
public class MainActivity extends AppCompatActivity {
    private FragmentManager manager;
    private FragmentTransaction transaction;

    private int checkPosition = 0;
    private Resources res;
    @ViewInject(R.id.btn1)
    RadioButton rb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        res = this.getResources();
        initData();

        x.view().inject(this);
        rb.setChecked(true);
    }

    private FragmentHome fragmentHome = new FragmentHome();
    private FragmentMy fragmentMy = new FragmentMy();
    private TypeFragment fragment3 = new TypeFragment();
    private FragmentShop fragmentShop = new FragmentShop();
    private FragmentSift fragmentSift = new FragmentSift();

    private void initData() {
        manager = getSupportFragmentManager();
        transaction = manager.beginTransaction();
//        transaction.add(R.id.fragmentLayout_home, fragmentHome)
//                .add(R.id.fragmentLayout_home, fragmentMy)
//                .add(R.id.fragmentLayout_home, fragmentNine)
//                .add(R.id.fragmentLayout_home, fragmentShop)
//                .add(R.id.fragmentLayout_home, fragmentSift);

        transaction = manager.beginTransaction();
        transaction.replace(R.id.fragmentLayout_home, fragmentHome).commit();

    }


    /**
     * radiobutton 点击时 修改碎片
     */
    @Event(type = RadioGroup.OnCheckedChangeListener.class, value = R.id.rg)
    private void onCheckedChanged(RadioGroup group, @IdRes int checkedId) {
       //     Log.e("---",checkedId+"---------");
        RadioButton rb;
        Drawable drawable;
        switch (checkedId) {
            case R.id.btn1:
                rb = (RadioButton) group.getChildAt(0);

                setImageDef(group); //将之前 置为默认

                drawable = res.getDrawable(R.mipmap.yuike_maintab_home_sel);
           //     drawable.setBounds(1,1,100,100);
           //     rb.setCompoundDrawables(null, drawable,null,null);
                rb.setCompoundDrawablesWithIntrinsicBounds(null, drawable,null,null);

                checkPosition = 0; //修改选中的position
                transaction = manager.beginTransaction();
                transaction.replace(R.id.fragmentLayout_home, fragmentHome).commit();
                break;
            case R.id.btn2:
                rb = (RadioButton) group.getChildAt(1);
                setImageDef(group); //将之前 置为默认
                drawable = res.getDrawable(R.mipmap.yuike_maintab_9kuai9_sel);
                rb.setCompoundDrawablesWithIntrinsicBounds(null, drawable,null,null);
                checkPosition = 1;

                transaction = manager.beginTransaction();
                transaction.replace(R.id.fragmentLayout_home, fragmentSift).commit();
                break;
            case R.id.btn3:
                rb = (RadioButton) group.getChildAt(2);
                setImageDef(group); //将之前 置为默认
                drawable = res.getDrawable(R.mipmap.yuike_maintab_category_sel);
                rb.setCompoundDrawablesWithIntrinsicBounds(null, drawable,null,null);
                checkPosition = 2;

                transaction = manager.beginTransaction();
                transaction.replace(R.id.fragmentLayout_home, fragment3).commit();
                break;
            case R.id.btn4:
                rb = (RadioButton) group.getChildAt(3);
                setImageDef(group); //将之前 置为默认
                drawable = res.getDrawable(R.mipmap.yuike_maintab_cart_sel);
                rb.setCompoundDrawablesWithIntrinsicBounds(null, drawable,null,null);
                checkPosition = 3;

                transaction = manager.beginTransaction();
                transaction.replace(R.id.fragmentLayout_home, fragmentShop).commit();
                break;
            case R.id.btn5:
                rb = (RadioButton) group.getChildAt(4);
                setImageDef(group); //将之前 置为默认
                drawable = res.getDrawable(R.mipmap.yuike_maintab_space_sel);
                rb.setCompoundDrawablesWithIntrinsicBounds(null, drawable,null,null);
                checkPosition = 4;

                transaction = manager.beginTransaction();
                transaction.replace(R.id.fragmentLayout_home, fragmentMy).commit();
                break;
        }
    }

    /**
     * 将之前选中的图片置为默认
     * @param group
     */
    private void setImageDef(RadioGroup group) {
        Drawable drawable;
        RadioButton rb;
        switch (checkPosition){
            case 0:
                rb = (RadioButton) group.getChildAt(0);
            //    rb.setCompoundDrawablesWithIntrinsicBounds(null,null,null,null);
                drawable = res.getDrawable(R.mipmap.yuike_maintab_home_nor);
                rb.setCompoundDrawablesWithIntrinsicBounds(null, drawable,null,null);
                break;
            case 1:
                rb = (RadioButton) group.getChildAt(1);
                drawable = res.getDrawable(R.mipmap.yuike_maintab_9kuai9_nor);
                rb.setCompoundDrawablesWithIntrinsicBounds(null, drawable,null,null);
                break;
            case 2:
                rb = (RadioButton) group.getChildAt(2);
                drawable = res.getDrawable(R.mipmap.yuike_maintab_category_nor);
                rb.setCompoundDrawablesWithIntrinsicBounds(null, drawable,null,null);
                break;
            case 3:
                rb = (RadioButton) group.getChildAt(3);
                drawable = res.getDrawable(R.mipmap.yuike_maintab_shopcart_nor);
                rb.setCompoundDrawablesWithIntrinsicBounds(null, drawable,null,null);
                break;
            case 4:
                rb = (RadioButton) group.getChildAt(4);
                drawable = res.getDrawable(R.mipmap.yuike_maintab_space_nor);
                rb.setCompoundDrawablesWithIntrinsicBounds(null, drawable,null,null);
                break;

        }
    }


}
