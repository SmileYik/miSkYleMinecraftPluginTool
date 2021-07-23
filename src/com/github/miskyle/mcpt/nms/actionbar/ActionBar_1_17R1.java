package com.github.miskyle.mcpt.nms.actionbar;

import org.bukkit.entity.Player;
import org.bukkit.craftbukkit.v1_17_R1.entity.CraftPlayer;
import net.minecraft.network.chat.ChatComponentText;
import net.minecraft.network.chat.ChatMessageType;
import net.minecraft.network.protocol.game.PacketPlayOutChat;

public class ActionBar_1_17R1 implements NMSActionBar{

	@Override
	public void sendActionBar(Player player, String msg) {
		CraftPlayer craftPlayer = (CraftPlayer) player;
		ChatComponentText text = new ChatComponentText(msg);
		PacketPlayOutChat ppoc = new PacketPlayOutChat(text,ChatMessageType.a((byte) 2),player.getUniqueId());
		craftPlayer.getHandle().b.sendPacket(ppoc);
	}

}
