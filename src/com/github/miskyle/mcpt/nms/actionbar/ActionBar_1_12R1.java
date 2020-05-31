package com.github.miskyle.mcpt.nms.actionbar;

import org.bukkit.craftbukkit.v1_12_R1.entity.CraftPlayer;
import org.bukkit.entity.Player;

import net.minecraft.server.v1_12_R1.ChatComponentText;
import net.minecraft.server.v1_12_R1.ChatMessageType;
import net.minecraft.server.v1_12_R1.PacketPlayOutChat;

public class ActionBar_1_12R1 implements NMSActionBar{

	@Override
	public void sendActionBar(Player player, String msg) {
		CraftPlayer craftPlayer = (CraftPlayer) player;
		ChatComponentText text = new ChatComponentText(msg);
		PacketPlayOutChat ppoc = new PacketPlayOutChat(text,ChatMessageType.a((byte) 2));
		craftPlayer.getHandle().playerConnection.sendPacket(ppoc);
	}

}
