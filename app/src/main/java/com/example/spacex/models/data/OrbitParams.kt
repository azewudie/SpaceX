package com.example.spacex.models.data

data class OrbitParams(
    var apoapsis_km: Double?, // 622.56
    var arg_of_pericenter: Double?, // 85.029
    var eccentricity: Double?, // 0.0012404
    var epoch: String?, // 2020-12-21T02:41:06.000Z
    var inclination_deg: Double?, // 9.3453
    var lifespan_years: Double?, // 0.00547945
    var longitude: Double?, // 78.5
    var mean_anomaly: Double?, // 275.1325
    var mean_motion: Double?, // 14.84904616
    var periapsis_km: Double?, // 605.214
    var period_min: Double?, // 96.975
    var raan: Double?, // 236.9673
    var reference_system: String?, // geocentric
    var regime: String?, // low-earth
    var semi_major_axis_km: Double? // 6992.022
)