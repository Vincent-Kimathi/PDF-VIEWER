package com.example.pdfreader;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

public class pdfviewholder extends RecyclerView.ViewHolder {
   public TextView tvName;
   public CardView container;

    public pdfviewholder(@NonNull View itemView) {
        super(itemView);
tvName = itemView.findViewById(R.id.textpdf);
container = itemView.findViewById(R.id.container);


    }
}
