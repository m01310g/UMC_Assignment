package com.umc.roomdbpractice

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.umc.roomdbpractice.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    // RoomDB 사용
    lateinit var db: ProfileDatabase
    var list = ArrayList<Profile>()

    lateinit var binding: ActivityMainBinding
    lateinit var customAdapter: CustomAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        db = ProfileDatabase.getInstance(this)!!

        Thread {
            // db가 비어 있지 않을 때만 List에 값 입력
            val savedContacts = db.profileDao().getAll()

            if (savedContacts.isNotEmpty()) {
                list.addAll(savedContacts)
            }
        }.start()

        binding.button.setOnClickListener {
            Thread {
                list.add(Profile("베어", "24", "0000"))
                db.profileDao().insert(Profile("베어", "24", "0000"))

                val list = db.profileDao().getAll()
                Log.d("Inserted Primary Key", list[list.size-1].id.toString())
            }.start()
            customAdapter.notifyDataSetChanged()
        }
        customAdapter = CustomAdapter(list, this)
        binding.mainProfileLv.adapter = customAdapter

    }
}