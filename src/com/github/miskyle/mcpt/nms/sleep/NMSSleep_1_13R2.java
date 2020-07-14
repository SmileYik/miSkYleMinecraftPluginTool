package com.github.miskyle.mcpt.nms.sleep;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.craftbukkit.v1_13_R2.entity.CraftPlayer;
import org.bukkit.entity.Player;
import org.bukkit.util.Vector;

import com.github.miskyle.mcpt.MCPT;

import net.minecraft.server.v1_13_R2.BlockPosition;
import net.minecraft.server.v1_13_R2.EntityPlayer;
import net.minecraft.server.v1_13_R2.PacketPlayOutAnimation;
import net.minecraft.server.v1_13_R2.PacketPlayOutBed;


public class NMSSleep_1_13R2 implements NMSSleep{
	
	public boolean sleep(Player player, Location l) {
		player.setVelocity(new Vector());
		EntityPlayer p =((CraftPlayer)player).getHandle();
        BlockPosition bp = new BlockPosition(l.getBlockX(), l.getBlockY(), l.getBlockZ());
        PacketPlayOutBed packetplayoutbed = new PacketPlayOutBed(p, bp);
        if(!l.getBlock().getType().name().contains("BED")) {
        	Material type = l.getBlock().getType();
        	l.getBlock().setType(Material.valueOf("BLACK_BED"));
        	Bukkit.getScheduler().runTaskLater(MCPT.plugin, ()->{
        		p.playerConnection.sendPacket(packetplayoutbed);
        		l.getBlock().setType(type);
        	}, 1L);
        }else {
        	p.playerConnection.sendPacket(packetplayoutbed);
        }
        return true;
	}

//	@Override
//	public void sleep(Player player, Location l) {
//		player.setVelocity(new Vector());
//		EntityPlayer p =((CraftPlayer)player).getHandle();
//        BlockPosition bp = new BlockPosition(l.getX(), l.getY(), l.getZ());
//        PacketPlayOutBed packetplayoutbed = new PacketPlayOutBed(p, bp);
//        if(l.getBlock().getType() != Material.BLACK_BED) {
//        	Material type = l.getBlock().getType();
//        	l.getBlock().setType(Material.BLACK_BED);
//        	Bukkit.getScheduler().runTaskLater(MCPT.plugin, ()->{
//        		l.getBlock().setType(type);
//        	}, 20L);
//        }
//        p.playerConnection.sendPacket(packetplayoutbed);
//	}

	@Override
	public void leaveSleep(Player player) {
		EntityPlayer p =((CraftPlayer)player).getHandle();
		PacketPlayOutAnimation ppoa =new PacketPlayOutAnimation(p, 2);
		p.playerConnection.sendPacket(ppoa);
		
	}

//	  public static void ProtocolSleep(final Player p) {
//		    Location playerlocation = p.getLocation().clone();
//		    World w = p.getWorld();
//		    Block block = null;
//		    Material mat = XMaterial.AIR.parseMaterial();
//		    BedData bed = null;
//		    block = w.getBlockAt(playerlocation);
//		    //final BlockData originaldata = block.getBlockData().clone();
//		    Block trytarget = w.getBlockAt(p.getLocation().add(0.0D, -1.0D, 0.0D));
//		    if (trytarget.getType().toString().contains("BED")) {
//		      Location loc = trytarget.getLocation();
//		      block = trytarget;
//		      mat = block.getType();
//		      CraftPlayer craft = (CraftPlayer)p;
//		      
//		      EntityPlayer entityPlayer = craft.getHandle();
//		      BlockPosition blocks = new BlockPosition(loc.getBlockX(), loc.getBlockY(), loc.getBlockZ());
//		      EntityHuman.EnumBedResult bedaa = entityPlayer.a(blocks);
//		      
//		      return;
//		    } 
//		    
//		  }
	

}
