package com.englandstudio.basekt.response

import com.englandstudio.basekt.BaseModel

open class ResponseModel(
    var status: Boolean,
    var code: Int,
    var message: String
) : BaseModel