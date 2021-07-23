package com.github.miskyle.mcpt.nms.sleep;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.craftbukkit.v1_16_R3.entity.CraftPlayer;
import org.bukkit.entity.Player;
import org.bukkit.util.Vector;

import net.minecraft.server.v1_16_R3.Entity;
import net.minecraft.server.v1_16_R3.EntityPlayer;
import net.minecraft.server.v1_16_R3.EntityPose;


public class NMSSleep_1_16R3 implements NMSSleep{
  
  private static Method setPose;
  
  static {
    try {
      setPose = Entity.class.getMethod("setPose", EntityPose.class);
      setPose.setAccessible(true);
    } catch (NoSuchMethodException e) {
      e.printStackTrace();
    } catch (SecurityException e) {
      e.printStackTrace();
    }
  }
 
	@Override
	public boolean sleep(Player player, Location b) {
		boolean flag = false;
		EntityPlayer p =((CraftPlayer)player).getHandle();
		if(b.getBlock().getType() == Material.AIR) {
			b.getBlock().setType(Material.valueOf("WHITE_CARPET"));
			flag = true;
		}
       
		b.setY(Math.floor(b.getY()));
        player.teleport(b);
        player.setVelocity(new Vector());
        try {
			setPose.invoke(p, EntityPose.SLEEPING);
		} catch (SecurityException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			e.printStackTrace();
		}
		return flag;
	}

	@Override
	public void leaveSleep(Player p) {
		p.teleport(p.getLocation().add(0, 0.75, 0));
		
	}
	
	@Override
	public boolean isSleep(Player p) {
		return ((CraftPlayer)p).getHandle().getPose() == EntityPose.SLEEPING;
	}

}
