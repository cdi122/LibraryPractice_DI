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

        Glide.with(this).load("http://cloudfront-ap-northeast-1.images.arcpublishing.com/chosunbiz/4VTMIGOICP2DUYW6ZUWVKEDET4.png").into(lectureImg1)
//  전화걸기버튼 누르면 권한확인 / 전화 연결
        callBtn.setOnClickListener {
//            라이브러리 활용 -> 전화 권한 확인 -> 실제 전화 연결
        }

    }
}