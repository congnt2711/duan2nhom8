package com.englandstudio.basekt.local

import android.content.Context
import android.content.SharedPreferences
import com.englandstudio.basekt.BaseApplication
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken

object DataPreference {

    val mPreferences: SharedPreferences = BaseApplication.context.getSharedPreferences("data", Context.MODE_PRIVATE)

    inline fun <reified T> put(name: String, data: T?) {
        when (T::class.java) {
            Boolean::class.java,
            Double::class.java,
            Long::class.java,
            Int::class.java,
            Float::class.java,
            String::class.java -> {
                mPreferences.edit().putString(name, data.toString()).apply()
            }
            else -> mPreferences.edit().putString(name, Gson().toJson(data)).apply()
        }
    }

    inline fun <reified T> get(name: String): T? {
        val data = mPreferences.getString(name, null)
        return if (data == null) {
            null
        } else when (T::class.java) {
            Boolean::class.java -> data.toBoolean() as T
            Double::class.java -> data.toDouble() as T
            Long::class.java -> data.toLong() as T
            Int::class.java -> data.toInt() as T
            Float::class.java -> data.toFloat() as T
            String::class.java -> data as T
            else -> Gson().fromJson(data, object : TypeToken<T>() {}.type) as T
        }
    }

}