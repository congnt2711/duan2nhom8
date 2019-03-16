package com.englandstudio.basekt.library

import android.util.Log

private const val TAG_LOG = "Show Log"
private const val TAG_ERR = "Show Err"
private const val STACK_TRACE_LEVELS_UP = 4

fun showLog(message: Any) {
    Log.d(TAG_LOG, String.format("%-30s : %-30s : %-5s : ", getClassName(), getMethodName(), getLineNumber()) + message)
}

fun showError(message: Any) {
    Log.e(TAG_ERR, String.format("%-30s : %-30s : %-5s : ", getClassName(), getMethodName(), getLineNumber()) + message)
}

private fun getClassName(): String {
    val fileName = Thread.currentThread().stackTrace[STACK_TRACE_LEVELS_UP].fileName
    return fileName.replace(".kt", "")
}

private fun getMethodName(): String {
    return Thread.currentThread().stackTrace[STACK_TRACE_LEVELS_UP].methodName
}

private fun getLineNumber(): Int {
    return Thread.currentThread().stackTrace[STACK_TRACE_LEVELS_UP].lineNumber
}