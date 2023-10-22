package com.example.tryggaklassenpod.screens

sealed class Screen(val route: String){
    object HomeScreen: Screen("homeScreen")

    object AboutEng: Screen("AboutEng")
    object AboutSwe: Screen("AboutSwe")
    object AboutFr: Screen("AboutFr")
    object AboutSp: Screen("AboutSp")
    object AboutEst: Screen("AboutEst")
    object AboutAr: Screen("AboutAr")


    object LoginScreen: Screen("LoginScreen")
    object AdminScreen: Screen("adminScreen")
    object UploadPodcast: Screen("uploadPodcast")
    object PodcastsList: Screen("podcastsList")
    object EditPodcasts: Screen("editPodcasts")
    object CommentReviewScreen: Screen("CommentReviewScreen")
    object PlayerScreen: Screen("playerScreen")

    object OwnerPage: Screen("OwnerPage")

}