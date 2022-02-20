package hardcoder.dev.whatsappcloneyt.ui

import android.app.Application
import hardcoder.dev.whatsappcloneyt.di.networkingModule
import hardcoder.dev.whatsappcloneyt.di.viewModelModule
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.startKoin
import org.koin.core.logger.Level

class BaseApp : Application() {

    override fun onCreate() {
        super.onCreate()
        setUpKoin()
    }

    private fun setUpKoin() {
        startKoin {
            androidLogger(level = Level.ERROR)
            androidContext(this@BaseApp)
            modules(
                viewModelModule,
                networkingModule
            )
        }
    }
}