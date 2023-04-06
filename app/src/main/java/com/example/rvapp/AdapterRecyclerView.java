package com.example.rvapp;

import android.content.ClipData;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class AdapterRecyclerView extends RecyclerView.Adapter<AdapterRecyclerView.ViewHolder> {

    private ArrayList<ItemModel> dataItem;

    public class ViewHolder extends RecyclerView.ViewHolder {

        TextView textHead;
        TextView textsubhead;
        ImageView imageIcon;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            textHead = itemView.findViewById(R.id.text_title);
            imageIcon = itemView.findViewById(R.id.imagesList);
        }
    }

    AdapterRecyclerView(ArrayList<ItemModel> dataItem) {
        this.dataItem = dataItem;
    }

    @NonNull
    @Override
    public AdapterRecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item, parent, false);

        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull AdapterRecyclerView.ViewHolder holder, int position) {

        TextView texthead = holder.textHead;
        TextView textsubhead = holder.textsubhead;
        ImageView imageIcon = holder.imageIcon;

        texthead.setText(dataItem.get(position).getname());
        textsubhead.setText(dataItem.get(position).getType());
        imageIcon.setImageResource(dataItem.get(position).getimage());
    }

    @Override
    public int getItemCount() {
        return dataItem.size();
    }

}
