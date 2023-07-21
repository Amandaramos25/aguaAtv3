package com.example.aguaatv3;

import android.view.View;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class AguaViewHolder extends RecyclerView.ViewHolder  {

    ImageView imageView;

    public AguaViewHolder(@NonNull View itemView) {
        super(itemView);
        imageView = itemView.findViewById(R.id.imageView2);
    }
}
