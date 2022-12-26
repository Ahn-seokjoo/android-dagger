package com.example.android.dagger.storage

import javax.inject.Inject

class ClassDependingOnStorage(@RegistrationStorage private val storage: Storage) {
    // 가될수도 있고
}

class ClassDependingOnStorage2 {

    // 가될수도 있음
    @Inject
    @field:RegistrationStorage
    lateinit var storage: Storage
}
