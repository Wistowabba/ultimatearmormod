package com.virtualolympus.ultimate.armor.items;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;

import com.virtualolympus.ultimate.armor.ArmorRenderType;
import com.virtualolympus.ultimate.armor.ArmorSlot;
import com.virtualolympus.ultimate.armor.UltimateArmorMod;
import com.virtualolympus.ultimate.materials.ObsidianMaterial;

import cpw.mods.fml.common.registry.GameRegistry;

public class ObsidianBoots extends ItemArmor {
	public static ObsidianBoots instance = new ObsidianBoots();
	
	private static final String ItemName = "obsidianBoots";
	private static final String TextureName = UltimateArmorMod.MODID + ":" + ItemName;
	
	
	public ObsidianBoots(){
		super(ObsidianMaterial.ArmorMaterial, ArmorRenderType.CHAIN.getType(), ArmorSlot.BOOTS.getSlotNumber());
	
		setCreativeTab(CreativeTabs.tabCombat);
		setTextureName(TextureName);
		setUnlocalizedName(ItemName);
	}	
		
	public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type) {
		return UltimateArmorMod.MODID + ":textures/models/armor/obsidian_layer_1.png";
	}	
	
	public static void RegisterItem() {
	
		GameRegistry.registerItem(instance, ItemName);
	
		GameRegistry.addShapedRecipe(new ItemStack(instance, 1), "O O", "O O", 'O', Blocks.obsidian);	
	}
}
