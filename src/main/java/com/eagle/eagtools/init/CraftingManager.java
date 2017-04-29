package com.eagle.eagtools.init;

import java.util.List;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class CraftingManager {
	public static void register(){
		addRecipe();
		addSmelting();
	}
	
	public static void addRecipe(){
		GameRegistry.addRecipe(new ItemStack(Eagitems.naturepowder, 12), new Object[]{"ABA","CDC","ABA",'A', Items.WHEAT_SEEDS, 'B', Items.REEDS, 'C', Items.APPLE, 'D', Items.GUNPOWDER} );
		GameRegistry.addRecipe(new ItemStack(Eagitems.natureiron, 1), new Object[]{"AAA","ABA","AAA",'A',Eagitems.naturecoal ,'B',Items.IRON_INGOT });
		GameRegistry.addRecipe(new ItemStack(Eagitems.naturecoal, 1), new Object[]{"AAA","ABA","AAA",'A', Eagitems.naturepowder ,'B', Items.COAL});
	}
	
	private static List<ItemStack> ItemStack(Item coal) {
		// TODO Auto-generated method stub
		return null;
	}

	public static void addSmelting(){
		GameRegistry.addSmelting(Eagitems.natureiron, new ItemStack(Eagitems.naturesteel),12.0f);
	}
}
