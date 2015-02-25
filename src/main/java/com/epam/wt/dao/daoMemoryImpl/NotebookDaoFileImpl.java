package com.epam.wt.dao.daoMemoryImpl;

import com.epam.wt.dao.NotebookDao;
import com.epam.wt.entity.Note;

import java.time.LocalDateTime;
import java.util.List;

public class NotebookDaoFileImpl implements NotebookDao {

    @Override
    public List<Note> addNotes(Note note) {
        return null;
    }

    @Override
    public Note findNoteByIndex(int index) {
        return null;
    }

    @Override
    public boolean removeNoteByIndex(int index) {
        return false;
    }

    @Override
    public Note findNoteByDate(LocalDateTime localDateTime) {
        return null;
    }

    @Override
    public boolean removeNoteByDate(LocalDateTime dateTime) {
        return false;
    }

    @Override
    public List<Note> sortByDate() {
        return null;
    }
}
