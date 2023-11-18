package com.spotify.quavergd06.data.api

import com.google.gson.annotations.SerializedName


data class Tracks (

    @SerializedName("href"     ) var href     : String?          = null,
    @SerializedName("limit"    ) var limit    : Int?             = null,
    @SerializedName("next"     ) var next     : String?          = null,
    @SerializedName("offset"   ) var offset   : Int?             = null,
    @SerializedName("previous" ) var previous : String?          = null,
    @SerializedName("total"    ) var total    : Int?             = null,
    @SerializedName("items"    ) var items    : ArrayList<Items> = arrayListOf()

)