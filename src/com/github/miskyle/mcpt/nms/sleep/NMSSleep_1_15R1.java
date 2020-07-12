package com.github.miskyle.mcpt.nms.sleep;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.craftbukkit.v1_15_R1.entity.CraftPlayer;
import org.bukkit.entity.Player;
import org.bukkit.event.player.PlayerBedEnterEvent;

import com.mojang.datafixers.util.Either;

import net.minecraft.server.v1_15_R1.BlockPosition;
import net.minecraft.server.v1_15_R1.CriterionTriggers;
import net.minecraft.server.v1_15_R1.EntityHuman.EnumBedResult;
import net.minecraft.server.v1_15_R1.EntityPlayer;
import net.minecraft.server.v1_15_R1.MinecraftKey;
import net.minecraft.server.v1_15_R1.StatisticList;
import net.minecraft.server.v1_15_R1.Unit;


public class NMSSleep_1_15R1 implements NMSSleep{
	
	public void sleep(Player player,Block b) {
		EntityPlayer p =((CraftPlayer)player).getHandle();
		//SET BED BLOCk
        BlockPosition bp = new BlockPosition(b.getX(), b.getY(), b.getZ());
        System.out.println(p.sleep(bp,true));
        p.a(StatisticList.SLEEP_IN_BED);
        CriterionTriggers.q.a(p);
	}

	

}
