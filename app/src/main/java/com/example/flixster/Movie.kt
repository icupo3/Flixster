package com.example.flixster

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.parcelize.Parcelize

@Parcelize
data class Movie(
    @SerializedName("title")
    val name: String? = null,

    @SerializedName("overview")
    val description: String? = null,

    @SerializedName("poster_path")
    val posterPath: String? = null,

    @SerializedName("backdrop_path")
    val poster2Path: String? = null,

    @SerializedName("release_date")
    val releaseDate: String? = null,

    @SerializedName("vote_average")
    val voteAverage: String? = null
) : Parcelable {

    val imageUrl: String?
        get() = posterPath?.let { "https://image.tmdb.org/t/p/w500$it" }

    val image2Url: String?
        get() = poster2Path?.let { "https://image.tmdb.org/t/p/w500$it" }
}
