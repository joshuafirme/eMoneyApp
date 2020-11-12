package com.example.e_money.Adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.e_money.Data.SampleData;
import com.example.e_money.R;
import com.squareup.picasso.Picasso;

import java.util.List;

public class SampleAdapter extends RecyclerView.Adapter<SampleAdapter.ViewHolder> {
    private List<SampleData> sampleData;
    public SampleAdapter(List<SampleData> sampleData) {
        this.sampleData = sampleData;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.cardview, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull SampleAdapter.ViewHolder holder, int position) {
        SampleData currentData = sampleData.get(position);
        holder.title.setText(currentData.getTitle());
        Picasso.get().load(currentData.getImage())
                .fit().centerInside()
                .into(holder.img);
    }

    @Override
    public int getItemCount() {
        return sampleData.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        TextView title;
        ImageView img;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            title = itemView.findViewById(R.id.txt_title);
            img = itemView.findViewById(R.id.img);
        }
    }
}
