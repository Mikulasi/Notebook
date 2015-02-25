package com.epam.wt.logic;

import com.epam.wt.entity.Note;

import java.util.List;

public class Response {

    private List<Note> notes;

    public Response() {
    }

    public Response(List<Note> notes) {
        this.notes = notes;
    }

    public List<Note> getNotes() {
        return notes;
    }

    public void setNotes(List<Note> notes) {
        this.notes = notes;
    }
}
