package com.github.miskyle.mcpt.nms.actionbar;

import org.bukkit.entity.Player;

public interface NMSActionBar {
	public void sendActionBar(Player player,String msg);
	public static NMSActionBar getActionBar(String bukkitVersion) {
		switch (bukkitVersion) {
		case "v1_15_R1":
			return new ActionBar_1_15R1();
		case "v1_14_R1":
			return new ActionBar_1_14R1();
		case "v1_13_R2":
			return new ActionBar_1_13R2();
		case "v1_12_R1":
			return new ActionBar_1_12R1();
		case "v1_11_R1":
			return new ActionBar_1_11R1();
		case "v1_10_R1":
			return new ActionBar_1_10R1();
		case "v1_9_R2":
			return new ActionBar_1_9R2();
		case "v1_9_R1":
			return new ActionBar_1_9R1();
		case "v1_8_R3":
			return new ActionBar_1_8R3();
		case "v1_8_R1":
			return new ActionBar_1_8R1();
		case "v1_7_R4":
			return new ActionBar_1_7R4();
	     case "v1_7_R1":
           return new ActionBar_1_7R1();
	     case "v1_6_R3":
           return new ActionBar_1_6R3();
	     case "v1_6_R2":
           return new ActionBar_1_6R2();
	     case "v1_5_R3":
           return new ActionBar_1_5R3();
		default:
			return null;
		}
	};
}
