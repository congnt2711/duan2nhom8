package com.englandstudio.basekt.response

import com.englandstudio.basekt.BaseApplication
import com.englandstudio.basekt.dialog.MessageDialog
import com.englandstudio.basekt.library.showLog
import com.google.gson.Gson
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response


class ResponseCallback<T : ResponseModel>(
    private var onFailure: ((throwable: Throwable) -> Unit)? = null,
    var onSuccess: (response: T) -> Unit
) : Callback<T> {
    override fun onResponse(call: Call<T>, response: Response<T>) {
        val data = response.body() as T
        showLog(Gson().toJson(data))
        if (data.status) {
            onSuccess(data)
        } else {
            val activity = BaseApplication.activity
            MessageDialog(activity, data.message) {
                activity.finish()
            }.show()
        }
    }

    override fun onFailure(call: Call<T>, t: Throwable) {
        onFailure?.let { it(t) }
    }
}