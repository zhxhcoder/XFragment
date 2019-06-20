package com.zhxh.xfragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.zhxh.xfragmentlib.CFragment;
import com.zhxh.xfragmentlib.LogUtils;

/**
 * Created by zhxh on 2018/6/30
 */
public class LevelOneFragment extends CFragment {

    private static final String ARG_SECTION_NUMBER = "section_number";

    public LevelOneFragment() {
    }

    public static LevelOneFragment newInstance(int sectionNumber) {
        LevelOneFragment fragment = new LevelOneFragment();
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
        textView.setText("LevelOneFragment " + getString(R.string.section_format, getArguments().getInt(ARG_SECTION_NUMBER)));
        return rootView;
    }

    @Override
    public void onFirstVisible() {
        super.onFirstVisible();
        LogUtils.i("---" + " onFirstVisible-ismIsFirstVisible =" + ismIsFirstVisible());
    }

    @Override
    public void onEveryVisible() {
        super.onEveryVisible();
        LogUtils.i("---" + "onEveryVisible-ismIsFirstVisible =" + ismIsFirstVisible());
    }

    @Override
    public void onEveryVisible(boolean firstResume) {
        super.onEveryVisible(firstResume);
        LogUtils.i("---" + "onEveryVisible-firstResume = " + firstResume);
    }

    @Override
    public void onFragmentInVisible() {
        super.onFragmentInVisible();
        LogUtils.i("---" + " onFragmentInVisible-ismIsFirstVisible =" + ismIsFirstVisible());
    }
}