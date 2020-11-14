package com.github.miskyle.mcpt.nms.actionbar;

import org.bukkit.entity.Player;
import org.bukkit.craftbukkit.v1_16_R1.entity.CraftPlayer;
import net.minecraft.server.v1_16_R1.ChatComponentText;
import net.minecraft.server.v1_16_R1.ChatMessageType;
import net.minecraft.server.v1_16_R1.PacketPlayOutChat;

public class ActionBar_1_16R1 implements NMSActionBar{

	@Override
	public void sendActionBar(Player player, String msg) {
		CraftPlayer craftPlayer = (CraftPlayer) player;
		ChatComponentText text = new ChatComponentText(msg);
		PacketPlayOutChat ppoc = new PacketPlayOutChat(text,ChatMessageType.a((byte) 2),player.getUniqueId());
		craftPlayer.getHandle().playerConnection.sendPacket(ppoc);
	}

}
