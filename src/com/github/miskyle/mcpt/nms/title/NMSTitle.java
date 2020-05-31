package com.github.miskyle.mcpt.nms.title;

import org.bukkit.entity.Player;

public interface NMSTitle {
	public void sendTitle(Player player,TitleAction action,
			String msg,int fadeIn,int stay,int fadeOut);
	public void sendTitle(Player player,TitleAction action,
			String msg,int ... args);
}
