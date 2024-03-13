package jp.gardenall.areader.utils

import com.google.firebase.Timestamp
import java.text.DateFormat

fun formatDate(timestamp: Timestamp): String {
    return DateFormat.getDateInstance()
        .format(timestamp.toDate())
        .toString().split(",")[0]
}