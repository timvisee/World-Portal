package com.timvisee.worldportal.command;

import org.bukkit.command.CommandSender;

public abstract class ExecutableCommand {

    /**
     * Execute the command.
     *
     * @param sender The command sender.
     * @param commandReference The command reference.
     * @param commandArguments The command arguments.
     *
     * @return True if the command was executed successfully, false otherwise.
     */
    public abstract boolean executeCommand(CommandSender sender, CommandParts commandReference, CommandParts commandArguments);
}
