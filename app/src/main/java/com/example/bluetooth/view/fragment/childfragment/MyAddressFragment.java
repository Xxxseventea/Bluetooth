package com.example.bluetooth.view.fragment.childfragment;

import android.widget.SearchView;

import com.example.bluetooth.R;
import com.example.bluetooth.view.fragment.base.BaseFragment;

import androidx.recyclerview.widget.RecyclerView;

public class MyAddressFragment extends BaseFragment {
    RecyclerView recyclerView;
    SearchView searchView;

    @Override
    protected int getLayout() {
        return R.layout.fragment_mychild_addresslist;
    }

    @Override
    protected void initView() {

    }
}
