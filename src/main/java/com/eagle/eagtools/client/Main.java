package com.eagle.eagtools.client;

import com.eagle.eagtools.init.CraftingManager;
import com.eagle.eagtools.init.Eagarmor;
import com.eagle.eagtools.init.Eagitems;
import com.eagle.eagtools.init.FuelHandler;
import com.eagle.eagtools.proxy.ServerProxy;

import net.minecraft.init.Items;
import net.minecraftforge.fml.common.IFuelHandler;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.event.FMLServerStartingEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;

@Mod(modid = Variables.MOD_ID, name = Variables.MOD_NAME, version = Variables.MOD_VERSION)
public class Main {
	
	@SidedProxy(clientSide = Variables.CLIENTCLASS, serverSide = Variables.SERVERCLASS)
	public static ServerProxy proxy;
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent event){
		Eagitems.init();
		Eagitems.register();
		CraftingManager.register();
		Eagarmor.register();
	}
	
	@EventHandler
	public void Init(FMLInitializationEvent event){
		proxy.registerRenders();
		GameRegistry.registerFuelHandler(new FuelHandler());
	}
	
	@EventHandler
	public void postInit(FMLPostInitializationEvent event){
		
	}
	
	@EventHandler
	public void serverload(FMLServerStartingEvent event){
		
	}
}
