package com.renatsayf.fullscreenrecyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity()
{
    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // элементы для отображения
        val list: MutableList<String> = arrayOf("Text 1", "Text 2", "Text 3", "Text 4", "Text 5").toMutableList()

        // Шаг 5: поключаем и настраиваем RecyclerView
        val recyclerView = findViewById<RecyclerView>(R.id.recyclerView)
        recyclerView.apply {
            val appAdapter = AppAdapter(list)
            // для сохранения состояния прокрутки
            appAdapter.stateRestorationPolicy = RecyclerView.Adapter.StateRestorationPolicy.PREVENT_WHEN_EMPTY
            this.setHasFixedSize(true)

            // Для вертикальной прокрутки
            //this.layoutManager = LinearLayoutManager(this@MainActivity)

            // Для горизонтальной прокрутки
            this.layoutManager = LinearLayoutManager(this@MainActivity, LinearLayoutManager.HORIZONTAL, false)
            this.adapter = appAdapter
        }
    }
}