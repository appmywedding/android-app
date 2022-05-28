package com.mywedding.data.remote

import com.mywedding.domain.model.Invited
import retrofit2.http.Body
import retrofit2.http.GET

interface API {
    @GET("invites/getAll")
    suspend fun getInvited(@Body uid: String): List<Invited>
}