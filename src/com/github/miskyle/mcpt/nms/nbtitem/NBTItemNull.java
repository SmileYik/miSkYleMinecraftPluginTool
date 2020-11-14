package com.github.miskyle.mcpt.nms.nbtitem;

public class NBTItemNull implements NBTItem{
	
	@Override
	public org.bukkit.inventory.ItemStack setNBT(
			org.bukkit.inventory.ItemStack is, String key, Object value) {
		return null;
	}

	@Override
	public String getString(org.bukkit.inventory.ItemStack is, String key) {
		return null;
	}

	@Override
	public Integer getInt(org.bukkit.inventory.ItemStack is, String key) {
	  return null;
	}

	@Override
	public int[] getIntArray(org.bukkit.inventory.ItemStack is, String key) {
	  return null;
	}

	@Override
	public Double getDouble(org.bukkit.inventory.ItemStack is, String key) {
	  return null;
	}

	@Override
	public Short getShort(org.bukkit.inventory.ItemStack is, String key) {
	  return null;
	}

	@Override
	public Boolean getBoolean(org.bukkit.inventory.ItemStack is, String key) {
	  return null;
	}

	@Override
	public Byte getByte(org.bukkit.inventory.ItemStack is, String key) {
	  return null;
	}

	@Override
	public byte[] getByteArray(org.bukkit.inventory.ItemStack is, String key) {
	  return null;
	}

	@Override
	public Float getFloat(org.bukkit.inventory.ItemStack is, String key) {
	  return null;
	}

	@Override
	public Long getLong(org.bukkit.inventory.ItemStack is, String key) {
	  return null;
	}

	@Override
	public boolean contantsNBT(org.bukkit.inventory.ItemStack is, String key) {
	  return false;
	}
	
    @Override
    public String getNBTTagCompound(org.bukkit.inventory.ItemStack is) {
      return null;
    }
}
