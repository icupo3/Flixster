package com.example.flixster

import com.google.gson.annotations.SerializedName

class Movie {
    @JvmField
    @SerializedName("title")
    var name: String? = null

    @JvmField
    @SerializedName("overview")
    var description: String? = null

    @SerializedName("poster_path")
    var posterPath: String? = null

    // Build full URL
    val imageUrl: String?
        get() = posterPath?.let { "https://image.tmdb.org/t/p/w500$it" }
}