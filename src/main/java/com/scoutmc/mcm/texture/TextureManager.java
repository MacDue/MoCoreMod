package com.scoutmc.mcm.texture;

public class TextureManager {
	
	/** Registering Item Textures */
	//CALL THIS IN YOUR CLIENT PROXY IF YOU DON'T WANT THE SERVER TO CRASH
	public static void registerItemTextures() {
		//You need to import some things
		renderItem.getItemModelMesher().register(ItemManager.YourItem , 0, new ModelResourceLocation("mcm" + ":YourItem", "inventory"));

		
	}
	
	/** Registering Block Textures */
	
	public static void registerBlockTextures() {
		renderItem.getItemModelMesher().register(Item.getItemFromBlock(BlockManage.YourBlock), 0, new ModelResourceLocation("mcm" + ":YourBlock", "inventory"));

		
		
	}

}
