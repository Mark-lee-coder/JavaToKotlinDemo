package com.sriyank.javatokotlindemo.models

import io.realm.RealmObject

data class Owner(var id : Int, var login: String?) : RealmObject() //this is a constructor