package com.virtualolympus.ultimate.materials;

import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraftforge.common.util.EnumHelper;

public class ObsidianMaterial {
	private static final String materialName = "OBSIDIAN";
	
	// How many levels of enchantment can the material hold
	private static final int enchantability = 20;
	
	/*
	 * Vanilla configuration:
	 *    <durability>, <damage reduction (half armor icons)>, <enchantability>
	 * CLOTH(5, new int[]{1, 3, 2, 1}, 15),
	 * CHAIN(15, new int[]{2, 5, 4, 1}, 12),
	 * IRON(15, new int[]{2, 6, 5, 2}, 9),
	 * GOLD(7, new int[]{2, 5, 3, 1}, 25),
	 * DIAMOND(33, new int[]{3, 8, 6, 3}, 10);
	 */
	private static final int armorDurability = 25; // Diamond = 33
	private static final int[] armorReductionFactors = new int[] { 4, 7, 5, 4 };
	
	public static ArmorMaterial ArmorMaterial = EnumHelper.addArmorMaterial(materialName, armorDurability, armorReductionFactors, enchantability);
}
