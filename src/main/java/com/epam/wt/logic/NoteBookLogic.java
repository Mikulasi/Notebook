package com.epam.wt.logic;

import com.epam.wt.dao.DaoFactory;
import com.epam.wt.dao.DestinationTypeEnum;
import com.epam.wt.dao.NotebookDao;
import com.epam.wt.entity.Note;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public final class NoteBookLogic {

    private List<Note> notebook = new ArrayList<>();

    public static final NotebookDao DAO = DaoFactory.getDao(DestinationTypeEnum.MEMORY);

    public List<Note> getNotebook() {
        return notebook;
    }

    public void setNotebook(List<Note> notebook) {
        this.notebook = notebook;
    }

    public void addNote(Note note){

        DAO.addNotes(note);
    }

    public void findNoteByIndex(int index){

        DAO.findNoteByIndex(index);
    }

    public void removeNoteByIndex(int index){

        DAO.removeNoteByIndex(index);
    }

    public void findNoteByDate(LocalDateTime localDateTime){

        DAO.findNoteByDate(localDateTime);
    }

    public void removeNoteByDate(LocalDateTime localDateTime){

        DAO.removeNoteByDate(localDateTime);
    }

    public void sortByDate(){

        DAO.sortByDate();
    }
}
