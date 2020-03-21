package pl.mkonkel.wsb.firebasedb.model

import com.google.firebase.database.IgnoreExtraProperties

@IgnoreExtraProperties
data class Note(
    val title: String? = "",
    val message: String? = ""
)