package com.example.spacex.Adapter

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.viewmodel.viewModelFactory
import androidx.recyclerview.widget.RecyclerView
import com.example.spacex.Models.DataAPI.SpaceXDataItem
import com.example.spacex.Models.DataAPI.SpaceXDataX
import com.example.spacex.R
import com.example.spacex.databinding.ActivitySpacexListBinding
import com.squareup.picasso.Picasso

class RecycleViewAdapter(var spasXList:SpaceXDataX):RecyclerView.Adapter<RecycleViewAdapter.ViewHolder>(){


    class ViewHolder(private val binding:ActivitySpacexListBinding):RecyclerView.ViewHolder(binding.root) {

        fun onBinding(dataItem:SpaceXDataItem){
            binding.tvMissionName.text = dataItem.mission_name
            binding.tvRocketName.text = dataItem.rocket?.rocket_name
            binding.tvLaunchSiteName.text = dataItem.launch_site?.site_name
            binding.tvDateLaunch.text = dataItem.launch_date_utc
            Picasso.get()
                .load(dataItem.links?.mission_patch_small)
                .placeholder(R.drawable.ic_baseline_bedroom_baby_24)
                .error(R.drawable.ic_baseline_bedroom_baby_24)
                .into(binding.ivSpacex)
//            binding.root.setOnClickListener{
//                val space_dtail = Intent()
//
//            }

        }


    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return RecycleViewAdapter.ViewHolder(ActivitySpacexListBinding.inflate(LayoutInflater.from(parent.context),parent,false))
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.onBinding(spasXList[position])
    }



    override fun getItemCount(): Int {
      return spasXList.size
    }
}