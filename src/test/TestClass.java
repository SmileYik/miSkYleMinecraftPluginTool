package test;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.java.JavaPlugin;

import com.github.miskyle.mcpt.MCPT;
import com.github.miskyle.mcpt.nms.sleep.*;

public class TestClass extends JavaPlugin{
	public static Plugin plug;
	
	@Override
	public void onEnable() {
		plug = this;
		MCPT.plugin = this;
		super.onEnable();
		NMSSleep_1_15R1 sleep = new NMSSleep_1_15R1();
		for(Player p : this.getServer().getOnlinePlayers()) {
			sleep.leaveSleep(p);
		}
		
		for(Material m : Material.values()) {
			try {
				if(m!=null)
				System.out.println(m+" "+new ItemStack(m).getItemMeta().getLocalizedName());
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	@Override
	public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
		// TODO Auto-generated method stub
		if(label.equalsIgnoreCase("test")) {
			switch (args[0].toUpperCase()) {
			case "SLEEP":{
				NMSSleep_1_15R1 sleep = new NMSSleep_1_15R1();
				Location l = ((Player)sender).getLocation();
				Bukkit.getScheduler().runTaskLater(this,()->{
					sleep.sleep((Player)sender, l);					
				}, 10L);
			}
				
				break;

			default:
				break;
			}
		}
		return true;
	}
}
