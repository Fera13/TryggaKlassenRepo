package com.example.tryggaklassenpod

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.ui.Modifier
<<<<<<< HEAD
=======
import androidx.compose.ui.tooling.preview.Preview
import com.example.tryggaklassenpod.screens.HomeScreen
import com.example.tryggaklassenpod.dataClasses.episodesList
>>>>>>> 8839528dffc45f5e7f8a45eec6784636e5143632
import com.example.tryggaklassenpod.navigations.Navigation
import com.example.tryggaklassenpod.ui.theme.TryggaKlassenPodTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            TryggaKlassenPodTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    HomeScreen()
                    Navigation()
                }
            }
        }
    }
}

