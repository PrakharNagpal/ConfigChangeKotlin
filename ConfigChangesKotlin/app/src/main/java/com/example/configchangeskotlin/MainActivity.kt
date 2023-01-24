package com.example.configchangeskotlin

//import androidx.appcompat.app.AppCompatActivity
//import android.os.Bundle
//
//class MainActivity : AppCompatActivity() {
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_main)
//    }
//}
import android.app.Activity
import android.content.res.Configuration
import android.os.Bundle
import android.util.Log

class MainActivity : Activity() {
    public override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.d(TAG, "onCreate")
    }


    override fun onConfigurationChanged(newConfig: Configuration) {
        super.onConfigurationChanged(newConfig)

        Log.d(TAG, "onConfigurationChanged")
        if (newConfig.orientation == Configuration.ORIENTATION_LANDSCAPE) {

            Log.d(TAG, "Orientation Landscape")
        }
        if (newConfig.keyboardHidden == Configuration.KEYBOARDHIDDEN_NO) {

            Log.d(TAG, "Keyboard Hidden No")
        }
    }

    companion object {

        private const val TAG = "MainActivity"
    }
}