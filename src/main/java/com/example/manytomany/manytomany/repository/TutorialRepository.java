package com.example.manytomany.manytomany.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.manytomany.manytomany.model.*;

public interface TutorialRepository extends JpaRepository<Tutorial, Long> {
  // ...  
  List<Tutorial> findTutorialsByTagsId(Long tagId);

List<Tutorial> findByPublished(boolean b);

Iterable<Tutorial> findByTitleContaining(String title);
}