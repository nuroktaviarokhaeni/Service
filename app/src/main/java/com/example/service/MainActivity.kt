package com.example.service

import android.content.Intent
import android.media.MediaPlayer
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // button facebook jika diklik akan menampilkan halaman facebook.com
        btn_facebook.setOnClickListener({
            val i = Intent(Intent.ACTION_VIEW,Uri.parse("http://www.facebook.com"))
            startActivity(i)
        })

        // button instagram jika diklik akan menampilkan halaman instagram.com
        btn_instagram.setOnClickListener({
            val i = Intent(Intent.ACTION_VIEW,Uri.parse("http://www.instagram.com"))
            startActivity(i)
        })

        //mendeklarasikan variabel MediaPlayer dan memanggil data mp3
        var Mediaplayer: MediaPlayer? = MediaPlayer.create(this, R.raw.lagu)

        //button yang berfungsi untuk memutar mp3
        btn_play.setOnClickListener {
            Mediaplayer?.start()
        }

        //button yang berfungsi untuk melakukkan pause mp3
        btn_pause.setOnClickListener {
            Mediaplayer?.pause()
        }

        //button untuk melakukkan stop mp3
        btn_stop.setOnClickListener {
            Mediaplayer?.pause()
            Mediaplayer?.seekTo(0)
        }
    }
}
