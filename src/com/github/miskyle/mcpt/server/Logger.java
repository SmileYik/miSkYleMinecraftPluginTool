package com.github.miskyle.mcpt.server;

import org.bukkit.plugin.Plugin;

public class Logger {
	public static java.util.logging.Logger logger;
	public static void initialize(Plugin plugin) {
		logger = plugin.getLogger();
	}
}
