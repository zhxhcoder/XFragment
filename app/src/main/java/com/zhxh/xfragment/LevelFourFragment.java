package com.zhxh.xfragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by zhxh on 2018/6/30
 */
public class LevelFourFragment extends Fragment {

    private static final String ARG_SECTION_NUMBER = "section_number";

    public LevelFourFragment() {
    }

    public static LevelFourFragment newInstance(int sectionNumber) {
        LevelFourFragment fragment = new LevelFourFragment();
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
        textView.setText("LevelFourFragment " + getString(R.string.section_format, getArguments().getInt(ARG_SECTION_NUMBER)));
        return rootView;
    }
}
