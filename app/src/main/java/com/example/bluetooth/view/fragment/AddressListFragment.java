package com.example.bluetooth.view.fragment;

import android.os.Bundle;

import com.example.bluetooth.R;
import com.example.bluetooth.view.fragment.base.BaseFragment;

public class AddressListFragment extends BaseFragment {
    @Override
    protected int getLayout() {
        return R.layout.fragment_addresslist;
    }

    @Override
    protected void initView() {

    }

    public static AddressListFragment newInstance(){
        Bundle args = new Bundle();
        AddressListFragment addressListFragment = new AddressListFragment();
        addressListFragment.setArguments(args);
        return addressListFragment;
    }
}
