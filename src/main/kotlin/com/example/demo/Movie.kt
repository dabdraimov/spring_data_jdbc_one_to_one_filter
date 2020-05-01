package com.example.demo

import org.springframework.data.annotation.Id

data class Movie(
        @Id
        val id: Long?,
        val title: String,
        val description: String,
        val rental: Rental
)
