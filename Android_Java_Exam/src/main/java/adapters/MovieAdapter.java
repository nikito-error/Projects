package adapters;

import android.app.Activity;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.kontrolno_2_18621695.R;

import java.util.ArrayList;

import fragments.MovieFragment;
import holders.MovieHolder;
import models.Movie;

public class MovieAdapter extends RecyclerView.Adapter<MovieHolder>{
    ArrayList<Movie> movies;
    Context context;

    public MovieAdapter(ArrayList<Movie> movies) {
        this.movies = movies;
    }

    @NonNull
    @Override
    public MovieHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
       context=parent.getContext();
       LayoutInflater inflater=LayoutInflater.from(context);
       View view=inflater.inflate(R.layout.line_movie_layout,parent,false);
       MovieHolder holder=new MovieHolder(view);
       return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull MovieHolder holder, int position) {
Movie movie=movies.get(position);
holder.setTittle(movie.getTittle());
holder.setGenre(movie.getGenre());
holder.setPrice(movie.getCena());
holder.setBr(movie.getBr());
holder.itemView.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        FragmentManager fm = ((Activity)context).getFragmentManager();
        FragmentTransaction tr=fm.beginTransaction();
        tr.replace(R.id.frameLayout, MovieFragment.newInstance(movie));
        tr.commit();
    }
});

    }

    @Override
    public int getItemCount() {
        return movies.size();
    }
}
