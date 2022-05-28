package com.mywedding.domain.model

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
class Invited(
    @PrimaryKey var id: String,
    var name: String,
    var number: String,
    var isActive: Boolean = true,
)