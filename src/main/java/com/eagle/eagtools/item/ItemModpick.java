package com.eagle.eagtools.item;

import crazypants.enderio.EnderIOTab;
import net.minecraft.item.ItemPickaxe;

public class ItemModpick extends ItemPickaxe{

	public ItemModpick(String uln, ToolMaterial material) {
		super(material);
		this.setUnlocalizedName(uln);
		this.setCreativeTab(EnderIOTab.tabEnderIOItems);
		this.setMaxStackSize(1);
	}

}
