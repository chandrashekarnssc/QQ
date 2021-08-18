package com.aacproject.example.quriosityquiz

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.aacproject.example.quriosityquiz.wildlife
import kotlinx.android.synthetic.main.*
import kotlinx.android.synthetic.main.activity_topics_page.*


class Topics_page : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_topics_page)
        supportActionBar?.hide();

        wildlife.setOnClickListener {

            var intent = Intent(this,com.aacproject.example.quriosityquiz.wildlife::class.java)
            startActivity(intent)

            finish()
        }

        current_affairs.setOnClickListener {
            var intent = Intent(this,cur_affairs::class.java)
            startActivity(intent)
            finish()
        }

        science.setOnClickListener {
            var intent = Intent(this,science_tech::class.java)
            startActivity(intent)
            finish()
        }

        sports.setOnClickListener {
            var intent = Intent(this,com.aacproject.example.quriosityquiz.sports::class.java)
            startActivity(intent)
            finish()
        }

        capitals.setOnClickListener {
            var intent = Intent(this,com.aacproject.example.quriosityquiz.capitals::class.java)
            startActivity(intent)
            finish()
        }



    }
}

