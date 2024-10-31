package com.viona.klinikappmi2a

import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class DetailPage : AppCompatActivity() {
    private lateinit var gambarDokter : ImageView
    private lateinit var namaDokter : TextView
    private lateinit var spesialis : TextView
    private lateinit var jumlahRating : TextView
    private lateinit var rating : TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_detail_page)

        gambarDokter = findViewById(R.id.gambarDokter)
        namaDokter = findViewById(R.id.namaDokter)
        spesialis = findViewById(R.id.spesialis)
        jumlahRating = findViewById(R.id.jumlahRating)
        rating = findViewById(R.id.rating)

        val gambar = intent.getIntExtra("gambarDokter", 0)
        val nama = intent.getStringExtra("namaDokter")
        val spesial = intent.getStringExtra("spesialis")
        val jmlRating = intent.getStringExtra("jumlahRating")
        val rate = intent.getStringExtra("rating")

        gambarDokter.setImageResource(gambar)
        namaDokter.setText(nama)
        spesialis.setText(spesial)
        jumlahRating.setText(jmlRating)
        rating.setText(rate)

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}