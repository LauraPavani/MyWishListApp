package com.example.mywishlistapp.data

class Wish(
    val id: Long = 0L,
    val title: String = "",
    val description: String = ""
)

object DummyWish{
    val wishList = listOf(
        Wish(title = "Google Watch 2",
            description = "An Android Watch"),
        Wish(title = "Be Android Developer",
            description = "From Android Jr to Sr in a year ;)"),
        Wish(title = "Start easy and grow fast in the mobile development",
            description = "Making my dreams come true"),
        Wish(title = "New headset",
            description = "A ParaEar HiFi Stereo Wireless Headphone"),
        Wish(title = "New House",
            description = "A house anywhere in the shire"),
        Wish(title = "Popcorn",
            description = "Popcorn with butter"),

    )
}