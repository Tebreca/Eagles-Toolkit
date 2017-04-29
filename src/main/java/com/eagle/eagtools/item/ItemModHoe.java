package com.eagle.eagtools.item;

import crazypants.enderio.EnderIOTab;
import net.minecraft.item.ItemHoe;

public class ItemModHoe extends ItemHoe{

	public ItemModHoe(String uln, ToolMaterial material) {
		super(material);
		this.setUnlocalizedName(uln);
		this.setCreativeTab(EnderIOTab.tabEnderIOItems);
		this.setMaxStackSize(1);
	}

}
