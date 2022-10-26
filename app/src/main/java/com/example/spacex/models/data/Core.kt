package com.example.spacex.models.data

data class Core(
    var block: Int?, // 1
    var core_serial: String?, // Merlin1A
    var flight: Int?, // 1
    var gridfins: Boolean?, // false
    var land_success: Boolean?, // false
    var landing_intent: Boolean?, // false
    var landing_type: String?, // Ocean
    var landing_vehicle: String?, // JRTI-1
    var legs: Boolean?, // false
    var reused: Boolean? // false
)