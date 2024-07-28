package edu.divyagyan.listviewexampleall;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.ListView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;


import edu.divyagyan.listviewexampleall.adapter.MovieAdapater;
import edu.divyagyan.listviewexampleall.model.Movie;

public class CustomListViewActivity extends AppCompatActivity {

    private ListView movieListView;
    private MovieAdapater movieAdapater;
    private ArrayList<Movie> movieArrayList;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.custom_list_item);

        movieListView = findViewById(R.id.movieListView);

        initMovieList();
        movieAdapater = new MovieAdapater(CustomListViewActivity.this,movieArrayList);
        movieListView.setAdapter(movieAdapater);

    }

    private void initMovieList(){
        movieArrayList = new ArrayList<>();
        Movie movie = new Movie("Openhimer","Drama", "2hr",
                "jun 25 2025","https://marketplace.canva.com/EAFTl0ixW_k/1/0/1131w/canva-black-white-minimal-alone-movie-poster-YZ-0GJ13Nc8.jpg");
        movieArrayList.add(movie);
        movie = new Movie("Mahapurus","Drama", "2hr",
                "jun 25 2025","https://marketplace.canva.com/EAFTl0ixW_k/1/0/1131w/canva-black-white-minimal-alone-movie-poster-YZ-0GJ13Nc8.jpg");
        movieArrayList.add(movie);
         movie = new Movie("Openhimer","Drama", "2hr",
                "jun 25 2025","https://marketplace.canva.com/EAFTl0ixW_k/1/0/1131w/canva-black-white-minimal-alone-movie-poster-YZ-0GJ13Nc8.jpg");
        movieArrayList.add(movie);
         movie = new Movie("Mahapurus","Drama", "2hr",
                "jun 25 2025","https://marketplace.canva.com/EAFTl0ixW_k/1/0/1131w/canva-black-white-minimal-alone-movie-poster-YZ-0GJ13Nc8.jpg");
        movieArrayList.add(movie);
         movie = new Movie("Openhimer","Drama", "2hr",
                "jun 25 2025","https://marketplace.canva.com/EAFTl0ixW_k/1/0/1131w/canva-black-white-minimal-alone-movie-poster-YZ-0GJ13Nc8.jpg");
        movieArrayList.add(movie);
    }
}
