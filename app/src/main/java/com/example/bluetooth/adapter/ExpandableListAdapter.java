package com.example.bluetooth.adapter;

import android.content.Context;
import android.graphics.Color;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseExpandableListAdapter;
import android.widget.TextView;

import com.example.bluetooth.R;
import com.example.bluetooth.bean.PeriodBean;

import java.util.ArrayList;
import java.util.zip.Inflater;

public class ExpandableListAdapter extends BaseExpandableListAdapter {

    Context context;
    ArrayList<PeriodBean> arrayList;
    public ExpandableListAdapter(Context context, ArrayList<PeriodBean> arrayList){

        this.context = context;
        this.arrayList = arrayList;

    }
    //父项的个数
    @Override
    public int getGroupCount() {
        return arrayList.size();
    }

    //某个父项的个数
    @Override
    public int getChildrenCount(int groupPosition) {
        return 1;
    }

    //获得某个父项
    @Override
    public Object getGroup(int groupPosition) {
        return arrayList.get(groupPosition);
    }

    //获得某个子项
    @Override
    public Object getChild(int groupPosition, int childPosition) {
        return arrayList.get(childPosition);
    }

    //父项id
    @Override
    public long getGroupId(int groupPosition) {
        return groupPosition;
    }

    //子项id
    @Override
    public long getChildId(int groupPosition, int childPosition) {
        return childPosition;
    }

    @Override
    public boolean hasStableIds() {
        return false;
    }

    //获取父项的view
    @Override
    public View getGroupView(int groupPosition, boolean isExpanded, View convertView, ViewGroup parent) {
        TextView textView;
        TextView textView1;
        convertView = LayoutInflater.from(context).inflate(R.layout.item_period_group,parent,false);
        textView = convertView.findViewById(R.id.group_state);
        return convertView;
    }

    //获取子项的view
    @Override
    public View getChildView(int groupPosition, int childPosition, boolean isLastChild, View convertView, ViewGroup parent) {
            convertView  = LayoutInflater.from(context).inflate(R.layout.item_period_child_today,parent,false);

            TextView state = convertView.findViewById(R.id.state);
            TextView time = convertView.findViewById(R.id.time);
            TextView timelong = convertView.findViewById(R.id.timelong);;
        return convertView ;
    }

    //子项是否可选中
    @Override
    public boolean isChildSelectable(int groupPosition, int childPosition) {
        return false;
    }
}
