package io.nova41.leopard.commands;

import java.util.Arrays;

import org.bukkit.command.CommandSender;

import io.nova41.leopard.Leopard;
import io.nova41.leopard.file.LocaleManager;

public class CommandTest extends LeopardCommand {

	public CommandTest(boolean isPlayerOnly) {
		super(isPlayerOnly);
	}

	@Override
	public void perform(Object fromPlugin, LocaleManager locale, CommandSender sender, String[] args) {
		Leopard plugin = (Leopard) fromPlugin;
		System.out.println(Arrays.asList(plugin.dataContainer.toVector("vanilla").data));
	}


}
