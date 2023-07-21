package com.example.aguaatv3;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class AguaAdapter extends RecyclerView.Adapter<AguaViewHolder > {

    Context context;
    List<Item> items;

    public AguaAdapter(Context context, List<Item> items) {
        this.context = context;
        this.items = items;
    }

    @NonNull
    @Override
    public AguaViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new AguaViewHolder(LayoutInflater.from(context).inflate(R.layout.copo_item,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull AguaViewHolder holder, int position) {
        holder.imageView.setImageResource(items.get(position).getImagem());
    }

    @Override
    public int getItemCount() {
        return items.size();
    }
}
