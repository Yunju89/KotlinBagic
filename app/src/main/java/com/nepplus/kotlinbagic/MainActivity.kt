package com.nepplus.kotlinbagic

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



//         btnLog가 눌리면 어떤 코드를 실행할지, 할 일을 설정
        btnLog.setOnClickListener {

//         로그를 찍어보는 기능 실행. => btnLog가 클릴될 때 마다 실행.
            Log.d("메인화면","로그 버튼 눌림")
            Log.d("메인화면","추가 로그 찍어보기")
            Log.e("메인화면","e로 로그 찍기")

        }

        btnToast.setOnClickListener {
            Toast.makeText(this, "토스트 자동완성 활용", Toast.LENGTH_SHORT).show()
        }

        btnVariable.setOnClickListener {
//        변수에 대한 문법 연습용 코드


        }











    }
}