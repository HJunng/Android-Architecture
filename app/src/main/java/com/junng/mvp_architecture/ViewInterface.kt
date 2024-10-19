package com.junng.mvp_architecture

interface ViewInterface {
    fun toastMessage(i : Int) // 숫자 클릭할 때 마다 toastText
    fun checkPasswordMessage() // 입력한 비밀번호가 맞았을 때 -> "비밀번호 unlock 성공"이라는 TextView가 보여지게 함.
}