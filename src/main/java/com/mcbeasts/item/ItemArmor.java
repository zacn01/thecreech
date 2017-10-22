package com.mcbeasts.item;

import com.mcbeasts.thecreech.TheCreech;

import net.minecraft.inventory.EntityEquipmentSlot;

public class ItemArmor extends net.minecraft.item.ItemArmor {
	
	private String name;

	public ItemArmor(ArmorMaterial material, int renderIndex, EntityEquipmentSlot equipmentSlot, String name) {
		super(material, renderIndex, equipmentSlot);
		this.name = name;
		setRegistryName(name);
		setUnlocalizedName(name);
	}
	
	public void registerItemModel() {
		TheCreech.proxy.registerItemRenderer(this, 0, name);
	}

}
