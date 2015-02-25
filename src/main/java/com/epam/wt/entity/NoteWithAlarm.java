package com.epam.wt.entity;

import com.epam.wt.midi.Song;

import java.time.LocalDateTime;

public class NoteWithAlarm extends Note{

   private Song song;

    public NoteWithAlarm(String note, LocalDateTime date, Song song) {
        super(note, date);
        this.song = song;
    }

    public Song getSong() {
        return song;
    }

    @Override
    public String toString() {
        return "NoteWithAlarm{" +
                "song=" + song +
                '}';
    }
}
