package com.example.kotlin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import com.example.kotlin.java.JavaMainActivity
import com.example.kotlin.java.roomdb.AddTaskActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        ViewSetup()
    }

    private fun ViewSetup() {
        var btn= findViewById<Button>(R.id.sharedviewmodel)
        var btn_addTaskActivity= findViewById<Button>(R.id.AddTaskActivity)
       // TODO("Not yet implemented")
       // val listener
        btn.setOnClickListener(listener)
        btn_addTaskActivity.setOnClickListener(listener)
    }
    val listener= View.OnClickListener { view ->
        when (view.getId()) {
            R.id.sharedviewmodel -> {
                var intent= Intent(this, JavaMainActivity::class.java)
                startActivity(intent)
                // Do some work here
            }
            R.id.AddTaskActivity->{
                var intent= Intent(this, AddTaskActivity::class.java)
                startActivity(intent)
            }
        }
    }
}