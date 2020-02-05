package com.example.bluetooth.adapter;

import android.content.Context;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseExpandableListAdapter;
import android.widget.TextView;

import com.example.bluetooth.R;

import java.util.ArrayList;
import java.util.zip.Inflater;

public class ExpandableListAdapter extends BaseExpandableListAdapter {

    Context context;
    ArrayList<String> group;
    ArrayList<ArrayList<String>> child;
    public ExpandableListAdapter(Context context, ArrayList<String> group,ArrayList<ArrayList<String>> child){

        this.child = child;
        this.context = context;
        this.group = group;
    }
    //父项的个数
    @Override
    public int getGroupCount() {
        return group.size();
    }

    //某个父项的个数
    @Override
    public int getChildrenCount(int groupPosition) {
        return child.get(groupPosition).size();
    }

    //获得某个父项
    @Override
    public Object getGroup(int groupPosition) {
        return group.get(groupPosition);
    }

    //获得某个子项
    @Override
    public Object getChild(int groupPosition, int childPosition) {
        return child.get(childPosition);
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
        convertView = LayoutInflater.from(context).inflate(R.layout.item_period_group,parent,false);
        textView = convertView.findViewById(R.id.tv_group);
        textView.setText(group.get(groupPosition));
        return convertView;
    }

    //获取子项的view
    @Override
    public View getChildView(int groupPosition, int childPosition, boolean isLastChild, View convertView, ViewGroup parent) {
        if(groupPosition == 0){
            convertView  = LayoutInflater.from(context).inflate(R.layout.item_period_child_today,parent,false);

            TextView textView = convertView.findViewById(R.id.time);
            TextView textView1 = convertView.findViewById(R.id.timelong);

            textView.setText();
            textView.setText();

        }else{
            convertView = LayoutInflater.from(context).inflate(R.layout.item_period_child_history,parent,false);

        }
        return convertView;
    }

    //子项是否可选中
    @Override
    public boolean isChildSelectable(int groupPosition, int childPosition) {
        return false;
    }
}
