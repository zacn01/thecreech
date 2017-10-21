package com.mcbeasts.thecreech;

import com.mcbeasts.proxy.CommonProxy;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

@Mod(modid = TheCreech.modId, name = TheCreech.name, version = TheCreech.version)
public class TheCreech {
	
	public static final String modId = "thecreech";
	public static final String name = "The Chreech";
	public static final String version = "0.1";
	
	@Mod.Instance(modId)
	public static TheCreech instance;
	
	@SidedProxy(serverSide = "com.mcbeasts.thecreech.proxy.CommonProxy", clientSide = "com.mcbeasts.thecreech.proxy.ClientProxy")
	public static CommonProxy proxy;

	@Mod.EventHandler
	public void preInit(FMLInitializationEvent event) {
		System.out.println("The beast is sharpening his claws...");
	}
	
	@Mod.EventHandler
	public void init(FMLInitializationEvent event) {
		
	}

	@Mod.EventHandler
	public void postInit(FMLInitializationEvent event) {
		
	}

}
