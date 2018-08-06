package com.example.claudio.mvpkotlindemo.Presenter

import com.example.claudio.mvpkotlindemo.Model.User
import com.example.claudio.mvpkotlindemo.View.ILoginView

/**
 * Created by claudio on 6/08/18.
 */
class LoginPresenter (internal var iLoginView:ILoginView):ILoginPresenter {
    override fun onLogin(email: String, password: String) {
        val user = User(email, password)
        val isLogginSuccess = user.isDataValid
        if(isLogginSuccess)
            iLoginView.onLoginResult("Login Success")
        else
            iLoginView.onLoginResult("Login Error")
    }
}