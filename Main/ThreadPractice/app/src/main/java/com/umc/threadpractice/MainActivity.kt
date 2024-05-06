package com.umc.threadpractice

import android.os.Bundle
import android.util.Log
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // 스레드의 순서가 임의대로 바뀌면서 실행됨
        // 빠르게 바뀌기 때문에 동시에 실행되는 것처럼 보임
        val a = A()
        val b = B()

        a.start()
        a.join()
        b.start()


    }

    class A : Thread() {
        override fun run() {
            super.run()
            for (i in 1..1000) {
                Log.d("test", "first: $i")
            }
        }
    }

    class B : Thread() {
        override fun run() {
            super.run()
            for (i in 1000 downTo 1) {
                Log.d("test", "second: $i")
            }
        }
    }

}