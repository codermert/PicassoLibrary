package com.example.picassolibrary

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.picassolibrary.databinding.ActivityMainBinding
import com.squareup.picasso.Picasso

/*
Developed by Coder Mert
 */


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        // ViewBinding
        val mViewBinding: ActivityMainBinding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(mViewBinding.root)

        mViewBinding.buttonShow.setOnClickListener{

            val url = "https://i.imgur.com/aP2m2pV.jpg" //  urlden resmi çek imageviewde göster

            Picasso.get()
                .load(url)
                .into(mViewBinding.imageView)
        }




    }
}