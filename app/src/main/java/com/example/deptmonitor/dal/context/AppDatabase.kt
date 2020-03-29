package com.example.deptmonitor.dal.context

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.deptmonitor.dal.model.Deptor
import com.example.deptmonitor.dal.model.DeptorDao

@Database(entities = arrayOf(Deptor::class), version = 1)
abstract class AppDatabase : RoomDatabase(){
    abstract fun deptorDao(): DeptorDao
}