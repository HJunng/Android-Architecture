package com.junng.mvp_architecture

import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.databinding.DataBindingUtil
import com.junng.mvp_architecture.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(), ViewInterface {

    lateinit var binding : ActivityMainBinding
    var presenter = Presenter(this) // this : MainActivity를 뜻하는 것으로 ViewInterface를 넘겨주게 된다.

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        binding.mainActivity = this
    }

    // 1. view에서 숫자 입력 받음
    // 2. 그 숫자를 바로 presenter한테 넘김.
    fun clickNumber(i : Int){
        Log.d("MainActivity", "clickNumber() 함수 실행: $i")
        presenter.clickNumber(i)
    }

    // 4-1. 어떤 숫자 클릭했는지 toast. (Presenter -> View)
    override fun toastMessage(i: Int) {
        Toast.makeText(this, "$i 번을 클릭했습니다.", Toast.LENGTH_SHORT).show()
    }

    // 7-1. 비밀번호 맞았을 때, "unlock" 글씨 보여줌 (Presenter -> View)
    override fun checkPasswordMessage() {
        binding.messageSuccess.visibility = View.VISIBLE
    }
}