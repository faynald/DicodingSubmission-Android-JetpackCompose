package com.farhanrv.southeastasiannations.data

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flowOf

class AppRepository {
    private val nationList = mutableListOf<NationModel>()

    init {
        if (nationList.isEmpty()) {
            NationList.getNationList().forEach {
                nationList.add(it)
            }
        }
    }

    fun getAllNations(): Flow<List<NationModel>> {
        return flowOf(nationList)
    }

    fun getNationByName(name: String): NationModel {
        return nationList.first {
            it.name == name
        }
    }

    companion object {
        @Volatile
        private var instance: AppRepository? = null

        fun getInstance(): AppRepository =
            instance ?: synchronized(this) {
                AppRepository().apply {
                    instance = this
                }
            }
    }
}