package com.jkhan.androidprep

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.jkhan.androidprep.viewmodel.LoginViewModel
import com.jkhan.myfirstexternallibrary.ExternlaLibraryActivity
import com.jkhan.myfirstlibrary.mtb_toTwoDecimal
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    // You want Dagger to provide an instance of LoginViewModel from the graph
    @Inject lateinit var loginViewModel: LoginViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        4.22312.mtb_toTwoDecimal()

        GlobalScope.launch {
            delay(5000)
            startActivity(Intent(applicationContext, ExternlaLibraryActivity::class.java))
            finish()
        }
    }
}