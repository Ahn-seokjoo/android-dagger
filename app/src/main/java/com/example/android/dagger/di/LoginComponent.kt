package com.example.android.dagger.di

import com.example.android.dagger.di.module.ViewModelFactoryModule
import com.example.android.dagger.di.module.ViewModelModule
import com.example.android.dagger.login.LoginActivity
import dagger.Subcomponent

@ActivityScope
@Subcomponent(modules = [ViewModelFactoryModule::class, ViewModelModule::class])
interface LoginComponent {

    @Subcomponent.Factory
    interface Factory {
        fun create(): LoginComponent
    }

    fun inject(activity: LoginActivity)
}
