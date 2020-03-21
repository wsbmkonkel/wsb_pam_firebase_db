package pl.mkonkel.wsb.firebasedb

import android.app.Application
import android.util.Log
import timber.log.Timber

class App : Application() {
    override fun onCreate() {
        super.onCreate()

        Timber.plant(Timber.DebugTree())
    }

    private companion object {
        const val TAG = "Application"
    }
}