package com.example.tryggaklassenpod.navigations

import android.os.Build
import androidx.annotation.RequiresApi
import androidx.compose.runtime.Composable
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavType
import com.example.tryggaklassenpod.screens.Screen
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.example.tryggaklassenpod.screens.AboutScreen
import com.example.tryggaklassenpod.screens.HomeScreen
import com.example.tryggaklassenpod.screens.AdminScreen
import com.example.tryggaklassenpod.screens.UploadPodcast
import com.example.tryggaklassenpod.screens.PlayerScreen
import com.example.tryggaklassenpod.screens.PodcastViewModel
import com.example.tryggaklassenpod.screens.OwnerPageContent



@RequiresApi(Build.VERSION_CODES.O)
@Composable
fun Navigation() {
    val navController = rememberNavController()

    val podcastViewModel: PodcastViewModel = viewModel()

    NavHost(navController = navController, startDestination = Screen.OwnerPage.route){

        composable(route = Screen.HomeScreen.route){
            HomeScreen(podcastUiState = podcastViewModel.podcastUiState, navController = navController)
        }

        composable(route = Screen.AboutScreen.route){
            AboutScreen(navController = navController)
        }

        composable(route = Screen.AdminScreen.route){
            AdminScreen(navController = navController)
        }

        composable(route = Screen.UploadPodcast.route){
            UploadPodcast(navController = navController)
        }


        composable(
            route = "${Screen.PlayerScreen.route}/{episodeId}",
            arguments = listOf(
                navArgument(name = "episodeId") {
                    type = NavType.IntType
                }
            )
        ) {index ->
            val episodeId = index.arguments?.getInt("episodeId")
            PlayerScreen(
                episodeId = episodeId,
                viewModel = podcastViewModel,
                goBack = {
                    navController.popBackStack()
                }
            )
        }

        composable(route = Screen.OwnerPage.route){
            OwnerPageContent(navController = navController)
        }
    }
}