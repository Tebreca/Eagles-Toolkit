package com.eagle.eagtools.init;

import com.eagle.eagtools.client.Variables;
import com.eagle.eagtools.item.ItemModArmor;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.init.SoundEvents;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class Eagarmor {

	
	public static ArmorMaterial naturearmor = EnumHelper.addArmorMaterial("naturearmor", "eagtools:Organic", 50, new int[]{4,9,6,3}, 64, SoundEvents.ITEM_ARMOR_EQUIP_LEATHER, 1);
	public static Item Organic_helmet;
	public static Item Organic_chestplate;
	public static Item Organic_leggings;
	public static Item Organic_boots;
	
	public static void register(){
		GameRegistry.registerItem(Organic_helmet = new ItemModArmor("Organic_helmet", naturearmor, 1, EntityEquipmentSlot.HEAD), Organic_helmet.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(Organic_chestplate = new ItemModArmor("Organic_chestplate", naturearmor, 1, EntityEquipmentSlot.CHEST), Organic_chestplate.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(Organic_leggings = new ItemModArmor("Organic_leggings", naturearmor, 1, EntityEquipmentSlot.LEGS), Organic_leggings.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(Organic_boots = new ItemModArmor("Organic_boots", naturearmor, 1, EntityEquipmentSlot.FEET), Organic_boots.getUnlocalizedName().substring(5));
	}
	
	public static void registerRenders(){
		registerRender(Organic_helmet);
		registerRender(Organic_chestplate);
		registerRender(Organic_leggings);
		registerRender(Organic_boots);
	}
	
	public static void registerRender(Item item){
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(Variables.PREID + item.getUnlocalizedName().substring(5), "inventory"));
	}
}
