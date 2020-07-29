package com.github.miskyle.mcpt.nms.actionbar;

import org.bukkit.craftbukkit.v1_6_R2.entity.CraftPlayer;
import org.bukkit.entity.Player;

import net.minecraft.server.v1_6_R2.ChatMessage;
import net.minecraft.server.v1_6_R2.Packet3Chat;

public class ActionBar_1_6R2 implements NMSActionBar{

	@Override
	public void sendActionBar(Player player, String msg) {
		CraftPlayer craftPlayer = (CraftPlayer) player;
		Packet3Chat ppoc = new Packet3Chat(ChatMessage.d(msg));
		craftPlayer.getHandle().playerConnection.sendPacket(ppoc);
	}

}
