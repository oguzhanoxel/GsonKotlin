package com.oguzhan.gsonkotlin

import com.google.gson.annotations.SerializedName

class Address(
    @SerializedName("country")
    private val mCountry: String,
    @SerializedName("city")
    private val mCity: String
)