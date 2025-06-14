package com.example.mywishlistapp.data

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "wish-table")
data class Wish(
    @PrimaryKey(autoGenerate = true)
    val id: Long = 0L,
    @ColumnInfo(name = "wish-title")
    val title: String = "",
    @ColumnInfo(name = "wish-desc")
    val description: String = ""
)

object DummyWish{
    val wishList = listOf(
        Wish(title = "Google Watch 2",
            description = "An Android Watch"),
        Wish(title = "Become Android Developer",
            description = "From nothing to Android Dev Jr and then Android Dev Sr in a year ;)"),
        Wish(title = "Start easy and grow fast in the mobile development",
            description = "Making my dreams come true"),
        Wish(title = "New headset",
            description = "A ParaEar HiFi Stereo Wireless Headphone"),
        Wish(title = "New House",
            description = "A big house anywhere in the shire"),
        Wish(title = "Popcorn",
            description = "Popcorn with butter"),

    )
}