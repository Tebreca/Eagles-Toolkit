package com.eagle.eagtools.client;

import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class Variables {

	public static final String MOD_ID = "eagtools";
	public static final String MOD_NAME = "Eagles Toolkit";
	public static final String MOD_VERSION = "1.0 BETA";
	public static final String CLIENTCLASS = "com.eagle.eagtools.proxy.ClientProxy";
	public static final String SERVERCLASS = "com.eagle.eagtools.proxy.ServerProxy";
	public static final String PREID = Variables.MOD_ID + ":";
	public static final int fueltime = GameRegistry.getFuelValue(new ItemStack(Items.COAL));
}
