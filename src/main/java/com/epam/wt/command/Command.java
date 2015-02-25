package com.epam.wt.command;

import com.epam.wt.logic.Request;
import com.epam.wt.logic.Response;

public interface Command {

    public Response execute(Request request);
}
