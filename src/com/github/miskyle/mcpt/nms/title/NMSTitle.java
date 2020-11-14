package com.github.miskyle.mcpt.nms.title;

import org.bukkit.entity.Player;

public interface NMSTitle {
	public void sendTitle(Player player,TitleAction action,
			String msg,int fadeIn,int stay,int fadeOut);
	public void sendTitle(Player player,TitleAction action,
			String msg,int ... args);
	
	public static NMSTitle getTitle(String bukkitVersion) {
		switch (bukkitVersion) {
		case "v1_16_R3":
          return new Title_1_16R3();
		case "v1_16_R2":
          return new Title_1_16R2();
        case "v1_16_R1":
          return new Title_1_16R1();
		case "v1_15_R1":
			return new Title_1_15R1();
		case "v1_14_R1":
			return new Title_1_14R1();
		case "v1_13_R2":
			return new Title_1_13R2();
		case "v1_12_R1":
			return new Title_1_12R1();
		case "v1_11_R1":
			return new Title_1_11R1();
		case "v1_10_R1":
			return new Title_1_10R1();
		case "v1_9_R2":
			return new Title_1_9R2();
		case "v1_9_R1":
			return new Title_1_9R1();
		case "v1_8_R3":
			return new Title_1_8R3();
		case "v1_8_R1":
			return new Title_1_8R1();
		default:
			return null;
		}
	};
}
