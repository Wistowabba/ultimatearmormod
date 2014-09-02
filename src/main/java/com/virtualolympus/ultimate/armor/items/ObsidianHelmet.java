package com.virtualolympus.ultimate.armor.items;

import com.virtualolympus.ultimate.armor.ArmorRenderType;
import com.virtualolympus.ultimate.armor.ArmorSlot;
import com.virtualolympus.ultimate.armor.UltimateArmorMod;
import com.virtualolympus.ultimate.materials.ObsidianMaterial;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;

public class ObsidianHelmet extends ItemArmor {
	public static ObsidianHelmet instance = new ObsidianHelmet();
	
	private static final String ItemName = "obsidianHelmet";
	private static final String TextureName = UltimateArmorMod.MODID + ":" + ItemName;
	
	public ObsidianHelmet() {
		super(ObsidianMaterial.ArmorMaterial, ArmorRenderType.CHAIN.getType(), ArmorSlot.HELMET.getSlotNumber());
		
		setCreativeTab(CreativeTabs.tabCombat);
		setTextureName(TextureName);
		setUnlocalizedName(ItemName);
	}
	
	public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type) {
		return UltimateArmorMod.MODID + ":textures/models/armor/obsidian_layer_1.png";
	}
	
	public static void RegisterItem(){
		// item
		GameRegistry.registerItem(instance, ItemName);
		
		// recipe to craft
		GameRegistry.addShapedRecipe(new ItemStack(instance, 1), "OOO", "O O", 'O', Blocks.obsidian);
	}
}
