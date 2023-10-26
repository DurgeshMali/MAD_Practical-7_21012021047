package com.example.mad_practical_7_21012021047

import android.annotation.SuppressLint
import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.MediaController
import android.widget.VideoView
import com.google.android.material.floatingactionbutton.FloatingActionButton

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val myVideoView:VideoView =findViewById(R.id.videoView)
        val mediaController = MediaController(this)
        val uri:Uri = Uri.parse("android.resource://" + packageName + "/" + R.raw.thestoryoflight)
        myVideoView.setMediaController(mediaController)
        mediaController.setAnchorView(myVideoView)
        myVideoView.setVideoURI(uri)
        myVideoView.requestFocus()
        myVideoView.start()

        val button: FloatingActionButton =findViewById(R.id.floatingActionButton)
        button.setOnClickListener {
            Intent(this@MainActivity, YouTubeActivity::class.java).also {
                startActivity(it)
            }
        }

//        val button1: FloatingActionButton =findViewById(R.id.floatingActionButton2)
//        button1.setOnClickListener {
//            Intent(this@MainActivity, MainActivity::class.java).also {
//                startActivity(it)
//            }
//        }
    }
}