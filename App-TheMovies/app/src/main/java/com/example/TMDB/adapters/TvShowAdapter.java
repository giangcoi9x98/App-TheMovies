package com.example.TMDB.adapters;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.example.TMDB.activities.TvShowsActivity;
import com.example.TMDB.api.RetrofitConfiguration;
import com.example.TMDB.models.GetTvShows;
import com.example.android1_module3_tmdb.R;

import java.util.List;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class TvShowAdapter extends RecyclerView.Adapter<TvShowAdapter.tvShowViewHolder> {
    List<GetTvShows.ResultsBean> tvShow;
    Context context;

    public TvShowAdapter(List<GetTvShows.ResultsBean> tvShow) {
        this.tvShow = tvShow;

    }

    @NonNull
    @Override
    public tvShowViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        context =parent.getContext();
        LayoutInflater inflater=LayoutInflater.from(context);
        View itemView =inflater.inflate(R.layout.item_list_movie,parent,false);
        return new tvShowViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull tvShowViewHolder holder, int position) {
        holder.setData(tvShow.get(position));
    }

    @Override
    public int getItemCount() {
        return tvShow.size();
    }

    class tvShowViewHolder extends RecyclerView.ViewHolder{
        ImageView imgMain;
        TextView tvName;
        TextView tvRaiting;
        public tvShowViewHolder(@NonNull View itemView) {
            super(itemView);
            imgMain=itemView.findViewById(R.id.iv_thumbnail);
            tvName=itemView.findViewById(R.id.tv_title);
            tvRaiting=itemView.findViewById(R.id.tv_rating);

        }
        public void setData(GetTvShows.ResultsBean tvShows){
            Glide.with(context).load(RetrofitConfiguration.getImageBaseUrlThumbnail()+tvShows.getPoster_path())
                    .into(imgMain);
            tvName.setText(tvShows.getName());
            tvRaiting.setText(String.valueOf(tvShows.getVote_average()));

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(context, TvShowsActivity.class);
                    intent.putExtra("tv_id",tvShows.getId());
                    context.startActivity(intent);
                }
            });
        }

    }
}
