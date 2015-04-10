package com.scoutmc.mcm;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

import com.scoutmc.mcm.item.ItemManager;
import com.scoutmc.mcm.proxy.CommonProxy;
import com.scoutmc.mcm.refstrings.RefStrings;
import com.scoutmc.mcm.texture.TextureManager;

@Mod(modid = RefStrings.MOD_ID, name = RefStrings.MOD_NAME, version = RefStrings.MOD_VERSION)
public class MCM {
        public static net.minecraft.block.Block YourBlock;
	
	/** Proxy */
	
	@SidedProxy(clientSide=RefStrings.CLIENT_PROXY_CLASS, serverSide=RefStrings.SERVER_PROXY_CLASS)
	public static CommonProxy proxy;
	
	/** EventHandlers */
	
	@EventHandler
	public static void init(FMLInitializationEvent event) {
		
		//TODO Import block manager
			        BlockManage.registerBlocks();
	        BlockManage.defineBlocks();
		ItemManager.registerItems();

		ItemManager.defineItems();
		
		TextureManager.registerItemTextures();
		TextureManager.registerBlockTextures();
		
	}
	
	@EventHandler
	public static void preInit(FMLPreInitializationEvent event) {

	}
	
	@EventHandler
	public static void postInit(FMLPostInitializationEvent event) {
		
		
		
	}
	
	/** MCM */
	
	public MCM() {
		
		
		
	}

}
