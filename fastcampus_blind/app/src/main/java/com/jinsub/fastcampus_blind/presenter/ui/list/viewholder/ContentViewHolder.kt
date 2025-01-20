package com.jinsub.fastcampus_blind.presenter.ui.list.viewholder

import androidx.recyclerview.widget.RecyclerView
import com.jinsub.fastcampus_blind.databinding.ItemContentBinding
import com.jinsub.fastcampus_blind.domain.model.Content
import com.jinsub.fastcampus_blind.presenter.ui.MainActivity

class ContentViewHolder(
    private val binding: ItemContentBinding,
    private val handler: MainActivity.Handler
) : RecyclerView.ViewHolder(binding.root) {

    fun bind(item : Content) {
        binding.item = item
        binding.handler = handler
    }
}