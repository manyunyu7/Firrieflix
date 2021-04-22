package com.feylabs.firrieflix.view.movie

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.FragmentPagerAdapter
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.feylabs.firrieflix.R
import com.feylabs.firrieflix.adapter.MovieAdapter
import com.feylabs.firrieflix.databinding.FragmentMovieBinding
import com.feylabs.firrieflix.view.detail_movie_and_show.DetailActivity
import com.feylabs.firrieflix.viewmodel.MovieViewModel


class MovieFragment : Fragment() {

    lateinit var vbind : FragmentMovieBinding
    lateinit var movieAdapter: MovieAdapter

    val movieViewModel by lazy { ViewModelProvider(requireActivity()).get(MovieViewModel::class.java) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        vbind = FragmentMovieBinding.bind(inflater.inflate(R.layout.fragment_movie, container, false))
        // Inflate the layout for this fragment
        return vbind.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        movieAdapter = MovieAdapter()

        vbind.rvFilm.apply {
            adapter=movieAdapter
            layoutManager = LinearLayoutManager(requireContext())
            setHasFixedSize(true)
        }

        movieAdapter.setData(movieViewModel.getMovie())
        movieAdapter.notifyDataSetChanged()

        movieAdapter.setMyMovieInterface(object : MovieAdapter.MovieInterface{
            override fun onclick() {
                startActivity(Intent(requireContext(),DetailActivity::class.java))
            }

        })


    }


}