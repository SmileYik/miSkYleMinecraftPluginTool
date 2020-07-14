package com.github.miskyle.mcpt.nms.sleep;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.craftbukkit.v1_9_R1.entity.CraftPlayer;
import org.bukkit.entity.Player;
import org.bukkit.util.Vector;

import com.github.miskyle.mcpt.MCPT;

import net.minecraft.server.v1_9_R1.BlockPosition;
import net.minecraft.server.v1_9_R1.EntityPlayer;
import net.minecraft.server.v1_9_R1.PacketPlayOutAnimation;
import net.minecraft.server.v1_9_R1.PacketPlayOutBed;

public class NMSSleep_1_9R1 implements NMSSleep{
	
	public boolean sleep(Player player, Location l) {
		player.setVelocity(new Vector());
		EntityPlayer p =((CraftPlayer)player).getHandle();
        BlockPosition bp = new BlockPosition(l.getX(), l.getY(), l.getZ());
        PacketPlayOutBed packetplayoutbed = new PacketPlayOutBed(p, bp);
        if(l.getBlock().getType() != Material.valueOf("BED_BLOCK")) {
        	Material type = l.getBlock().getType();
        	l.getBlock().setType(Material.valueOf("BED_BLOCK"));
        	Bukkit.getScheduler().runTaskLater(MCPT.plugin, ()->{
        		p.playerConnection.sendPacket(packetplayoutbed);
        		l.getBlock().setType(type);
        	}, 1L);
        }else {
        	p.playerConnection.sendPacket(packetplayoutbed);
        }
        return true;
	}

	@Override
	public void leaveSleep(Player player) {
		EntityPlayer p =((CraftPlayer)player).getHandle();
		PacketPlayOutAnimation ppoa = new PacketPlayOutAnimation(p, 2);
		p.playerConnection.sendPacket(ppoa);
	}

}
