package com.epam.wt.command;

import com.epam.wt.command.commandImpl.*;

import java.util.HashMap;
import java.util.Map;

public final class CommandHelper {

    private Map<CommandEnum, Command> commands = new HashMap<>();

    public CommandHelper() {
        commands.put(CommandEnum.ADDNOTES, new AddCommand());
        commands.put(CommandEnum.FINDNOTEBYINDEX, new FindNoteByIndexCommand());
        commands.put(CommandEnum.REMOVENOTEBYINDEX, new RemoveNoteByIndexCommand());
        commands.put(CommandEnum.FINDNOTEBYDATE, new FindNoteByDateCommand());
        commands.put(CommandEnum.REMOVENOTEBYDATE, new RemoveNoteByDateCommand());

    }

    public Command getCommand(CommandEnum commandEnum) {

        return commands.get(commandEnum);
    }
}
