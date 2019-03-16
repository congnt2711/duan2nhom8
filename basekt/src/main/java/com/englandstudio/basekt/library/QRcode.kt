package com.englandstudio.basekt.library

import android.graphics.Bitmap
import android.graphics.Color
import com.google.zxing.BarcodeFormat
import com.google.zxing.WriterException
import com.google.zxing.qrcode.QRCodeWriter

fun getQRcodeBitmap(content: String): Bitmap? {
    val width = 512
    val height = 512
    val writer = QRCodeWriter()
    try {
        val bitMatrix = writer.encode(content, BarcodeFormat.QR_CODE, width, height)
        val bmp = Bitmap.createBitmap(bitMatrix.width, bitMatrix.height, Bitmap.Config.RGB_565)
        for (x in 0 until width) {
            for (y in 0 until height) {
                bmp.setPixel(x, y, if (bitMatrix.get(x, y)) 0xc94f7c else Color.WHITE)
            }
        }
        return bmp
    } catch (e: WriterException) {
        e.printStackTrace()
    }
    return null
}