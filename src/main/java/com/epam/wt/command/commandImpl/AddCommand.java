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

public final class AddCommand implements Command {

    @Override
    public Response execute(Request request) {

        Response response = new Response();
        List<Note> notes = new ArrayList<>();
        NotebookDao dao = DaoFactory.getDao(DestinationTypeEnum.MEMORY);
        dao.addNotes(new Note(request.getNote(),request.getLocalDateTime()));
        response.setNotes(dao);
        return response;
    }
}
