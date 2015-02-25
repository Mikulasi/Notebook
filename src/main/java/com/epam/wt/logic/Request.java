package com.epam.wt.logic;

import java.time.LocalDateTime;

public class Request {

    private String note;
    private LocalDateTime localDateTime;
    private NoteBookLogic noteBookLogic;

    public Request() {
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public LocalDateTime getLocalDateTime() {
        return localDateTime;
    }

    public void setLocalDateTime(LocalDateTime localDateTime) {
        this.localDateTime = localDateTime;
    }

    public NoteBookLogic getNoteBookLogic() {
        return noteBookLogic;
    }

    public void setNoteBookLogic(NoteBookLogic noteBookLogic) {
        this.noteBookLogic = noteBookLogic;
    }
}
