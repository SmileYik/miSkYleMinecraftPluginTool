package com.github.miskyle.mcpt.nms.nbtitem;

import org.bukkit.inventory.ItemStack;

public interface NBTItem {
	public boolean 		contantsNBT(ItemStack item, String key);
	public ItemStack	setNBT(ItemStack item, String key, Object value);
	public String 		getString(ItemStack item, String key);
	public Integer 		getInt(ItemStack item, String key);
	public int[] 		getIntArray(ItemStack item, String key);
	public Double 		getDouble(ItemStack item, String key);
	public Short 		getShort(ItemStack item, String key);
	public Boolean 		getBoolean(ItemStack item, String key);
	public Byte 		getByte(ItemStack item, String key);
	public byte[] 		getByteArray(ItemStack item, String key);
	public Float 		getFloat(ItemStack item, String key);
	public Long 		getLong(ItemStack item, String key);
	public String getNBTTagCompound(ItemStack item);
	
	public static NBTItem getNBTItem(String bukkitVersion) {
		switch (bukkitVersion) {
		case "v1_17_R1":
		  return new NBTItem_1_17R1();
        case "v1_16_R3":
          return new NBTItem_1_16R3();
        case "v1_16_R2":
          return new NBTItem_1_16R2();
        case "v1_16_R1":
          return new NBTItem_1_16R1();
		case "v1_15_R1":
			return new NBTItem_1_15R1();
		case "v1_14_R1":
			return new NBTItem_1_14R1();
		case "v1_13_R2":
			return new NBTItem_1_13R2();
		case "v1_12_R1":
			return new NBTItem_1_12R1();
		case "v1_11_R1":
			return new NBTItem_1_11R1();
		case "v1_10_R1":
			return new NBTItem_1_10R1();
		case "v1_9_R2":
			return new NBTItem_1_9R2();
		case "v1_9_R1":
			return new NBTItem_1_9R1();
		case "v1_8_R3":
			return new NBTItem_1_8R3();
		case "v1_8_R1":
			return new NBTItem_1_8R1();
		case "v1_7_R4":
			return new NBTItem_1_7R4();
	     case "v1_7_R1":
           return new NBTItem_1_7R1();
	     case "v1_6_R2":
           return new NBTItem_1_6R2();
	     case "v1_6_R3":
           return new NBTItem_1_6R3();
	     case "v1_5_R3":
           return new NBTItem_1_5R3();
		default:
			return new NBTItemNull();
		}
	};
}
