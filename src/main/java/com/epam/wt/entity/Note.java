package com.epam.wt.entity;

import java.time.LocalDateTime;

public class Note implements Comparable<Note> {

    private String note;
    private LocalDateTime date;

    public Note() {
    }

    public Note(String note, LocalDateTime date) {
        this.note = note;
        this.date = date;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public void setDate(LocalDateTime date) {
        this.date = date;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (getClass() != o.getClass()) return false;

        Note note1 = (Note) o;

        if (!date.equals(note1.date)) return false;
        if (!note.equals(note1.note)) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = note.hashCode();
        result = 31 * result + date.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "Note: " +
                "\nnote = '" + note +
                "\', \ndate = " + date +
                "\' \n" +
                "\n";
    }

    @Override
    public int compareTo(Note o) {
        return 0;
    }
}
