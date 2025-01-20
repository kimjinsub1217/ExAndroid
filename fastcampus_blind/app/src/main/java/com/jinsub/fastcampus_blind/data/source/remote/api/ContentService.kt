package com.jinsub.fastcampus_blind.data.source.remote.api

import com.jinsub.fastcampus_blind.data.model.dto.ContentDto
import com.jinsub.fastcampus_blind.data.model.dto.ContentResponse
import com.jinsub.fastcampus_blind.data.model.dto.ListResponse
import retrofit2.http.Body
import retrofit2.http.DELETE
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.Path

interface ContentService {

    @GET("47ef9c48-a18a-4a4e-8448-5ec88d27372a")
    suspend fun getList(): ListResponse

    @POST("save")
    suspend fun saveItem(@Body contentDto: ContentDto): ContentResponse

    @POST("update")
    suspend fun updateITem(@Body contentDto: ContentDto): ContentResponse

    @DELETE("{id}")
    suspend fun deleteItem(@Path("id") id: Int): ContentResponse
}