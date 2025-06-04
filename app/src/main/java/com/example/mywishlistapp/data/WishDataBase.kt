package com.example.mywishlistapp.data

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.mywishlistapp.data.Wish
import com.example.mywishlistapp.data.WishDao

@Database(
    entities = [Wish :: class],
    version = 1,
    exportSchema = false
)
abstract class WishDataBase : RoomDatabase () {
    abstract fun wishDao(): WishDao
}