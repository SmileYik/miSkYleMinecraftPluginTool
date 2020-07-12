package com.github.miskyle.mcpt.nms.sleep;

import org.bukkit.Material;
import org.bukkit.block.Block;

import com.github.miskyle.mcpt.MCPT;

public class BedChanger {
	private Block block;
	private Material material;
	
	private BedChanger(Block block) {
		this.block = block;
	}
	
	public static BedChanger runBedChanger(Block block,String bedMaterial) {
		BedChanger bc = new BedChanger(block);
		bc.material = block.getType();
		block.setType(Material.valueOf("BED_BLOCK"));
		return bc;
	}
	
	public void recover() {
		MCPT.plugin.getServer().getScheduler().runTaskLater(MCPT.plugin,()->{
			block.setType(this.material);
		}, 1L);
	}

	public Block getBlock() {
		return block;
	}

	public void setBlock(Block block) {
		this.block = block;
	}

	public Material getMaterial() {
		return material;
	}

	public void setMaterial(Material material) {
		this.material = material;
	}
	
	
}
