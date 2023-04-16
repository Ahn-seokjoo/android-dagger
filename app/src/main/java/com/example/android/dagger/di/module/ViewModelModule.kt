package com.example.android.dagger.di.module

import androidx.lifecycle.ViewModel
import com.example.android.dagger.di.annotation.ViewModelKey
import com.example.android.dagger.login.LoginViewModel
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap

@Module
abstract class ViewModelModule {
    @Binds
    @IntoMap
    @ViewModelKey(LoginViewModel::class)
    abstract fun bindLoginViewModel(loginViewModel: LoginViewModel): ViewModel
}
