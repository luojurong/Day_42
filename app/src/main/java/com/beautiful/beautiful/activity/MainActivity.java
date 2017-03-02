package com.beautiful.beautiful.activity;

import android.support.annotation.IdRes;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import com.beautiful.beautiful.R;
import com.beautiful.beautiful.fragment.FragmentHome;
import com.beautiful.beautiful.fragment.FragmentMy;
import com.beautiful.beautiful.fragment.FragmentNine;
import com.beautiful.beautiful.fragment.FragmentShop;
import com.beautiful.beautiful.fragment.FragmentSift;

import org.xutils.view.annotation.ContentView;
import org.xutils.view.annotation.Event;
import org.xutils.x;

@ContentView(R.layout.activity_main)
public class MainActivity extends AppCompatActivity {
    private FragmentManager manager;
    private FragmentTransaction transaction;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        initData();

        x.view().inject(this);

    }

    private FragmentHome fragmentHome = new FragmentHome();
    private FragmentMy fragmentMy = new FragmentMy();
    private FragmentNine fragmentNine = new FragmentNine();
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
     * radiobutton
     */
    @Event(type = RadioGroup.OnCheckedChangeListener.class, value = R.id.rg)
    private void onCheckedChanged(RadioGroup group, @IdRes int checkedId) {
            Log.e("---",checkedId+"---------");
        switch (checkedId) {
            case R.id.btn1:
                transaction = manager.beginTransaction();
                transaction.replace(R.id.fragmentLayout_home, fragmentHome).commit();
                break;
            case R.id.btn2:
                transaction = manager.beginTransaction();
                transaction.replace(R.id.fragmentLayout_home, fragmentNine).commit();
                break;
            case R.id.btn3:
                transaction = manager.beginTransaction();
                transaction.replace(R.id.fragmentLayout_home, fragmentSift).commit();
                break;
            case R.id.btn4:
                transaction = manager.beginTransaction();
                transaction.replace(R.id.fragmentLayout_home, fragmentShop).commit();
                break;
            case R.id.btn5:
                transaction = manager.beginTransaction();
                transaction.replace(R.id.fragmentLayout_home, fragmentMy).commit();
                break;


        }
    }


}
