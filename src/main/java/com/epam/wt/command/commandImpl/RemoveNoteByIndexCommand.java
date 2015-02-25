package com.epam.wt.command.commandImpl;

import com.epam.wt.command.Command;
import com.epam.wt.entity.Note;
import com.epam.wt.logic.Request;
import com.epam.wt.logic.Response;

import java.util.ArrayList;
import java.util.List;

public final class RemoveNoteByIndexCommand implements Command {

    @Override
    public Response execute(Request request) {

        int index = 0;
        Response response = new Response();
        List<Note> notes = new ArrayList<>();
        request.getNoteBookLogic().getNotebook();
        notes.remove(index);
        response.setNotes(notes);
        return response;
    }
}
