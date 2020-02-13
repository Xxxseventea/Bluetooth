package com.example.bluetooth.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.example.bluetooth.R;
import com.example.bluetooth.bean.RankBean;

import java.util.ArrayList;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import io.reactivex.internal.fuseable.HasUpstreamObservableSource;

public class RankListRecyclerViewAdapter extends RecyclerView.Adapter<RankListRecyclerViewAdapter.ViewHolder> {

    Context context;
    ArrayList<RankBean> arrayList = new ArrayList();
    public RankListRecyclerViewAdapter(Context context,ArrayList<RankBean> arrayList){

        this.arrayList = arrayList;
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
        holder.ranking.setText(position+4);
        holder.timelong.setText(arrayList.get(position+3).getDuration());

        Glide.with(context).load(arrayList.get(position+3).getImages()).into(holder.head);

    }

    @Override
    public int getItemCount() {
        return arrayList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        TextView timelong;
        TextView ranking;
        ImageView head;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            timelong = itemView.findViewById(R.id.list);
            ranking = itemView.findViewById(R.id.time_week);
            head = itemView.findViewById(R.id.head);
        }
    }
}
