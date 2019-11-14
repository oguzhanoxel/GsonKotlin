package com.oguzhan.gsonkotlin

import com.google.gson.annotations.SerializedName

class Employee(
    @SerializedName("first_name")
    private val mFirstName: String,
    @SerializedName("age")
    private val mAge: Int,
    @SerializedName("mail")
    private val mMail: String,
    @SerializedName("address")
    private val mAddress: Address,
    @SerializedName("family")
    private val mFamily : List<FamilyMember>
)