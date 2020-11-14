package com.github.miskyle.mcpt.nms.title;

import org.bukkit.craftbukkit.v1_16_R3.entity.CraftPlayer;
import net.minecraft.server.v1_16_R3.ChatComponentText;
import net.minecraft.server.v1_16_R3.PacketPlayOutTitle;
import net.minecraft.server.v1_16_R3.PacketPlayOutTitle.EnumTitleAction;

import org.bukkit.entity.Player;

public class Title_1_16R3 implements NMSTitle{
	public void sendTitle(Player player,TitleAction action,
			String msg,int fadeIn,int stay,int fadeOut) {
		ChatComponentText title = new ChatComponentText(msg);
		PacketPlayOutTitle ppot = new PacketPlayOutTitle(
				getTitleAction(action), title, fadeIn, stay, fadeOut);
		((CraftPlayer)player).getHandle().playerConnection.sendPacket(ppot);
	}
	
	public void sendTitle(Player player,TitleAction action,
			String msg,int ... args) {
		int fadeIn  = -1,
			stay    = -1,
			fadeOut = -1;
		if(args.length>0) fadeIn  = args[0];
		if(args.length>1) stay    = args[1];
		if(args.length>2) fadeOut = args[2];
		
		ChatComponentText title = new ChatComponentText(msg);
		PacketPlayOutTitle ppot = new PacketPlayOutTitle(
				getTitleAction(action), title, fadeIn, stay, fadeOut);
		
		((CraftPlayer)player).getHandle().playerConnection.sendPacket(ppot);
	}
	
	private EnumTitleAction getTitleAction(TitleAction action) {
		return EnumTitleAction.valueOf(action.name());
	}
}
