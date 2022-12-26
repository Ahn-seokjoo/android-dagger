package com.example.android.dagger

import android.content.Context
import com.example.android.dagger.di.AppSubComponents
import com.example.android.dagger.login.LoginComponent
import com.example.android.dagger.registration.RegistrationComponent
import com.example.android.dagger.storage.StorageModuleWithBinds
import com.example.android.dagger.user.UserComponent
import com.example.android.dagger.user.UserManager
import dagger.BindsInstance
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [StorageModuleWithBinds::class, AppSubComponents::class]) // 컴포넌트는 대거 그래프를 그려줍니다
interface AppComponent {
    @Component.Factory
    interface Factory {
        fun create(@BindsInstance context: Context): AppComponent
    }

    fun userManager(): UserManager

    fun loginComponent(): LoginComponent.Factory
    fun registrationComponent(): RegistrationComponent.Factory
    fun userComponent(): UserComponent.Factory

    // Component는 이거에 대한 클래스를 만들어줌
//    fun inject(activity: MainActivity)
}
