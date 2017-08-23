package com.soft.sanislo.socialnetwork

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.text.TextUtils
import android.util.Log
import android.widget.Toast
import com.google.firebase.auth.FirebaseAuth

open class BaseActivity : AppCompatActivity() {
    private val TAG = "BaseActivity"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    protected fun getUid() : String? {
        return FirebaseAuth.getInstance().currentUser?.uid;
    }

    protected fun isAuthenticated() : Boolean = !TextUtils.isEmpty(FirebaseAuth.getInstance().currentUser?.uid)

    protected fun logd(tag : String = TAG, text : String) {
        Log.d(TAG, text)
    }

    protected fun makeToast(text : String, length : Int = Toast.LENGTH_LONG) {
        Toast.makeText(this, text, length).show()
    }
}