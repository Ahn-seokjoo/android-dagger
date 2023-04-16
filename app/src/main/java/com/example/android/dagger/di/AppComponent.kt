package com.example.android.dagger.di

import android.content.Context
import androidx.lifecycle.ViewModel
import com.example.android.dagger.di.module.StorageModule
import com.example.android.dagger.di.module.ViewModelFactoryModule
import com.example.android.dagger.di.module.ViewModelModule
import com.example.android.dagger.user.UserManager
import dagger.BindsInstance
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [StorageModule::class, AppSubComponent::class])
interface AppComponent {

    @Component.Factory
    interface Factory {
        fun create(@BindsInstance context: Context): AppComponent
    }
    fun userManager(): UserManager

    fun registrationComponent(): RegistrationComponent.Factory
    fun loginComponent(): LoginComponent.Factory
}
