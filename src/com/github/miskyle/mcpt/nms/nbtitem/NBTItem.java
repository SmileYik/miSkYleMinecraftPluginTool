package com.github.miskyle.mcpt.nms.nbtitem;

import org.bukkit.inventory.ItemStack;

public interface NBTItem {
	public ItemStack addNBT(ItemStack is,String key,String value);
	public String getNBTValue(ItemStack is,String key);
}
