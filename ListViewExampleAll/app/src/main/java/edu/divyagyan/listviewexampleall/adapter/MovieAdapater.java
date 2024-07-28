package edu.divyagyan.listviewexampleall.adapter;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;

import edu.divyagyan.listviewexampleall.R;
import edu.divyagyan.listviewexampleall.model.Movie;

public class MovieAdapater extends ArrayAdapter<Movie> {
    private Activity context;
    private ArrayList<Movie> movies;

    public MovieAdapater(Activity context, ArrayList<Movie>movies){
        super(context, R.layout.custom_list_item,movies);
        this.context = context;
        this.movies = movies;
    }

    @NonNull
    @Override
    @SuppressLint("ViewHolder")
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
         View view = context.getLayoutInflater().inflate(R.layout.custom_list_item,parent,false);

        ImageView movieImageView = view.findViewById(R.id.imageView);
        TextView titleTextView = view.findViewById(R.id.movieTitle);
        TextView duretionTextView = view.findViewById(R.id.duretion);
        TextView genreTextView = view.findViewById(R.id.movieGenere);
        TextView dateTextview = view.findViewById(R.id.movieDate);

        Movie movie = movies.get(position);
        titleTextView.setText(movie.getTitle());
        duretionTextView.setText(movie.getDuration());
        genreTextView.setText(movie.getGenre());
        dateTextview.setText(movie.getMovieDate());
        Picasso.get().load(movie.getImageUrl()).into(movieImageView);
       return  view;
    }
}
