
package com.scoutmc.mcm.Blocks;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class BlockEnd extends Block
{
	private final String name = "YourBlock";
	public BlockEnd()
	{
	super(Material.rock);
	GameRegistry.registerBlock(this, name);
	setUnlocalizedName(name);
//	setCreativeTab();
//the tab you want in there 
	}
	
	public String getName()
	{
	return name;
	}
    
}
