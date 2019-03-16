package com.englandstudio.basekt.library

import android.app.Activity
import android.content.Intent

fun Activity.startIntent(clas: Any, map: HashMap<*, *>?, hasFinish: Boolean) {
    val intent = Intent(this, clas::class.java)
    if (map != null)
        intent.putExtra("map", map)
    startActivity(intent)
    when (hasFinish) {
        true -> finish()
    }
}

fun Activity.startIntent(clas: Any, map: HashMap<*, *>) {
    startIntent(clas, map, false)
}

fun Activity.startIntent(clas: Any, hasFinish: Boolean) {
    startIntent(clas, null, hasFinish)
}

fun Activity.startIntent(clas: Any) {
    startIntent(clas, null, false)
}

fun Activity.startIntent(requestCode: Int) {
    val intent = Intent("com.google.zxing.client.android.SCAN")
    intent.putExtra("SCAN_MODE", "QR_CODE_MODE")
    startActivityForResult(intent, requestCode)
}

fun Activity.mapIntent(): HashMap<*, *> {
    return intent.getSerializableExtra("map") as HashMap<*, *>
}
