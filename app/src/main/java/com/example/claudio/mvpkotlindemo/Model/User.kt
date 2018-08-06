package com.example.claudio.mvpkotlindemo.Model

import android.text.TextUtils
import android.util.Patterns

/**
 * Created by claudio on 5/08/18.
 */
class User (override val email:String, override val password:String):IUser {
    override val isDataValid: Boolean
        get() = (!TextUtils.isEmpty(email) &&
                Patterns.EMAIL_ADDRESS.matcher(email).matches() &&
                password.length > 6)
}