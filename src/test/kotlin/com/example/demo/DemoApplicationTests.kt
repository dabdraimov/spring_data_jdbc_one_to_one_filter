package com.example.demo

import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import java.time.Duration

@SpringBootTest
class DemoApplicationTests(
        @Autowired
        private val movieRepository: MovieRepository
) {

    @Test
    fun contextLoads() {
        val movie = Movie(
                null,
                "Matrix",
                "...",
                Rental(Duration.ofDays(1), 100
                )
        )

        movieRepository.save(movie)

        println(movieRepository.findAll())
        println(movieRepository.findByTitle("Matrix"))
    }

}
