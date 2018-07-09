package com.example.harishreddy.viewlifttest;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class DataAdapter extends RecyclerView.Adapter<DataAdapter.ViewHolder> {


    public DataAdapter() {
    }


    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {

        holder.mMovieName.setText("");
        holder.mYear.setText("");
        holder.mDuration.setText("");
        holder.mImageView.setImageResource(0);
    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

        private TextView mMovieName,mYear,mDuration;
        private ImageView mImageView;
        public ViewHolder(View view) {
            super(view);

            mMovieName = (TextView)view.findViewById(R.id.movieNameTv);
            mYear = (TextView)view.findViewById(R.id.yearTv);
            mDuration = (TextView)view.findViewById(R.id.durationTv);
            mImageView = (ImageView) view.findViewById(R.id.moviePoster);
        }
    }
}