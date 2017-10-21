package com.mcbeasts.item;

import com.mcbeasts.item.tool.ItemSword;
import com.mcbeasts.thecreech.TheCreech;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraftforge.registries.IForgeRegistry;

public class ModItems {

	public static ItemBase beastClaw = new ItemBase("beast_claw").setCreativeTab(CreativeTabs.MISC);
	public static ItemBase beastBreakerSplashPoison = new ItemBase("beast_breaker_poison").setCreativeTab(CreativeTabs.COMBAT);
	public static ItemSword beastBreakerSword = new ItemSword(TheCreech.beastClawToolMaterial, "beast_breaker_sword");
	
	public static void register(IForgeRegistry<Item> registry) {
		registry.registerAll(
			beastClaw,
			beastBreakerSplashPoison,
			beastBreakerSword
		);
	}

	public static void registerModels() {
		beastClaw.registerItemModel();
		beastBreakerSplashPoison.registerItemModel();
		beastBreakerSword.registerItemModel();;
	}

}
