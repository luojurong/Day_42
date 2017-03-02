package com.beautiful.beautiful.activity;

import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.beautiful.beautiful.R;
import com.beautiful.beautiful.fragment.FragmentHome;
import com.beautiful.beautiful.fragment.FragmentMy;
import com.beautiful.beautiful.fragment.FragmentNine;
import com.beautiful.beautiful.fragment.FragmentShop;
import com.beautiful.beautiful.fragment.FragmentSift;

import org.xutils.view.annotation.ViewInject;

public class MainActivity extends AppCompatActivity {
    private FragmentManager manager;
    private FragmentTransaction fragmentTransaction;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initData();


    }

    private void initData() {
        manager = getSupportFragmentManager();
        fragmentTransaction = manager.beginTransaction();
        fragmentTransaction.add(R.id.fragmentLayout_home,new FragmentHome());
        fragmentTransaction.add(R.id.fragmentLayout_home,new FragmentMy());
        fragmentTransaction.add(R.id.fragmentLayout_home,new FragmentNine());
        fragmentTransaction.add(R.id.fragmentLayout_home,new FragmentShop());
        fragmentTransaction.add(R.id.fragmentLayout_home,new FragmentSift());
    }
}
