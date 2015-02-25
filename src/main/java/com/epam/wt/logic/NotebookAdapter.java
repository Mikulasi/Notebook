package com.epam.wt.logic;

public class NotebookAdapter {

    private static final NotebookAdapter instance = new NotebookAdapter();

    private NoteBookLogic notebook = new NoteBookLogic();

    public static NotebookAdapter getInstance() {
        return instance;
    }

    public NoteBookLogic getNoteBook() {
        return notebook;
    }
}
