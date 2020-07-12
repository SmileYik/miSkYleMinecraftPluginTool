package com.github.miskyle.mcpt.nms.sleep;

import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.craftbukkit.v1_12_R1.entity.CraftPlayer;
import org.bukkit.entity.Player;

import net.minecraft.server.v1_12_R1.BlockFacingHorizontal;
import net.minecraft.server.v1_12_R1.BlockPosition;
import net.minecraft.server.v1_12_R1.CriterionTriggers;
import net.minecraft.server.v1_12_R1.EntityPlayer;
import net.minecraft.server.v1_12_R1.EnumDirection;
import net.minecraft.server.v1_12_R1.IBlockState;
import net.minecraft.server.v1_12_R1.PacketPlayOutBed;
import net.minecraft.server.v1_12_R1.StatisticList;

public class NMSSleep_1_12R1 implements NMSSleep{
	
	public void sleep(Player player,Block b) {
		EntityPlayer p =((CraftPlayer)player).getHandle();
		//SET BED BLOCk
		
        BlockPosition bp = new BlockPosition(b.getX(), b.getY(), b.getZ());
        p.b(StatisticList.ab);
        PacketPlayOutBed packetplayoutbed = new PacketPlayOutBed(p, bp);
        p.x().getTracker().a(p, packetplayoutbed);
        p.playerConnection.a(p.locX, p.locY, p.locZ, p.yaw, p.pitch);
        p.playerConnection.sendPacket(packetplayoutbed);
        CriterionTriggers.p.a(p);
	}

}
