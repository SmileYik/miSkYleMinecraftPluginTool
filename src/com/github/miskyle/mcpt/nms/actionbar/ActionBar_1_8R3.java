package com.github.miskyle.mcpt.nms.actionbar;

import org.bukkit.entity.Player;
import org.bukkit.craftbukkit.v1_8_R3.entity.CraftPlayer;
import net.minecraft.server.v1_8_R3.ChatComponentText;
import net.minecraft.server.v1_8_R3.PacketPlayOutChat;

public class ActionBar_1_8R3 implements NMSActionBar{

	@Override
	public void sendActionBar(Player player, String msg) {
		CraftPlayer craftPlayer = (CraftPlayer) player;
		ChatComponentText text = new ChatComponentText(msg);
		PacketPlayOutChat ppoc = new PacketPlayOutChat(text,(byte)2);
		craftPlayer.getHandle().playerConnection.sendPacket(ppoc);
	}

}
