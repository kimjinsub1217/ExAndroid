package com.jinsub.fastcampus_blind.data.repository

import com.jinsub.fastcampus_blind.data.model.ContentMapper.toContent
import com.jinsub.fastcampus_blind.data.model.ContentMapper.toEntity
import com.jinsub.fastcampus_blind.data.model.ContentMapper.toRequest
import com.jinsub.fastcampus_blind.data.source.local.dao.ContentDao
import com.jinsub.fastcampus_blind.data.source.remote.api.ContentService
import com.jinsub.fastcampus_blind.domain.model.Content
import com.jinsub.fastcampus_blind.domain.repository.ContentRepository
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import java.io.IOException
import javax.inject.Inject

class ContentRepositoryImpl @Inject constructor(
    private val contentDao: ContentDao,
    private val contentService: ContentService
) : ContentRepository {

    override fun loadList(): Flow<List<Content>> {
        return flow {
            try {
                contentService.getList().data.map { it.toContent() }.also { list ->
                    contentDao.insertAll(list.map { it.toEntity() })
                }
            } finally {
                contentDao.selectAll().collect { list ->
                    emit(list.map { it.toContent() })
                }
            }
        }
    }

    override suspend fun insert(item: Content): Boolean {
        return try {
            contentService.saveItem(item.toRequest()).also {
                if (it.success) {
                    it.data?.let { contentDto ->
                        contentDao.insert(contentDto.toEntity())
                    }
                }
            }
            true
        } catch (e: IOException) {
            false
        }
    }

    override suspend fun update(item: Content): Boolean {
        return try {
            contentService.updateItem(item.toRequest()).also {
                if (it.success) {
                    it.data?.let { contentDto ->
                        contentDao.insert(contentDto.toEntity())
                    }
                }
            }
            true
        } catch (e: IOException) {
            false
        }
    }

    override suspend fun delete(item: Content): Boolean {
        return try {
            item.id?.let { id ->
                contentService.deleteItem(id).also {
                    if (it.success) {
                        contentDao.delete(item.toEntity())
                    }
                }
            }
            true
        } catch (e: IOException) {
            false
        }
    }
}