package com.example.AmazonProject.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.AmazonProject.entity.Podcast;

@Repository
public interface PlayerRepository extends CrudRepository<Podcast, Long> {

}
