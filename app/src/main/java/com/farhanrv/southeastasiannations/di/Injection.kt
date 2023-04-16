package com.farhanrv.southeastasiannations.di

import com.farhanrv.southeastasiannations.data.AppRepository

object Injection {
    fun provideRepository(): AppRepository {
        return AppRepository.getInstance()
    }
}
