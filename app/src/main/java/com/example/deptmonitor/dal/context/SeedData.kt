package com.example.deptmonitor.dal.context

import com.example.deptmonitor.dal.model.Deptor

class SeedData(database: AppDatabase) {

    var database : AppDatabase

    init {
        this.database = database
    }

    fun invoke(){
        if(!database.deptorDao().getAll().any()){

            database.deptorDao().insertDeptors(
                Deptor("Jan", 100.00),
                Deptor("Pawel", 69.00),
                Deptor("Karol", 420.00),
                Deptor("Wojtek", 21.37))
        }
    }
}