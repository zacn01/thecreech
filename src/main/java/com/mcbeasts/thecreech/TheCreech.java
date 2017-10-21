package com.mcbeasts.thecreech;

import com.mcbeasts.item.ModItems;
import com.mcbeasts.proxy.CommonProxy;

import net.minecraft.item.Item;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@Mod(modid = TheCreech.modId, name = TheCreech.name, version = TheCreech.version)
public class TheCreech {
	
	public static final String modId = "thecreech";
	public static final String name = "The Chreech";
	public static final String version = "0.1";
	
	@Mod.Instance(modId)
	public static TheCreech instance;
	
	@SidedProxy(serverSide = "com.mcbeasts.proxy.CommonProxy", clientSide = "com.mcbeasts.proxy.ClientProxy")
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
	
	@Mod.EventBusSubscriber
	public static class RegistrationHandler {
	
		@SubscribeEvent
		public static void registerItems(RegistryEvent.Register<Item> event) {
			ModItems.register(event.getRegistry());
		}
		
		@SubscribeEvent
		public static void registerItems(ModelRegistryEvent event) {
			ModItems.registerModels();
		}
	}

}
