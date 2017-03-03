package com.beautiful.beautiful.fragment;

import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.FrameLayout;
import android.widget.ListView;

import com.beautiful.beautiful.R;

import org.xutils.view.annotation.ContentView;
import org.xutils.view.annotation.ViewInject;
import org.xutils.x;

import java.util.ArrayList;
import java.util.List;

@ContentView(R.layout.fragment_type)
public class TypeFragment extends Fragment {

    @ViewInject(R.id.lv_type)
    ListView lv;
    @ViewInject(R.id.replace_type)
    FrameLayout replace;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = x.view().inject(this, inflater, container);

        setAdapter();
        return view;
    }

    private void setAdapter() {
        List<String> data = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            data.add("lalla"+i);
        }
        lv.setAdapter(new ArrayAdapter(getActivity(),android.R.layout.simple_list_item_1,
                android.R.id.text1,data) {
        });
    }
}
