package com.umc.roomdbpractice

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase

@Database(entities = [Profile::class], version = 1)
abstract class ProfileDatabase : RoomDatabase() {
    abstract fun profileDao(): ProfileDao

    // singleton pattern -> 객체를 여러 번 만들어도 한 번만 생성
    companion object {
        private var instance: ProfileDatabase? = null

        @Synchronized
        fun getInstance(context: Context): ProfileDatabase? {
            if (instance == null) {
                synchronized(ProfileDatabase::class) {
                    instance = Room.databaseBuilder(
                        context.applicationContext,
                        ProfileDatabase::class.java,
                        "user-database"     // 다른 데이터베이스와 이름 겹치지 않게 주의
                    ).build()
                }
            }
            return instance
        }
    }
}