package com.example.android.dagger.di

import com.example.android.dagger.di.module.ViewModelFactoryModule
import com.example.android.dagger.di.module.ViewModelModule
import dagger.Module

@Module(subcomponents = [RegistrationComponent::class, LoginComponent::class, UserComponent::class ])
class AppSubComponent
