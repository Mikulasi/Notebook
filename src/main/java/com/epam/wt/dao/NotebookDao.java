package com.epam.wt.dao;

import com.epam.wt.entity.Note;

import java.time.LocalDateTime;
import java.util.List;

public interface NotebookDao {

    List<Note> addNotes(Note note);

    Note findNoteByIndex(int index);

    boolean removeNoteByIndex(int index);

    Note findNoteByDate(LocalDateTime localDateTime);

    boolean removeNoteByDate(LocalDateTime dateTime);

    List<Note> sortByDate();

}
