package com.example.spacex.Models.DataAPI

data class Payload(
    var cap_serial: String?, // C101
    var cargo_manifest: String?, // https://en.wikipedia.org/wiki/SpaceX_CRS-1#Payload
    var customers: List<String?>?,
    var flight_time_sec: Int?, // 11940
    var manufacturer: String?, // SSTL
    var mass_returned_kg: Double?, // 1859.7
    var mass_returned_lbs: Double?, // 3747.9
    var nationality: String?, // United States
    var norad_id: List<Int?>?,
    var orbit: String?, // LEO
    var orbit_params: OrbitParams?,
    var payload_id: String?, // FalconSAT-2
    var payload_mass_kg: Double?, // 5383.85
    var payload_mass_lbs: Double?, // 5460.9
    var payload_type: String?, // Satellite
    var reused: Boolean?, // false
    var uid: String? // UerI6qmZTU2Fx2efDFm3QQ==
)