package com.example.vjezbanjefundamentals

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.method.ScrollingMovementMethod
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import org.w3c.dom.Text

class MainActivity : AppCompatActivity() {
    private val textView: TextView by lazy(LazyThreadSafetyMode.NONE) { findViewById(R.id.textView) }
    private val btnClick: Button by lazy(LazyThreadSafetyMode.NONE) { findViewById(R.id.button) }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
       /* btnClick.setOnClickListener{
            Toast.makeText("")
        }*/
       /* textView.movementMethod = ScrollingMovementMethod()
*/

    }



}