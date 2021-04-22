package com.feylabs.firrieflix.view.show

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.feylabs.firrieflix.R
import com.feylabs.firrieflix.adapter.ShowAdapter
import com.feylabs.firrieflix.databinding.FragmentShowBinding
import com.feylabs.firrieflix.viewmodel.ShowViewModel


class ShowFragment : Fragment() {

    lateinit var vbind: FragmentShowBinding
    lateinit var showAdapter: ShowAdapter

    val showViewModel by lazy { ViewModelProvider(requireActivity()).get(ShowViewModel::class.java) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        vbind =
            FragmentShowBinding.bind(inflater.inflate(R.layout.fragment_show, container, false))
        // Inflate the layout for this fragment
        return vbind.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        showAdapter = ShowAdapter()

        vbind.rvFilm.apply {
            adapter = showAdapter
            layoutManager = LinearLayoutManager(requireContext())
            setHasFixedSize(true)
        }

        showAdapter.setData(showViewModel.getShow())
        showAdapter.notifyDataSetChanged()


    }


}