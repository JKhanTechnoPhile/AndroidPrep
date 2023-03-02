package com.jkhan.myfirstlibrary

import java.math.RoundingMode
import java.text.DecimalFormat
import java.text.SimpleDateFormat
import java.util.*

fun Long.mtb_fromUnixToFormatted(): String {
    val sdf = SimpleDateFormat("dd/MM/yy HH:mm", Locale.getDefault())
    sdf.timeZone = TimeZone.getTimeZone("Asia/Jerusalem")
    val netDate = Date(this*1000)
    return sdf.format(netDate)
}

fun Double.mtb_toOneDecimal(): String {
    val df = DecimalFormat("#.#")
    df.roundingMode = RoundingMode.DOWN
    return df.format(this)
}

fun Double.mtb_toTwoDecimal(): String {
    val df = DecimalFormat("#.##")
    df.roundingMode = RoundingMode.DOWN
    return df.format(this)
}