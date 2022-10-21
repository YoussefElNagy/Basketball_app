package com.example.basketball_app

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.basketball_app.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    var teama = 0
    var teamb = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.resetbutton.setOnClickListener{ reset()}
        binding.freethrowA.setOnClickListener{teamAscore(1)}
        binding.points2a.setOnClickListener{teamAscore(2)}
        binding.points3a.setOnClickListener{teamAscore(3)}
        binding.freethrowB.setOnClickListener{teamBscore(1)}
        binding.points2b.setOnClickListener{teamBscore(2)}
        binding.points3b.setOnClickListener{teamBscore(3)}
    }

    private fun teamAscore(i: Int) {
        teama+=i
        binding.teamscorea.setText(teama.toString())
    }
    private fun teamBscore(i: Int) {
        teamb+=i
        binding.teamscoreb.setText(teamb.toString())
    }


    private fun reset() {
        teama=0
        teamb=0
        binding.teamscorea.setText(teama.toString())
        binding.teamscoreb.setText(teama.toString())
    }



}