package test;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

import com.github.miskyle.mcpt.nms.sleep.NMSSleep;
import com.github.miskyle.mcpt.nms.sleep.NMSSleep_1_12R1;
import com.github.miskyle.mcpt.nms.sleep.NMSSleep_1_15R1;

public class TestClass extends JavaPlugin{
	@Override
	public void onEnable() {
		super.onEnable();
	}
	@Override
	public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
		// TODO Auto-generated method stub
		if(label.equalsIgnoreCase("test")) {
			switch (args[0].toUpperCase()) {
			case "SLEEP":{
				NMSSleep_1_15R1 sleep = new NMSSleep_1_15R1();
				Location l = ((Player)sender).getLocation();
				l.getBlock().setType(Material.ORANGE_BED);
				Bukkit.getScheduler().runTaskLater(this,()->{
					sleep.sleep((Player)sender, l.getBlock());					
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
