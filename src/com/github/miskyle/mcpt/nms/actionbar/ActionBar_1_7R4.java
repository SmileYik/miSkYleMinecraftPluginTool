package com.github.miskyle.mcpt.nms.actionbar;

import org.bukkit.entity.Player;
import org.bukkit.craftbukkit.v1_7_R4.entity.CraftPlayer;
import net.minecraft.server.v1_7_R4.ChatComponentText;
import net.minecraft.server.v1_7_R4.PacketPlayOutChat;

public class ActionBar_1_7R4 implements NMSActionBar{

	@Override
	public void sendActionBar(Player player, String msg) {
		CraftPlayer craftPlayer = (CraftPlayer) player;
		ChatComponentText text = new ChatComponentText(msg);
		PacketPlayOutChat ppoc = new PacketPlayOutChat(text,(byte)2);
		craftPlayer.getHandle().playerConnection.sendPacket(ppoc);
	}

}
