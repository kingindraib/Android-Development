package edu.divyagyan.listviewexampleall.adapter;

import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

import edu.divyagyan.listviewexampleall.model.Movie;

public class RecycleViewAdapter extends RecyclerView.Adapter<RecycleViewAdapter.customViewHolder>{


    @NonNull
    @Override
    public customViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull customViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    class customViewHolder extends RecyclerView.ViewHolder{
        public customViewHolder(@Nullable View itemView){
            super(itemView);
        }
    }

}


