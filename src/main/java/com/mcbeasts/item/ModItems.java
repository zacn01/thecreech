package com.mcbeasts.item;

import com.mcbeasts.item.tool.ItemSword;
import com.mcbeasts.thecreech.TheCreech;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraftforge.registries.IForgeRegistry;

public class ModItems {

	public static ItemBase beastClaw = new ItemBase("beast_claw").setCreativeTab(CreativeTabs.MISC);
	public static ItemBase beastPelt = new ItemBase("beast_pelt").setCreativeTab(CreativeTabs.MISC);
	public static ItemBase beastBreakerSplashPoison = new ItemBase("beast_breaker_poison").setCreativeTab(CreativeTabs.COMBAT);
	public static ItemSword beastBreakerSword = new ItemSword(TheCreech.beastClawToolMaterial, "beast_breaker_sword");
	public static ItemArmor beastHelmet = new ItemArmor(TheCreech.beastPeltArmorMaterial, 0, EntityEquipmentSlot.HEAD, "beast_helmet");
	
	public static void register(IForgeRegistry<Item> registry) {
		registry.registerAll(
			beastClaw,
			beastPelt,
			beastBreakerSplashPoison,
			beastBreakerSword,
			beastHelmet
		);
	}

	public static void registerModels() {
		beastClaw.registerItemModel();
		beastPelt.registerItemModel();
		beastBreakerSplashPoison.registerItemModel();
		beastBreakerSword.registerItemModel();;
		beastHelmet.registerItemModel();
	}

}