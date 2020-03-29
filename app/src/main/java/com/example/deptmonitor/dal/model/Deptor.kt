package com.example.deptmonitor.dal.model

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.Index
import androidx.room.PrimaryKey

@Entity(tableName = "deptors", indices = arrayOf(Index(value = ["name"], unique = true)))
data class Deptor(
    @ColumnInfo(name = "name") val name: String?,
    @ColumnInfo(name = "dept_amount") val dept_amount: Double?
) {
    @PrimaryKey(autoGenerate = true)
    var id: Int = 0;
}