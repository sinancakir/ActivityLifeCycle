package com.androidedu.kodluyoruzakademi.activitylifecycle

import android.app.Fragment
import android.content.Intent
import android.content.res.Configuration
import android.os.Bundle
import android.os.PersistableBundle
import android.support.v7.app.AppCompatActivity
import android.util.Log
import android.view.Menu
import android.view.MenuInflater

class Main2Activity : AppCompatActivity() {

    val tag = "Main2Activity"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.e(tag, "onCreate : setContentView öncesi")
        setContentView(R.layout.activity_main2)
        // setContentView ile layout çağrımından sonra onContentChanged metodu çalışıyor.
        Log.e(tag, "onCreate : setContentView sonrası")
    }

    override fun onContentChanged() {
        super.onContentChanged()
        Log.e(tag, "onContentChanged")
    }

    override fun onStart() { // onCreate sonrası veya onRestart sonrasında çalışıyor.
        super.onStart()
        Log.e(tag, "onStart")
    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle?) {
        super.onRestoreInstanceState(savedInstanceState)
        Log.e(tag, "onRestoreInstanceState")
    }

    override fun onPostCreate(savedInstanceState: Bundle?, persistentState: PersistableBundle?) {
        super.onPostCreate(savedInstanceState, persistentState)
        Log.e(tag, "onPostCreate")
    }

    override fun onResume() { // onRestart veya onPause dan sonra çalışıyor.
        super.onResume()
        Log.e(tag, "onResume")
    }

    override fun onPostResume() {
        super.onPostResume()
        Log.e(tag, "onPostResume")
    }

    override fun onAttachedToWindow() {
        super.onAttachedToWindow()
        Log.e(tag, "onAttachedToWindow")
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean { // menu çağrıldıgında çalışıyor
        Log.e(tag, "onCreateOptionsMenu")
        val menuInflater: MenuInflater = getMenuInflater()
        menuInflater.inflate(R.menu.activity_menu, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onPrepareOptionsMenu(menu: Menu?): Boolean { // menu her çağrıldığında üzerine menu itemi ekleniyor
        Log.e(tag, "onPrepareOptionsMenu")
        val menuInflater: MenuInflater = getMenuInflater()
        menuInflater.inflate(R.menu.activity_menu, menu)
        return super.onPrepareOptionsMenu(menu)
    }

    override fun onPause() {
        super.onPause()
        Log.e(tag, "onPause")
    }

    override fun onSaveInstanceState(outState: Bundle?, outPersistentState: PersistableBundle?) {
        super.onSaveInstanceState(outState, outPersistentState)
        Log.e(tag, "onSaveInstanceState")
    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle?, persistentState: PersistableBundle?) {
        super.onRestoreInstanceState(savedInstanceState, persistentState)
        Log.e(tag, "onRestoreInstanceState")
    }

    override fun onStop() {
        super.onStop()
        Log.e(tag, "onStop")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.e(tag, "onDestroy")
    }

    override fun onUserInteraction() {
        super.onUserInteraction()
        Log.e(tag, "onUserInteraction")
    }

    override fun onUserLeaveHint() { // kullanıcı uygulamayı Home tuşu ile arka plana almadan önce çalışıyor
        super.onUserLeaveHint()
        Log.e(tag, "onUserLeaveHint")
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        Log.e(tag, "onActivityResult")
    }

    override fun onRestart() {
        super.onRestart()
        Log.e(tag, "onRestart")
    }

    override fun onAttachFragment(fragment: Fragment?) {
        super.onAttachFragment(fragment)
        Log.e(tag, "onAttachFragment")
    }

    override fun onConfigurationChanged(newConfig: Configuration?) {
        super.onConfigurationChanged(newConfig)
        Log.e(tag, "onConfigurationChanged")
    }

    override fun onBackPressed() { // geri tuşuna basılınca çalışıyor
        super.onBackPressed()
        Log.e(tag, "onBackPressed")
    }
}
