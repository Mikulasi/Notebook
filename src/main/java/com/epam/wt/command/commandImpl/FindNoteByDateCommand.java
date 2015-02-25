package com.epam.wt.command.commandImpl;

import com.epam.wt.command.Command;
import com.epam.wt.dao.DaoFactory;
import com.epam.wt.dao.DestinationTypeEnum;
import com.epam.wt.dao.NotebookDao;
import com.epam.wt.entity.Note;
import com.epam.wt.logic.Request;
import com.epam.wt.logic.Response;

import java.util.ArrayList;
import java.util.List;

public final class FindNoteByDateCommand implements Command {

    private NotebookDao notebookDao = DaoFactory.getDao(DestinationTypeEnum.MEMORY);

    @Override
    public Response execute(Request request) {

        notebookDao.findNoteByDate(request.getLocalDateTime());


        Response response = new Response();
        List<Note> notes = new ArrayList<>();
        for (Note note : request.getNoteBookLogic().getNotebook()) {
            if (request.getLocalDateTime().equals(note.getDate())) {
                notes.add(note);
            }
        }
        response.setNotes(notes);
        return response;
    }
}
