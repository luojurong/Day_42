package com.beautiful.beautiful.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.beautiful.beautiful.R;

import org.xutils.view.annotation.ContentView;
import org.xutils.x;

/**
 * Created by luojurong on 2017/3/2.
 */

@ContentView(R.layout.fragment_nine)
public class FragmentNine extends Fragment{
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        return x.view().inject(this,inflater,container);

    }
}
