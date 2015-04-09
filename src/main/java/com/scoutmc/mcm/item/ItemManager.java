package com.scoutmc.mcm.item;

import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ItemManager {
	
	/** Making Items */
	
	public static Item InfusionTool;
	
	/** Registering Items */
	
	public static void registerItems() {
		
		GameRegistry.registerItem(InfusionTool, "InfusionTool");
		
	}
	
	/** Defining Items */
	
	public static void defineItems() {
		
		InfusionTool = new ItemInfusionTool();
		
	}

}
