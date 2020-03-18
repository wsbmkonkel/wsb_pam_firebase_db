package pl.mkonkel.wsb.firebasedb

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
//    TODO: Add FirebaseDatabase Instance here

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//      TODO: Invoke listener created below

//      TODO: Add some UI handling here
//      setOnClickListener() on the button
//      then inside this listener get text from editText
    }


//    TODO: Add DatabaseListener
//    Get child("childName") - first branch
//    Get child("branchName") - get element in this branch
//    addValueEventListener
//
//    onDataChane() will be invoked when any data will be modified in whole child branch.
//    You can print changed data in the log using Timber.i(data)

//    TODO: Add Helper method for adding "news" to the DB.
//    child() - go to notes branch
//    child() - go to element in branch (ec. User One notes).
//    child() - value in branch
//    setValue(givenValue)
//
//    You can additional add onSuccess and onFailureListener
}
