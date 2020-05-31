package com.github.miskyle.mcpt.nms.actionbar;

import org.bukkit.entity.Player;
import org.bukkit.craftbukkit.v1_13_R2.entity.CraftPlayer;
import net.minecraft.server.v1_13_R2.ChatComponentText;
import net.minecraft.server.v1_13_R2.ChatMessageType;
import net.minecraft.server.v1_13_R2.PacketPlayOutChat;

public class ActionBar_1_13R2 implements NMSActionBar{

	@Override
	public void sendActionBar(Player player, String msg) {
		CraftPlayer craftPlayer = (CraftPlayer) player;
		ChatComponentText text = new ChatComponentText(msg);
		PacketPlayOutChat ppoc = new PacketPlayOutChat(text,ChatMessageType.a((byte) 2));
		craftPlayer.getHandle().playerConnection.sendPacket(ppoc);
	}

}
