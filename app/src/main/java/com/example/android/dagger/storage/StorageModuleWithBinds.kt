package com.example.android.dagger.storage

import dagger.Binds
import dagger.Module

/**
 * 모듈은 @Inject constructor와 같이 인스턴스를 제공하는 방법에 대해서 이야기 하는 파일입니다.
 * 인터페이스에 대한 @Binds와
 * 클래스 생성자에 대한 @Provides가 있습니다.
 *
 * 이러한 모듈은 캡슐화도 됩니다다 */
@Module
abstract class StorageModuleWithBinds {
    /**
     * 반드시 abstract fun 으로 Binds를 만들어야하며, 파라미터로 구현체 타입(Impl과 같은..)을 지정해줍니다.
     * 이 코드를 통해 Storage 타입의 객체가 필요하면 SharedPreferencesStorage를 쓰라고 dagger 에게 말해주는 것
     * dagger는 함수의 이름은 신경쓰지 않고 파라미터와 리턴값만 신경씀
     * 또한 Binds가 abstract라서 모듈도 abstract
     */
    @Binds
    abstract fun bindStorage(storage: SharedPreferencesStorage): Storage
}
