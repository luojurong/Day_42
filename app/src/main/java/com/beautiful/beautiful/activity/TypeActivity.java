package com.beautiful.beautiful.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.ListView;

import com.beautiful.beautiful.R;

import org.xutils.view.annotation.ContentView;
import org.xutils.view.annotation.Event;
import org.xutils.view.annotation.ViewInject;
import org.xutils.x;

import java.util.List;

@ContentView(R.layout.activity_type)
public class TypeActivity extends AppCompatActivity {

    @ViewInject(R.id.lv_type)
    ListView lv;
    @ViewInject(R.id.replace_type)
    FrameLayout replace;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_type);

        x.view().inject(this);

    }

    
}
