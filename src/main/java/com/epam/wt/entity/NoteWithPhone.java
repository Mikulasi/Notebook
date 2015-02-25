package com.epam.wt.entity;

import java.time.LocalDateTime;

public class NoteWithPhone extends Note {

    private String phone;

    public NoteWithPhone(String note, LocalDateTime date, String phone) {
        super(note, date);
        this.phone = phone;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "NoteWithPhone{" +
                "phone='" + phone + '\'' +
                '}';
    }
}
