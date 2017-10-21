package com.mcbeasts.item.tool;

import com.mcbeasts.thecreech.TheCreech;

import net.minecraft.item.Item;

public class ItemSword extends net.minecraft.item.ItemSword {
	
	private String name;

	public ItemSword(ToolMaterial material, String name) {
		super(material);
		setRegistryName(name);
		setUnlocalizedName(name);
		this.name = name;
	}
	
	public void registerItemModel() {
		TheCreech.proxy.registerItemRenderer(this, 0, name);
	}

}
