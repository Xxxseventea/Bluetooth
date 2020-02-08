package com.example.bluetooth.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.bluetooth.R;

import java.util.ArrayList;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class RankListRecyclerViewAdapter extends RecyclerView.Adapter<RankListRecyclerViewAdapter.ViewHolder> {

    Context context;
    ArrayList arrayList = new ArrayList();
    public RankListRecyclerViewAdapter(Context context){

        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.item_ranking,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return arrayList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        TextView timelong;
        TextView ranking;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            timelong = itemView.findViewById(R.id.list);
            ranking = itemView.findViewById(R.id.time_week);
        }
    }
}
