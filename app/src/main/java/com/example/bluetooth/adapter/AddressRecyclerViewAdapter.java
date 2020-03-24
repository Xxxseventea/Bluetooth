package com.example.bluetooth.adapter;

import android.content.Context;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.TextView;

import com.example.bluetooth.R;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class AddressRecyclerViewAdapter extends RecyclerView.Adapter<AddressRecyclerViewAdapter.ViewHolder> {
    Context context;

    public AddressRecyclerViewAdapter(Context context){
        this.context = context;
    }
    @NonNull
    @Override
    public AddressRecyclerViewAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.item_addresslist,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull AddressRecyclerViewAdapter.ViewHolder holder, int position) {

        holder.textView.setText(" ");
//        holder.imageView.setImageResource(" ");
        holder.button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                popwindows();
            }
        });
    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView imageView;
        TextView textView;
        Button button;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.address_head);
            textView = itemView.findViewById(R.id.address_name);
             button = itemView.findViewById(R.id.address_menu);
        }
    }

    public void popwindows(){
        View view = LayoutInflater.from(context).inflate(R.layout.popwindows,null);
        View parentView = LayoutInflater.from(context).inflate(R.layout.fragment_mychild_addresslist,null);

        LinearLayout QQ = view.findViewById(R.id.address_qq);
        LinearLayout email = view.findViewById(R.id.address_email);
        LinearLayout phone = view.findViewById(R.id.address_pnumber);

        TextView qq = QQ.findViewById(R.id.pop_tv);
        TextView emails = email.findViewById(R.id.pop_tv);
        TextView phones = phone.findViewById(R.id.pop_tv);

        qq.setText("");
        emails.setText("");
        phones.setText("");
        PopupWindow popupWindow = new PopupWindow(view,LinearLayout.LayoutParams.MATCH_PARENT,LinearLayout.LayoutParams.WRAP_CONTENT,true);

        popupWindow.setContentView(parentView);
        popupWindow.setTouchable(true);
        popupWindow.setOutsideTouchable(true);
        popupWindow.showAtLocation(parentView, Gravity.BOTTOM, 0, 0);
    }
}
