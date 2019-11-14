package com.oguzhan.gsonkotlin

import com.google.gson.annotations.SerializedName

class FamilyMember(
    @SerializedName("role")
    private val mRole:String,
    @SerializedName("age")
    private val mAge:Int
)