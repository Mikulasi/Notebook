package com.epam.wt.command.commandImpl;

import com.epam.wt.command.Command;
import com.epam.wt.entity.Note;
import com.epam.wt.logic.Request;
import com.epam.wt.logic.Response;

import java.util.ArrayList;
import java.util.List;

public final class RemoveNoteByDateCommand implements Command {

    @Override
    public Response execute(Request request) {
        Response response = new Response();
        List<Note> notes = new ArrayList<>();
        for (Note note : request.getNoteBookLogic().getNotebook()) {
            if (request.getLocalDateTime().equals(note.getDate())) {
                notes.remove(note);
            }
        }
        response.setNotes(notes);
        return response;
    }
}
