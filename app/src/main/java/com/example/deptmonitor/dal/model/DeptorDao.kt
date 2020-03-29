package com.example.deptmonitor.dal.model

import androidx.room.*

@Dao
interface DeptorDao {

    @Query("SELECT * FROM deptors")
    fun getAll(): List<Deptor>

    @Query("SELECT * FROM deptors WHERE id IN (:deptorIds)")
    fun loadAllByIds(deptorIds: IntArray): List<Deptor>

    @Query("SELECT * FROM deptors WHERE name LIKE :name")
    fun findByName(name: String): Deptor

    @Insert(onConflict = OnConflictStrategy.ABORT)
    fun insertDeptors(vararg deptors: Deptor)

    @Update
    fun update(vararg deptors: Deptor)

    @Delete
    fun delete(vararg deptors: Deptor)
}