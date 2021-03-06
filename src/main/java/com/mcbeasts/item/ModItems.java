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
	public static ItemBase creechHead = new ItemBase("creech_head").setCreativeTab(CreativeTabs.MISC);

	// Weapons
	public static ItemBase beastBreakerSplashPoison = new ItemBase("beast_breaker_poison").setCreativeTab(CreativeTabs.COMBAT);
	public static ItemSword beastSlayerSword = new ItemSword(TheCreech.beastClawToolMaterial, "beast_slayer_sword");

	// Beast Pelt Armor
	public static ItemArmor beastHelmet = new ItemArmor(TheCreech.beastPeltArmorMaterial, 0, EntityEquipmentSlot.HEAD, "beast_helmet");
	public static ItemArmor beastChestplate = new ItemArmor(TheCreech.beastPeltArmorMaterial, 0, EntityEquipmentSlot.CHEST, "beast_chestplate");
	public static ItemArmor beastPants = new ItemArmor(TheCreech.beastPeltArmorMaterial, 0, EntityEquipmentSlot.LEGS, "beast_pants");
	public static ItemArmor beastBoots = new ItemArmor(TheCreech.beastPeltArmorMaterial, 0, EntityEquipmentSlot.FEET, "beast_boots");

	public static void register(IForgeRegistry<Item> registry) {
		registry.registerAll(
			beastClaw,
			beastPelt,
			creechHead,
			beastBreakerSplashPoison,
			beastSlayerSword,
			beastHelmet,
			beastChestplate,
			beastPants,
			beastBoots
		);
	}

	public static void registerModels() {
		beastClaw.registerItemModel();
		beastPelt.registerItemModel();
		creechHead.registerItemModel();
		beastBreakerSplashPoison.registerItemModel();
		beastSlayerSword.registerItemModel();;
		beastHelmet.registerItemModel();
		beastChestplate.registerItemModel();
		beastPants.registerItemModel();
		beastBoots.registerItemModel();
	}

}
