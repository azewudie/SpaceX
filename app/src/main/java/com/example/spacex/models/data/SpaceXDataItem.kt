package com.example.spacex.models.data

import java.io.Serializable

data class SpaceXDataItem(
    var crew: List<Any?>?,
    var details: String?, // Engine failure at 33 seconds and loss of vehicle
    var flight_number: Int?, // 1
    var is_tentative: Boolean?, // false
    var last_date_update: String?, // 2019-11-08T02:42:07.000Z
    var last_ll_launch_date: String?, // 2019-11-30T00:00:00.000Z
    var last_ll_update: String?, // 2019-10-24T21:57:16.000Z
    var last_wiki_launch_date: String?, // 2019-11-11T14:56:00.000Z
    var last_wiki_revision: String?, // 5a43fcc5-01d1-11ea-9b27-0e1b4e421dcf
    var last_wiki_update: String?, // 2019-11-08T02:42:07.000Z
    var launch_date_local: String?, // 2006-03-25T10:30:00+12:00
    var launch_date_source: String?, // wiki
    var launch_date_unix: Int?, // 1143239400
    var launch_date_utc: String?, // 2006-03-24T22:30:00.000Z
    var launch_failure_details: LaunchFailureDetails?,
    var launch_site: LaunchSite?,
    var launch_success: Boolean?, // false
    var launch_window: Int?, // 0
    var launch_year: String?, // 2006
    var links: Links?,
    var mission_id: List<String?>?,
    var mission_name: String?, // FalconSat
    var rocket: Rocket?,
    var ships: List<String?>?,
    var static_fire_date_unix: Int?, // 1142553600
    var static_fire_date_utc: String?, // 2006-03-17T00:00:00.000Z
    var tbd: Boolean?, // false
    var telemetry: Telemetry?,
    var tentative_max_precision: String?, // hour
    var timeline: Timeline?,
    var upcoming: Boolean? // false
)