package com.eagle.eagtools.item;

import crazypants.enderio.EnderIOTab;
import net.minecraft.item.ItemSpade;

public class ItemModSpade extends ItemSpade{

	public ItemModSpade(String uln,ToolMaterial material) {
		super(material);
		this.setUnlocalizedName(uln);
		this.setCreativeTab(EnderIOTab.tabEnderIOItems);
		this.setMaxStackSize(1);
	}

}
