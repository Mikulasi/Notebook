package com.epam.wt.controller;

import com.epam.wt.command.CommandEnum;
import com.epam.wt.command.CommandHelper;
import com.epam.wt.logic.Request;
import com.epam.wt.logic.Response;

public class Manager {

    private CommandHelper commandHelper = new CommandHelper();

    public Response doRequest(CommandEnum commandEnum, Request request) {
         return commandHelper.getCommand(commandEnum).execute(request);
    }
}
