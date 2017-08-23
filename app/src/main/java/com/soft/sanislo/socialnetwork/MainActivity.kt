package com.soft.sanislo.socialnetwork

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.text.TextUtils
import android.util.Log
import android.widget.Toast
import com.google.firebase.auth.FirebaseAuth


class MainActivity : BaseActivity() {
    val TAG = "MainActivity"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val user = User("id1", "Andras", "blablabla.png")
        Log.d(TAG, user.toString())
        Log.d(TAG, isAuthenticated().toString())
        makeToast("hi")
        makeToast("hi fast", Toast.LENGTH_SHORT)
    }


}