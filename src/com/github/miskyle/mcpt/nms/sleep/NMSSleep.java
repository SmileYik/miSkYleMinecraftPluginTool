package com.github.miskyle.mcpt.nms.sleep;

import org.bukkit.block.Block;
import org.bukkit.entity.Player;

public interface NMSSleep {
	public void sleep(Player p,Block b);
	default public void leaveSleep(Player p,Block b) {
		
	}
}
