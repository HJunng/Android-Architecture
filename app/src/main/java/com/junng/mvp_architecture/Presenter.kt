package com.junng.mvp_architecture

import android.view.View
import android.widget.Toast

/**
 * 1. Model을 가지고 있다.
 * 2. View를 변경하는 함수를 가지고 있다.
 */
class Presenter (var viewInterface: ViewInterface) { // 생성자 주입

    var model = Model()

//    var viewInterface : ViewInterface? = null
//    constructor(viewInterface: ViewInterface){ // 생성자 주입
//        this.viewInterface = viewInterface
//    }

    // 3. view가 clickNumber 함수 실행
    fun clickNumber(i : Int){
        viewInterface.toastMessage(i)  // 4. 입력된 i를 view에 Toast로 보여줌
        model.inputPassword(i) // 5. Model한테 어떤 숫자가 입력되었는지 넘김.

        if(model.password.size == 4 && model.checkPassword()){
            // 4자리 이상 비밀번호가 1234

            // 7. 비밀번호 맞으면 view에 맞았다는 것을 알림.
            viewInterface.checkPasswordMessage()
        }
    }
}