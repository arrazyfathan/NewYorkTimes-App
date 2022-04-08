package com.arrazyfathan.nytimes.data.model

import androidx.room.Entity
import androidx.room.PrimaryKey
import java.io.Serializable

@Entity(
    tableName = "articles"
)
data class Article(
    @PrimaryKey(autoGenerate = true)
    var id: Int? = null,
    var url: String? = "",
    var byline: String? = "",
    var multimedia: List<Multimedia>? = null,
    var published_date: String? = "",
    var section: String? = "",
    var short_url: String? = "",
    var subsection: String? = "",
    var title: String? = "",
    var abstract: String? = ""
) : Serializable