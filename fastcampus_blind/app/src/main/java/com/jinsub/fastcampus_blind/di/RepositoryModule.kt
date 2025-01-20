package com.jinsub.fastcampus_blind.di

import com.jinsub.fastcampus_blind.data.repository.ContentRepositoryImpl
import com.jinsub.fastcampus_blind.data.source.local.dao.ContentDao
import com.jinsub.fastcampus_blind.data.source.remote.api.ContentService
import com.jinsub.fastcampus_blind.domain.repository.ContentRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ViewModelComponent
import dagger.hilt.android.scopes.ViewModelScoped

@Module
@InstallIn(ViewModelComponent::class)
object RepositoryModule {

    @Provides
    @ViewModelScoped
    fun providesContentRepository(
        contentDao: ContentDao,
        contentService: ContentService
    ) : ContentRepository = ContentRepositoryImpl(contentDao, contentService)
}