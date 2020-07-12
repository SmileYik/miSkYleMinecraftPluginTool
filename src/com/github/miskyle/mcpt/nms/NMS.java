package com.github.miskyle.mcpt.nms;

import com.github.miskyle.mcpt.nms.actionbar.*;
import com.github.miskyle.mcpt.nms.nbtitem.*;
import com.github.miskyle.mcpt.nms.title.*;

public class NMS {
	
	public static NBTItem      nbtItem;
	public static NMSActionBar actionBar;
	public static NMSTitle     title;
	
	
	public static void initialize(String bukkitVersion) {
		//v1_12R1
		switch (bukkitVersion) {
		case "v1_15R1":
			nbtItem   = new NBTItem_1_15R1();
			actionBar = new ActionBar_1_15R1();
			title     = new Title_1_15R1();
			break;
		case "v1_14R1":
			nbtItem   = new NBTItem_1_14R1();
			actionBar = new ActionBar_1_14R1();
			title     = new Title_1_14R1();
			break;
		case "v1_13R2":
			nbtItem   = new NBTItem_1_13R2();
			actionBar = new ActionBar_1_13R2();
			title     = new Title_1_13R2();
			break;
		case "v1_12R1":
			nbtItem   = new NBTItem_1_12R1();
			actionBar = new ActionBar_1_12R1();
			title     = new Title_1_12R1();
			break;
		case "v1_11R1":
			nbtItem   = new NBTItem_1_11R1();
			actionBar = new ActionBar_1_11R1();
			title     = new Title_1_11R1();
			break;
		case "v1_10R1":
			nbtItem   = new NBTItem_1_10R1();
			actionBar = new ActionBar_1_10R1();
			title     = new Title_1_10R1();
			break;
		case "v1_9R2":
			nbtItem   = new NBTItem_1_9R2();
			actionBar = new ActionBar_1_9R2();
			title     = new Title_1_9R2();
			break;
		case "v1_9R1":
			nbtItem   = new NBTItem_1_9R1();
			actionBar = new ActionBar_1_9R1();
			title     = new Title_1_9R1();
			break;
		case "v1_8R3":
			nbtItem   = new NBTItem_1_8R3();
			actionBar = new ActionBar_1_8R3();
			title     = new Title_1_8R3();
			break;
		case "v1_8R1":
			nbtItem   = new NBTItem_1_8R1();
			actionBar = new ActionBar_1_8R1();
			title     = new Title_1_8R1();
			break;
		case "v1_7R4":
			nbtItem   = new NBTItem_1_7R4();
			actionBar = new ActionBar_1_7R4();
			title     = null;
			break;
		default:
			nbtItem   = null;
			actionBar = null;
			title     = null;
			break;
		}
	}
}
