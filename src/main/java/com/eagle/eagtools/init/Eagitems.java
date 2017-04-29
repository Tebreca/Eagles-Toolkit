package com.eagle.eagtools.init;

import com.eagle.eagtools.client.Variables;
import com.eagle.eagtools.item.ItemModHoe;
import com.eagle.eagtools.item.ItemModSpade;
import com.eagle.eagtools.item.ItemModpick;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class Eagitems {
	public static Item naturepowder;
	public static Item naturecoal;
	public static Item natureiron;
	public static Item naturesteel;
	
	public static ToolMaterial electricSteel = EnumHelper.addToolMaterial("electricsteel", 4, 1000, 9.0f, 0.0f, 0);
	public static Item factorytool;
	public static Item electrical_steel_pickaxe;
	public static Item electrical_steel_shovel;
	public static Item electrical_steel_hoe;
	
	public static void init(){
		naturecoal = new Item().setCreativeTab(CreativeTabs.MATERIALS).setMaxStackSize(64).setUnlocalizedName("naturecoal");
		natureiron = new Item().setCreativeTab(CreativeTabs.MATERIALS).setMaxStackSize(64).setUnlocalizedName("natureiron");
		naturesteel = new Item().setCreativeTab(CreativeTabs.MATERIALS).setMaxStackSize(64).setUnlocalizedName("naturesteel");
		naturepowder = new Item().setCreativeTab(CreativeTabs.MATERIALS).setMaxStackSize(64).setUnlocalizedName("naturepowder");
	}
	
	public static void register(){
		GameRegistry.registerItem(naturepowder, naturepowder.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(naturecoal, naturecoal.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(natureiron, natureiron.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(naturesteel, naturesteel.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(electrical_steel_hoe = new ItemModHoe("electrical_steel_hoe", electricSteel), electrical_steel_hoe.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(electrical_steel_pickaxe = new ItemModpick("electrical_steel_pickaxe", electricSteel), electrical_steel_pickaxe.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(electrical_steel_shovel = new ItemModSpade("electrical_steel_spade", electricSteel), electrical_steel_shovel.getUnlocalizedName().substring(5));
		}
	
	public static void registerRenders(){
		registerRender(naturepowder);
		registerRender(naturecoal);
		registerRender(natureiron);
		registerRender(naturesteel);
		registerRender(electrical_steel_pickaxe);
		registerRender(electrical_steel_shovel);
		registerRender(electrical_steel_hoe);
		
	}
	
	public static void registerRender(Item item){
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(Variables.PREID + item.getUnlocalizedName().substring(5), "inventory"));
	}
}
