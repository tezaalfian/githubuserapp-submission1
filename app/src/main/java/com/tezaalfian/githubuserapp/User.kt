package com.tezaalfian.githubuserapp

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class User (
    var name: String,
    var username: String,
    var avatar: Int,
    var location: String,
    var repository: Int,
    var company: String,
    var followers: Int,
    var following: Int,
) : Parcelable