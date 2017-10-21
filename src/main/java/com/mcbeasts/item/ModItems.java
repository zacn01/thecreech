package com.mcbeasts.item;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraftforge.registries.IForgeRegistry;

public class ModItems {

	public static ItemBase beastClaw = new ItemBase("beast_claw").setCreativeTab(CreativeTabs.MISC);

	public static void register(IForgeRegistry<Item> registry) {
		registry.registerAll(
			beastClaw
		);
	}

	public static void registerModels() {
		beastClaw.registerItemModel();
	}

}
