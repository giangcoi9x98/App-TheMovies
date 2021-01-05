package com.example.TMDB.adapters;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.TMDB.activities.MovieDetailActivity;
import com.example.TMDB.models.GetMoviesResponse;
import com.example.android1_module3_tmdb.R;
import com.example.TMDB.api.RetrofitConfiguration;

import java.util.List;

public class MoviesAdapter extends RecyclerView.Adapter<MoviesAdapter.MoviesViewHolder> {
    List<GetMoviesResponse.ResultsBean> movies;
    Context context;

    public MoviesAdapter(List<GetMoviesResponse.ResultsBean> movies) {
        this.movies = movies;
    }

    @NonNull
    @Override
    public MoviesViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        context = parent.getContext();
        LayoutInflater layoutInflater = LayoutInflater.from(context);
        View itemView = layoutInflater.inflate(R.layout.item_list_movie, parent, false);
        return new MoviesViewHolder(itemView);
    }

    public void upDateData(List<GetMoviesResponse.ResultsBean> data) {
        movies.clear();
        movies.addAll(data);
        notifyDataSetChanged();
    }
    public void ClearData(){
        movies.clear();
        notifyDataSetChanged();
    }
    public void addAll(List<GetMoviesResponse.ResultsBean>list){
        movies.addAll(list);
        notifyDataSetChanged();
    }

    @Override
    public void onBindViewHolder(@NonNull MoviesViewHolder holder, int position) {
        holder.setData(movies.get(position));
    }

    @Override
    public int getItemCount() {
        if (movies != null) {
            return movies.size();
        }
        return 0;
    }

    class MoviesViewHolder extends RecyclerView.ViewHolder {
        ImageView ivThumbnail;
        TextView tvTitle;
        TextView tvRating;

        public MoviesViewHolder(@NonNull View itemView) {
            super(itemView);
            ivThumbnail = itemView.findViewById(R.id.iv_thumbnail);
            tvTitle = itemView.findViewById(R.id.tv_title);
            tvRating = itemView.findViewById(R.id.tv_rating);
        }

        public void setData(GetMoviesResponse.ResultsBean movie) {
            Glide.with(context)
                    .load(RetrofitConfiguration.getImageBaseUrlThumbnail()
                            + movie.getPoster_path())
                    .into(ivThumbnail);
            tvTitle.setText(movie.getTitle() + "\n");
            tvRating.setText(String.valueOf(movie.getVote_average()));

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(context, MovieDetailActivity.class);
                    intent.putExtra("movie_id", movie.getId());
                    context.startActivity(intent);
                }
            });
        }
    }
}
