package com.example.cocktailapp1_2;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder> {

    private ArrayList<CocktailData> mCocktailData;

    @NonNull
    @Override
    public RecyclerViewAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_recyclerview, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerViewAdapter.ViewHolder holder, int position) {
        holder.onBind(mCocktailData.get(position));
    }

    public void setCocktailList(ArrayList<CocktailData> list){
        this.mCocktailData = list;
        notifyDataSetChanged();
    }

    @Override
    public int getItemCount() {
        return mCocktailData.size();
    }


    class ViewHolder extends RecyclerView.ViewHolder {

        ImageView profile;
        TextView name;
        TextView tip;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            profile = (ImageView) itemView.findViewById(R.id.profile);
            name = (TextView) itemView.findViewById(R.id.name);
            tip = (TextView) itemView.findViewById(R.id.tip);
        }

        public void onBind(CocktailData item) {
            profile.setImageResource(item.getResourceId());
            name.setText(item.getName());
            tip.setText(item.getTip());
        }
    }
}
