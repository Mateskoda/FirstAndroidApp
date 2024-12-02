package com.example.vlt

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update

@Dao
interface ItemDao {

    @Insert
    fun funInsertItem(item:Item)

    @Update
    fun updateItem(item:Item)

    @Query("DELETE FROM Item")
    fun deleteAllItems()

    @Query("SELECT * FROM Item order by id desc")
    fun getAllItemsInDB(): LiveData<List<Item>>

}