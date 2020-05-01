package com.example.demo

import org.springframework.data.jdbc.repository.query.Query
import org.springframework.data.repository.CrudRepository
import org.springframework.data.repository.query.Param
import org.springframework.stereotype.Repository

@Repository
interface MovieRepository : CrudRepository<Movie, Long> {

    @Query("select * from movie where title = :title ")
    fun findByTitle(@Param("title") title: String): List<Movie>
}