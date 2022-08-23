package com.example.librarypractice_di

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.bumptech.glide.Glide
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        profileImg.setOnClickListener {
            val myIntent = Intent (this, ViewProfilePhotoActivity::class.java)
            startActivity(myIntent)

        }

        Glide.with(this).load("https://cloudfront-ap-northeast-1.images.arcpublishing.com/chosunbiz/4VTMIGOICP2DUYW6ZUWVKEDET4.png").into(lectureImg1)

    }
}