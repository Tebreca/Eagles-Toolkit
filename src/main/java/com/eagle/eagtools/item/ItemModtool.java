package com.eagle.eagtools.item;

import java.util.Set;

import com.google.common.collect.Sets;

import crazypants.enderio.BlockEio;
import crazypants.enderio.EnderIOTab;
import net.minecraft.block.Block;
import net.minecraft.item.ItemPickaxe;
class ItemModtool extends ItemPickaxe{

	public ItemModtool(String UL, ToolMaterial material) {
		super(material);
		this.setCreativeTab(EnderIOTab.tabEnderIOItems);
		this.setUnlocalizedName(UL);
		this.setMaxStackSize(1);
	}
	
	private static final Set<Block> EFFECTIVE_ON = Sets.newHashSet(new Block[]{,});
}
