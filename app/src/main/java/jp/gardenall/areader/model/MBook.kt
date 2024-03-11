package jp.gardenall.areader.model

import com.google.firebase.Timestamp

data class MBook(
    var id: String? = null,
    var title: String? = null,
    var authors: String? = null,
    var notes: String? = null,
    val photoUr: String? = null,
    var categories: String? = null,
    var publishedDate: String? = null,
    var rating: Double? = null,
    var description: String? = null,
    var pageCount: String? = null,
    var startedReading: Timestamp? = null,
    var finishedReading: Timestamp? = null,
    var userId: String? = null,
    var googleBookId: String? = null
)
