package edu.divyagyan.listviewexampleall;

import android.os.Bundle;
import android.widget.GridView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

import edu.divyagyan.listviewexampleall.adapter.MovieAdapater;
import edu.divyagyan.listviewexampleall.adapter.MovieGridView;
import edu.divyagyan.listviewexampleall.model.Movie;


public class customGridViewActivity extends AppCompatActivity {
    private GridView gridView;
    private MovieGridView movieGridView;
    private ArrayList<Movie> movieArrayList;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grid_view);
        gridView = findViewById(R.id.gridView);


        gridView = findViewById(R.id.gridView);

        initMovieList();
        movieGridView = new MovieGridView(customGridViewActivity.this,movieArrayList);
        gridView.setAdapter(movieGridView);
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
