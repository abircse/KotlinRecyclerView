package com.thisisabir.mvvmkotlin.Activity

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.LinearLayout
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.thisisabir.mvvmkotlin.R
import com.thisisabir.mvvmkotlin.adapter.StudentAdapter
import com.thisisabir.mvvmkotlin.model.Student

class MainActivity : AppCompatActivity() {

    @SuppressLint("WrongConstant")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val recyclerView = findViewById(R.id.recyclerview) as RecyclerView
        recyclerView.layoutManager = LinearLayoutManager(this,LinearLayout.VERTICAL,false)
        val students = ArrayList<Student>()
        students.add(Student("Nayeem Shidiki Abir",10))
        students.add(Student("Nayeem Shidiki Abir",10))
        students.add(Student("Nayeem Shidiki Abir",10))
        students.add(Student("Nayeem Shidiki Abir",10))
        students.add(Student("Nayeem Shidiki Abir",10))
        val Adapter = StudentAdapter(students)
        recyclerView.adapter = Adapter

    }
}
