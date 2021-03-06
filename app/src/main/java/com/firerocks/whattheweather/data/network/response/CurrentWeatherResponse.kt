package com.firerocks.whattheweather.data.network.response

import com.firerocks.whattheweather.data.db.entity.CurrentWeatherEntry
import com.firerocks.whattheweather.data.db.entity.WeatherLocation
import com.google.gson.annotations.SerializedName

data class CurrentWeatherResponse(
    @SerializedName("current")
    val currentWeatherEntry: CurrentWeatherEntry,
    val location: WeatherLocation
)