package com.zhxh.xfragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.zhxh.xfragmentlib.CFragment;

/**
 * Created by zhxh on 2018/6/30
 */
public class LevelThreeFragment extends CFragment {

    private static final String ARG_SECTION_NUMBER = "section_number";

    public LevelThreeFragment() {
    }

    public static LevelThreeFragment newInstance(int sectionNumber) {
        LevelThreeFragment fragment = new LevelThreeFragment();
        Bundle args = new Bundle();
        args.putInt(ARG_SECTION_NUMBER, sectionNumber);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_main, container, false);
        TextView textView = rootView.findViewById(R.id.section_label);
        textView.setText("LevelThreeFragment " + getString(R.string.section_format, getArguments().getInt(ARG_SECTION_NUMBER)));
        return rootView;
    }
}