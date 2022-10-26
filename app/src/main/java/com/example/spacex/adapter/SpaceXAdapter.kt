package com.example.spacex.adapter

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup

import androidx.recyclerview.widget.RecyclerView
import com.example.spacex.models.data.SpaceXDataItem
import com.example.spacex.models.data.SpaceXDataX
import com.example.spacex.R
import com.example.spacex.SpaceXDetailPage

import com.example.spacex.databinding.ActivitySpacexListBinding
import com.squareup.picasso.Picasso


class SpaceXAdapter(var spasXList: SpaceXDataX, private var context: Context) :
    RecyclerView.Adapter<SpaceXAdapter.ViewHolder>() {

    class ViewHolder(private val binding: ActivitySpacexListBinding) :
        RecyclerView.ViewHolder(binding.root) {

        fun onBinding(dataItem: SpaceXDataItem) {

            binding.tvMissionName.text = dataItem.mission_name
            binding.tvRocketName.text = dataItem.rocket?.rocket_name
            binding.tvLaunchSiteName.text = dataItem.launch_site?.site_name
            binding.tvDateLaunch.text = dataItem.launch_date_utc
            Picasso.get()
                .load(dataItem.links?.mission_patch_small)
                .placeholder(R.drawable.ic_baseline_bedroom_baby_24)
                .error(R.drawable.ic_baseline_bedroom_baby_24)
                .into(binding.ivSpacex)


        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return SpaceXAdapter.ViewHolder(
            ActivitySpacexListBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.onBinding(spasXList[position])
        holder.itemView.setOnClickListener {
            val missionName = spasXList[position].mission_name
            val rocketName = spasXList[position].rocket?.rocket_name
            val lunchSiteName = spasXList[position].launch_site?.site_name
            val dateLaunch = spasXList[position].launch_date_utc
            val image = spasXList[position].links?.mission_patch_small
            val details= spasXList[position].details
            var intent = Intent(context,SpaceXDetailPage::class.java)

            intent.putExtra("MissionName",missionName)
            intent.putExtra("RocketName",rocketName)
            intent.putExtra("LunchSiteName",lunchSiteName)
            intent.putExtra("DateLaunch", dateLaunch)
            intent.putExtra(" Image", image)
            intent.putExtra("Details",details)
            context.startActivity(intent)

        }
    }

    override fun getItemCount(): Int {
        return spasXList.size
    }
}