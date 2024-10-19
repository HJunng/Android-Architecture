package com.junng.mvp_architecture

class Model {
    var password : MutableList<Int> = mutableListOf() // 사용자가 입력한 비밀번호

    fun inputPassword(i : Int){ // 6. 사용자가 입력한 비밀번호를 기록.
        if(password.size < 4){
            password.add(i)
        }
    }

    fun checkPassword() : Boolean {
        var trueCount = 0

        // 저장된 패스워드 : 원래는 DB에 저장되어 있어야 하는 값이지만, 여기서는 임의로 1234로 사용함.
        var savePassword = mutableListOf(1,2,3,4)

        for(i in 0 until savePassword.size){
            if(savePassword.get(i) == password.get(i)){
                trueCount++
            }
        }

        return trueCount == 4
    }
}