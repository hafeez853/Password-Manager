package com.example.onepassword.interfaces

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.example.onepassword.dataclasses.User

@Dao
interface UserDao {
//    @Insert(onConflict = OnConflictStrategy.REPLACE)
//    suspend fun insert(user: User)
//
//    @Query("SELECT * FROM user WHERE email = :email")
//
//    suspend fun getUserByEmail(email: String): User?

}

