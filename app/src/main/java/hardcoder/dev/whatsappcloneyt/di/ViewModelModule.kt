package hardcoder.dev.whatsappcloneyt.di

import hardcoder.dev.whatsappcloneyt.ui.features.splash.SplashViewModel
import org.koin.dsl.module

val viewModelModule = module {
    factory { SplashViewModel() }
}