package com.example.spacex

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.spacex.Adapter.RecycleViewAdapter
import com.example.spacex.Models.DataAPI.SpaceXDataX
import com.example.spacex.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private var layoutManager:RecyclerView.LayoutManager? = null
    private lateinit var binding: ActivityMainBinding

    private var adapter:RecyclerView.Adapter<RecycleViewAdapter.ViewHolder>? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding =ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        layoutManager = LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false)
        binding.rvSpacex?.layoutManager = layoutManager
        adapter = RecycleViewAdapter(SpaceXDataX())
        binding.rvSpacex.adapter = adapter
    }
}