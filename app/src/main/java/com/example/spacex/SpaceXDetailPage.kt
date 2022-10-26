package com.example.spacex
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView


class SpaceXDetailPage : AppCompatActivity() {

    private var tvMissionName:TextView?=null
    private var tvRocketName:TextView?=null
    private var tvLaunchSiteName:TextView?=null
    private var tvDateLaunch:TextView?=null
    private var tvDetail:TextView?=null
    private var ivSpacex:ImageView?=null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_space_xdetail_page)
        initializeObject()
        setTextValues()
    }
    private fun initializeObject() {
        tvMissionName = findViewById(R.id.tv_mission_name)
        tvRocketName = findViewById(R.id.tv_rocket_name)
        tvLaunchSiteName = findViewById(R.id.tv_launch_site_Name)
        tvDateLaunch = findViewById(R.id.tv_date_launch)
        tvDetail = findViewById(R.id.tv_detail)
        ivSpacex = findViewById(R.id.iv_spacex)
    }

    private fun setTextValues() {
        tvMissionName?.text = intent.getStringExtra("missionName")
        tvRocketName?.text = intent.getStringExtra("RocketName")
        tvLaunchSiteName?.text = intent.getStringExtra("LunchSiteName")
        tvDateLaunch?.text = intent.getStringExtra("DateLaunch")
        tvDetail?.text = intent.getStringExtra("Details")
        var num: Int = intent.getIntExtra("Image", R.drawable.image_o)
        ivSpacex?.setImageResource(num)
    }
}