package com.thisisabir.mvvmkotlin.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.thisisabir.mvvmkotlin.R
import com.thisisabir.mvvmkotlin.model.Student

class StudentAdapter(val studentList: ArrayList<Student>) :
    RecyclerView.Adapter<StudentAdapter.viewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): viewHolder {

        val v = LayoutInflater.from(parent.context).inflate(R.layout.customlayout, parent, false)
        return viewHolder(v)
    }

    override fun getItemCount(): Int {

        return studentList.size
    }

    override fun onBindViewHolder(holder: viewHolder, position: Int) {

        val student: Student = studentList[position]
        holder.name.text = student.name
        holder.age.text = student.age.toString()

    }


    class viewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        val name = itemView.findViewById(R.id.textView1) as TextView
        val age = itemView.findViewById(R.id.textView2) as TextView


    }

}