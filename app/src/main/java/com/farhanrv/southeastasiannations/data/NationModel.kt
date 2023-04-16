package com.farhanrv.southeastasiannations.data

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class NationModel(
    val name: String,
    val flag: Int,
    val capitalCity: String,
    val currency: String,
    val history: String
) : Parcelable
