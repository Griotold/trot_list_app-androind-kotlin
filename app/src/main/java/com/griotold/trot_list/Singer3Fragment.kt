package com.griotold.trot_list

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.navigation.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class Singer3Fragment : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_singer3, container, false)

        val items = mutableListOf<String>()
        items.add("가인이여라")
        items.add("진정인가요")
        items.add("당신을 만나")
        items.add("가인이여라")
        items.add("진정인가요")
        items.add("당신을 만나")
        items.add("가인이여라")
        items.add("진정인가요")
        items.add("당신을 만나")
        items.add("가인이여라")
        items.add("진정인가요")
        items.add("당신을 만나")
        items.add("가인이여라")
        items.add("진정인가요")
        items.add("당신을 만나")


        val rv = view.findViewById<RecyclerView>(R.id.singRV)
        val rvAdapter = RVAdapter(items)

        rv.adapter = rvAdapter

        rv.layoutManager = LinearLayoutManager(context)

        view.findViewById<ImageView>(R.id.image1).setOnClickListener {
            it.findNavController().navigate(R.id.action_singer3Fragment_to_singer1Fragment)
        }

        view.findViewById<ImageView>(R.id.image2).setOnClickListener {
            it.findNavController().navigate(R.id.action_singer3Fragment_to_singer2Fragment)
        }

        return view
    }

}