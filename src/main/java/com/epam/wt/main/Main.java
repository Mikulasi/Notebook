package com.epam.wt.main;

import com.epam.wt.entity.Note;
import com.epam.wt.dao.daoMemoryImpl.NotebookDaoImpl;
import com.epam.wt.dao.NotebookDao;

import java.time.LocalDateTime;

public class Main {

    public static void main(String[] args) {

        NotebookDao notebookDao = new NotebookDaoImpl();
        System.out.println(notebookDao.addNotes(new Note("Meeting with customers", LocalDateTime.of(2015, 2, 25, 12, 30))));
        System.out.println(notebookDao.addNotes(new Note("Buy a car", LocalDateTime.of(2015, 2, 27, 15, 40))));
        System.out.println(notebookDao.addNotes(new Note("Java Training", LocalDateTime.of(2015, 2, 28, 14, 0))));
//        System.out.println(notebookDao.findNoteByIndex(1));
//        System.out.println(notebookDao.findNoteByDate(LocalDateTime.of(2015, 2, 28, 14, 0)));
////        System.out.println(notebookDao.removeNoteByIndex(0));
////        System.out.println(notebookDao.removeNoteByDate(LocalDateTime.of(2015, 2, 28, 14, 0)));
        System.out.println(notebookDao.sortByDate());

    }
}
