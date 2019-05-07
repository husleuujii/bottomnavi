package com.example.myapplication

import android.content.Context
import android.net.Uri
import android.os.Bundle
import android.support.v4.app.Fragment
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.fragment_dashboard.*
import kotlinx.android.synthetic.main.fragment_dashboard.view.*


class DashboardFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val root = inflater.inflate(R.layout.fragment_dashboard, container, false)
        // Inflate the layout for this fragment
        var java = 0
        var network = 0
        var database = 0

        var total = 0
        var ave = 0

        root.buttonTotal.setOnClickListener {
            java = editTextJava.text.toString().toInt()
            network = editTextNetwork.text.toString().toInt()
            database = editTextDatabase.text.toString().toInt()
            total = java + network + database
            textViewTotal.text = total.toString()
        }

//        Log.e("K", java.toString())
        root.buttonAve.setOnClickListener {
            ave = total / 3
            textViewAve.text = ave.toString()
        }
            return root
    }


}
