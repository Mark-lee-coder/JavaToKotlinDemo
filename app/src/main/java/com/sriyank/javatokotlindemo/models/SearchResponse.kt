package com.sriyank.javatokotlindemo.models

import com.google.gson.annotations.SerializedName
import io.realm.RealmList
import io.realm.RealmObject

data class SearchResponse(@SerializedName("total_count") var totalCount : Int, var items: RealmList<Repository>?) : RealmObject()