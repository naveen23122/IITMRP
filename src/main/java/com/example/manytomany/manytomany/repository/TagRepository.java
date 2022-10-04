package com.example.manytomany.manytomany.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.manytomany.manytomany.model.*;

public interface TagRepository extends JpaRepository<Tag, Long> {
  List<Tag> findTagsByTutorialsId(Long tutorialId);
}