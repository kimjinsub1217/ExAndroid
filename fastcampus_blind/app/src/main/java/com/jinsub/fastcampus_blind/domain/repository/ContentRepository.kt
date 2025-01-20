package com.jinsub.fastcampus_blind.domain.repository

import com.jinsub.fastcampus_blind.domain.model.Content
import kotlinx.coroutines.flow.Flow

interface ContentRepository {

    fun loadList(): Flow<List<Content>>

    suspend fun insert(item: Content): Boolean

    suspend fun update(item: Content): Boolean

    suspend fun delete(item: Content): Boolean
}