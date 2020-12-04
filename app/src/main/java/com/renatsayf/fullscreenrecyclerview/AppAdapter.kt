package com.renatsayf.fullscreenrecyclerview

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

// Шаг 2: Создаем адаптер
class AppAdapter constructor(private val list: MutableList<String>) :
    RecyclerView.Adapter<AppAdapter.ViewHolder>()
{
    // Шаг 3: Создаем держатель - внутренний класс без тела
    class ViewHolder(item: View) : RecyclerView.ViewHolder(item)

    // Шаг 4: Переопределяем методы
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder
    {
        val linearLayout = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_layout, parent, false) as LinearLayout

        return ViewHolder(linearLayout)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int)
    {
        val itemView = holder.itemView
        val textView = itemView.findViewById(R.id.text_view) as TextView
        textView.text = list[position]
    }

    override fun getItemCount(): Int
    {
        return list.size
    }
}