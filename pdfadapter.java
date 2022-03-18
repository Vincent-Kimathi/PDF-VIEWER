package com.example.pdfreader;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.io.File;
import java.util.List;

public class pdfadapter extends RecyclerView.Adapter<pdfviewholder> {
    private Context context;
    private List<File> pdffiles;

    public pdfadapter(Context context, List<File> pdffiles) {
        this.context = context;
        this.pdffiles = pdffiles;
    }

    @NonNull
    @Override
    public pdfviewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new pdfviewholder(LayoutInflater.from(context).inflate(R.layout.element_folder, parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull pdfviewholder holder, int position) {
holder.tvName.setText(pdffiles.get(position).getName());
holder.tvName.setSelected(true);
    }

    @Override
    public int getItemCount() {
        return pdffiles.size();
    }
}
