package io.nova41.leopard.commands;

import org.bukkit.command.CommandSender;

import io.nova41.leopard.Leopard;
import io.nova41.leopard.file.LocaleManager;

public class CommandTrain extends LeopardCommand {

	public CommandTrain(boolean isPlayerOnly) {
		super(isPlayerOnly);
	}

	@Override
	public void perform(Object fromPlugin, LocaleManager locale, CommandSender sender, String[] args) {
		locale.sendMessage(sender, "leopard.command.train", Leopard.getVersion());
	}

}
