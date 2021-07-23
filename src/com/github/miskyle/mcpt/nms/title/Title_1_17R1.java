package com.github.miskyle.mcpt.nms.title;

import org.bukkit.entity.Player;

public class Title_1_17R1 implements NMSTitle{
	public void sendTitle(Player player,TitleAction action,
			String msg,int fadeIn,int stay,int fadeOut) {
		player.sendTitle(msg, "", fadeIn, stay, fadeOut);
	}
	
	public void sendTitle(Player player,TitleAction action,
			String msg,int ... args) {
		int fadeIn  = -1,
			stay    = -1,
			fadeOut = -1;
		if(args.length>0) fadeIn  = args[0];
		if(args.length>1) stay    = args[1];
		if(args.length>2) fadeOut = args[2];
		
		player.sendTitle(msg, "", fadeIn, stay, fadeOut);
	}
}
