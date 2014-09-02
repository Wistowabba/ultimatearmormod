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

public class ObsidianPlate extends ItemArmor {
	public static ObsidianPlate instance = new ObsidianPlate();
	
	private static final String ItemName = "obsidianPlate";
	private static final String TextureName = UltimateArmorMod.MODID + ":" + ItemName;
	
	public ObsidianPlate(){
		super(ObsidianMaterial.ArmorMaterial, ArmorRenderType.CHAIN.getType(), ArmorSlot.CHESTPLATE.getSlotNumber());
		
		setCreativeTab(CreativeTabs.tabCombat);
		setTextureName(TextureName);
		setUnlocalizedName(ItemName);
	}
	
	// This routine returns the in-game rendered texture, NOT the picture of the item
	public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type) {
		return UltimateArmorMod.MODID + ":textures/models/armor/obsidian_layer_1.png";
	}
	
	public static void RegisterItem() {
		// register item
		GameRegistry.registerItem(instance, ItemName);
		// register recipe
		GameRegistry.addShapedRecipe(new ItemStack(instance, 1), "O O", "OOO", "OOO", 'O', Blocks.obsidian);
	}
}
