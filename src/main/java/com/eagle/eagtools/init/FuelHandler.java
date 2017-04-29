package com.eagle.eagtools.init;

import com.eagle.eagtools.client.Variables;

import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.IFuelHandler;

public class FuelHandler implements IFuelHandler{

	@Override
	public int getBurnTime(ItemStack fuel) {
		if(Eagitems.naturecoal != null) {
			return 10000;
		}else {
			return 0;
		}
	}
	
	

}
