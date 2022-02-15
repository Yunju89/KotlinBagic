package com.nepplus.kotlinbagic

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



//         btnLog가 눌리면 어떤 코드를 실행할지, 할 일을 설정
        btnLog.setOnClickListener {

//         로그를 찍어보는 기능 실행. => btnLog가 클릴될 때 마다 실행.
            Log.d("메인화면","로그 버튼 눌림")
        }



        btnToast







    }
}