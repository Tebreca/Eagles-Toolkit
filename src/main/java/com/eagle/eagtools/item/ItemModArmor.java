package com.eagle.eagtools.item;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;

public class ItemModArmor extends ItemArmor{

	public ItemModArmor(String UnlocalizedName, ArmorMaterial materialIn, int renderIndexIn, EntityEquipmentSlot equipmentSlotIn) {
		super(materialIn, renderIndexIn, equipmentSlotIn);
		this.setUnlocalizedName(UnlocalizedName);
		this.setCreativeTab(CreativeTabs.COMBAT);
		this.setMaxStackSize(1);
	}

}
