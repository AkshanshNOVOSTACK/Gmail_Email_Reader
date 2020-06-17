package com.factor8.wfh;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class Adapter_Recc  extends RecyclerView.Adapter<Adapter_Recc.ReccViewHolder> {


    @NonNull
    @Override
    public ReccViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.row_recom, parent,false);
        return new ReccViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ReccViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 10;
    }

    class ReccViewHolder extends RecyclerView.ViewHolder{

        public ReccViewHolder(@NonNull View itemView) {
            super(itemView);
        }
    }
}
