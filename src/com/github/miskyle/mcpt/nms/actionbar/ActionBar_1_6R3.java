package com.github.miskyle.mcpt.nms.actionbar;

import org.bukkit.craftbukkit.v1_6_R3.entity.CraftPlayer;
import org.bukkit.entity.Player;

import net.minecraft.server.v1_6_R3.ChatMessage;
import net.minecraft.server.v1_6_R3.Packet3Chat;

public class ActionBar_1_6R3 implements NMSActionBar{

	@Override
	public void sendActionBar(Player player, String msg) {
		CraftPlayer craftPlayer = (CraftPlayer) player;
		Packet3Chat ppoc = new Packet3Chat(ChatMessage.d(msg));
		craftPlayer.getHandle().playerConnection.sendPacket(ppoc);
	}

}
