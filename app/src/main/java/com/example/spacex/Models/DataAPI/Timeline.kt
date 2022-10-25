package com.example.spacex.Models.DataAPI

import com.google.gson.annotations.SerializedName

data class Timeline(
    var beco: Int?, // 149
    var center_core_boostback: Int?, // 204
    var center_core_entry_burn: Int?, // 407
    var center_core_landing: Int?, // 499
    var center_stage_sep: Int?, // 187
    var dragon_bay_door_deploy: Int?, // 8808
    var dragon_separation: Int?, // 575
    var dragon_solar_deploy: Int?, // 713
    var engine_chill: Int?, // -420
    var fairing_deploy: Int?, // 217
    var first_stage_boostback_burn: Int?, // 240
    var first_stage_entry_burn: Int?, // 480
    var first_stage_landing: Int?, // 600
    var first_stage_landing_burn: Int?, // 564
    var go_for_launch: Int?, // -45
    var go_for_prop_loading: Int?, // -2280
    var ignition: Int?, // -3
    var liftoff: Int?, // 0
    var maxq: Int?, // 76
    var meco: Int?, // 174
    var payload_deploy: Int?, // 855
    var payload_deploy_1: Int?, // 1800
    var payload_deploy_2: Int?, // 2100
    var prelaunch_checks: Int?, // -60
    var propellant_pressurization: Int?, // -60
    var rp1_loading: Int?, // -2100
    @SerializedName("seco-1")
    var seco1: Int?, // 476
    @SerializedName("seco-2")
    var seco2: Int?, // 1680
    @SerializedName("seco-3")
    var seco3: Int?, // 7684
    @SerializedName("seco-4")
    var seco4: Int?, // 12483
    var second_stage_ignition: Int?, // 179
    var second_stage_restart: Int?, // 1620
    var side_core_boostback: Int?, // 170
    var side_core_entry_burn: Int?, // 401
    var side_core_landing: Int?, // 478
    var side_core_sep: Int?, // 153
    var stage1_lox_loading: Int?, // -2100
    var stage1_rp1_loading: Int?, // -3000
    var stage2_lox_loading: Int?, // -960
    var stage2_rp1_loading: Int?, // -2100
    var stage_sep: Int?, // 176
    var webcast_launch: Int?, // 960
    var webcast_liftoff: Int? // 54
)