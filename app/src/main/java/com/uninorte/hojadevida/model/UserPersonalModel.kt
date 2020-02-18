package com.uninorte.hojadevida.model

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
class UserPersonalModel (val name: String ,
                         val edad : Int,
                         val Estado : String,
                         val imagen: Int) : Parcelable {
}