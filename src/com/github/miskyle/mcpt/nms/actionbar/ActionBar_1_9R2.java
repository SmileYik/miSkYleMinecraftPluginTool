package com.github.miskyle.mcpt.nms.actionbar;

import org.bukkit.entity.Player;
import org.bukkit.craftbukkit.v1_9_R2.entity.CraftPlayer;
import net.minecraft.server.v1_9_R2.ChatComponentText;
import net.minecraft.server.v1_9_R2.PacketPlayOutChat;

public class ActionBar_1_9R2 implements NMSActionBar{

	@Override
	public void sendActionBar(Player player, String msg) {
		CraftPlayer craftPlayer = (CraftPlayer) player;
		ChatComponentText text = new ChatComponentText(msg);
		PacketPlayOutChat ppoc = new PacketPlayOutChat(text,(byte)2);
		craftPlayer.getHandle().playerConnection.sendPacket(ppoc);
	}

}
