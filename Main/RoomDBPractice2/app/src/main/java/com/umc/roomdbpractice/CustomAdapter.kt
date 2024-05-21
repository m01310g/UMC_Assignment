package com.umc.roomdbpractice

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import com.umc.roomdbpractice.databinding.ItemLayoutBinding
import kotlin.contracts.contract

class CustomAdapter(val list: ArrayList<Profile>, context: Context) : BaseAdapter() {
    var inflater = context.getSystemService(Context.LAYOUT_INFLATER_SERVICE)
    lateinit var binding: ItemLayoutBinding
    override fun getCount(): Int = list.size

    override fun getItem(position: Int): Any = list[position]

    override fun getItemId(position: Int): Long = position.toLong()
    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        binding = ItemLayoutBinding.inflate(inflater as LayoutInflater, parent, false)
        binding.text1.text = list[position].name
        binding.text2.text = list[position].age

        return binding.root
    }
}