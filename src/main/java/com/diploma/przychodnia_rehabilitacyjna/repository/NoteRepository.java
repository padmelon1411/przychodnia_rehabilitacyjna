package com.diploma.przychodnia_rehabilitacyjna.repository;

import com.diploma.przychodnia_rehabilitacyjna.dao.Note;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by sylwia on 24.11.18.
 */
public interface NoteRepository extends JpaRepository<Note, Long> {
}
