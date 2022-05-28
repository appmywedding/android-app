package com.mywedding.domain.model

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.google.gson.annotations.SerializedName

@Entity
class Invited(
    @SerializedName("id") @PrimaryKey var id: String,
    @SerializedName("name") var name: String,
    @SerializedName("number") var number: String,
    @SerializedName("isActive") var isActive: Boolean = true,
)