package com.springboot.crud.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springboot.crud.api.model.Note;

@Repository
public interface NoteRepository extends JpaRepository<Note, Long> {

}