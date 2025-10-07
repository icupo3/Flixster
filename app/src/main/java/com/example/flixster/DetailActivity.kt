package com.example.flixster

import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.bumptech.glide.Glide

class DetailActivity : AppCompatActivity() {
    private lateinit var movieImageIV: ImageView
    private lateinit var movieReleaseTV: TextView
    private lateinit var movieVoteTV: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        // TODO: Find the remaining Views for the screen
        movieImageIV = findViewById(R.id.movieSubImage)
        movieReleaseTV = findViewById(R.id.movieSubRelease)
        movieVoteTV = findViewById(R.id.movieSubVote)

        // TODO: Get the extra from the Intent
//        val movie = intent.getSerializableExtra("MOVIE_EXTRA") as Movie
        val movie = intent.getParcelableExtra<Movie>("movie_extra")

        // TODO:  Set the name, location, and description information
        movieReleaseTV.text = "Release Date: " + movie?.releaseDate
        movieVoteTV.text = "Average Review Score: " + movie?.voteAverage

        // TODO: Load the image using Glide
        Glide.with(this)
            .load(movie?.image2Url)
            .into(movieImageIV)
    }
}