package com.github.miskyle.mcpt.nms.sleep;

import org.bukkit.Location;
import org.bukkit.entity.Player;

public interface NMSSleep {
	public boolean sleep(Player p,Location b);
	public void leaveSleep(Player p);
	public default boolean isSleep(Player p) {
		return true;
	}
	
	public static NMSSleep getNMSSleep(String bukkitVersion) {
		switch (bukkitVersion) {
		case "v1_15_R1":
			return new NMSSleep_1_15R1();
		case "v1_14_R1":
			return new NMSSleep_1_14R1();
		case "v1_13_R2":
			return new NMSSleep_1_13R2();
		case "v1_12_R1":
			return new NMSSleep_1_12R1();
		case "v1_11_R1":
			return new NMSSleep_1_11R1();
		case "v1_10_R1":
			return new NMSSleep_1_10R1();
		case "v1_9_R2":
			return new NMSSleep_1_9R2();
		case "v1_9_R1":
			return new NMSSleep_1_9R1();
		case "v1_8_R3":
			return new NMSSleep_1_8R3();
		case "v1_8_R1":
			return new NMSSleep_1_8R1();
		case "v1_7_R4":
			return new NMSSleep_1_7R4();
		default:
			return null;
		}
	}
}
