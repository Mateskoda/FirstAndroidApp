package com.example.vlt

import androidx.room.Entity
import androidx.room.PrimaryKey

//entity defines a table
//each uinstance of this class reopreseent a row in the db table
@Entity(tableName = "Item")
data class Item(
    @PrimaryKey(autoGenerate = true)
    val id :Int = 0,

    val name :String,
    val price : Double,
    val quantity:Int

)
