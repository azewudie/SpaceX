package com.example.spacex.Models.DataAPI

data class Rocket(
    var fairings: Fairings?,
    var first_stage: FirstStage?,
    var rocket_id: String?, // falcon1
    var rocket_name: String?, // Falcon 1
    var rocket_type: String?, // Merlin A
    var second_stage: SecondStage?
)