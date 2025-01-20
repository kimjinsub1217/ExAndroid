package com.jinsub.fastcampus_blind.domain.usecase

import com.jinsub.fastcampus_blind.domain.model.Content
import com.jinsub.fastcampus_blind.domain.repository.ContentRepository
import javax.inject.Inject

class ContentUseCase @Inject constructor(
    private val contentRepository: ContentRepository
) {
    fun loadList() = contentRepository.loadList()

    suspend fun save(item: Content) = contentRepository.insert(item)

    suspend fun delete(item: Content) = contentRepository.delete(item)
}