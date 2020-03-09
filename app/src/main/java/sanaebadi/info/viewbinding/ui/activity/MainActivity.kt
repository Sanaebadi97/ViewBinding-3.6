package sanaebadi.info.viewbinding.ui.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.widget.Toast
import sanaebadi.info.viewbinding.R
import sanaebadi.info.viewbinding.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(LayoutInflater.from(this))
        setContentView(binding.root)
        binding.txtClickMe.setOnClickListener{
            Toast.makeText(this,getString(R.string.welcom_msg) , Toast.LENGTH_SHORT).show()
        }
    }
}
