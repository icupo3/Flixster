package com.example.flixster

/**
 * This interface is used by the [NationalParksRecyclerViewAdapter] to ensure
 * it has an appropriate Listener.
 *
 * In this app, it's implemented by [NationalParksFragment]
 */
interface OnListFragmentInteractionListener {
    fun onItemClick(item: Movie)
}
