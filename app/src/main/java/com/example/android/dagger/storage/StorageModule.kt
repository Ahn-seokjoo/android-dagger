package com.example.android.dagger.storage

import android.content.Context
import dagger.Module
import dagger.Provides
import javax.inject.Qualifier

@Retention(AnnotationRetention.BINARY)
@Qualifier
annotation class RegistrationStorage

@Retention(AnnotationRetention.BINARY)
@Qualifier
annotation class LoginStorage

@Module
interface StorageModule {

//    @Provides
//    fun providesStorage(context: Context): Storage {
//        return SharedPreferencesStorage(context)
//    }

    /**
     * qualifier를 통해 여러개의 구현이 됨
     */

    @RegistrationStorage
    @Provides
    fun providesRegistrationStorage(context: Context): Storage {
        return SharedPreferencesStorage("registration", context)
    }

    @LoginStorage
    @Provides
    fun provideLoginStorage(context: Context): Storage {
        return SharedPreferencesStorage("login", context)
    }
}
