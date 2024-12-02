package com.example.vlt

import androidx.room.Database
import androidx.room.RoomDatabase

@Database(entities = [Item::class],version =1)
abstract class MyDatabase:RoomDatabase() {

    //getting a dao instance
    abstract fun itemDAO():
}