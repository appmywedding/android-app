package com.mywedding.data.remote

import com.mywedding.domain.model.Invited
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.POST

interface API {

    /* INVITES */
    @GET("invites/getAll")
    suspend fun get(@Body uid: String): List<Invited>

    @POST("invites/add")
    suspend fun add(@Body invited: List<Invited>)

    @POST("invites/remove")
    suspend fun remove(@Body invited: Invited)

    @POST("invites/update")
    suspend fun update(@Body invited: Invited)
    /* INVITES */

}