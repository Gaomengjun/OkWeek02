package com.bw.combatweek1.view.fragment;


import android.view.View;
import android.widget.Button;

import androidx.fragment.app.FragmentActivity;

import com.bw.combatweek1.R;
import com.bw.combatweek1.base.BaseFragment;
import com.bw.combatweek1.view.activity.MainActivity;


public class NewsFragment extends BaseFragment {

    private Button button;

    @Override
    protected void initView(View inflate) {
        button = inflate.findViewById(R.id.tbn);
       button.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               MainActivity mainActivity  = (MainActivity) getActivity();
               mainActivity.topager();
           }
       });
    }

    @Override
    protected int layoutId() {
        return R.layout.fragment_news;
    }

    @Override
    protected void initData() {

    }

}
