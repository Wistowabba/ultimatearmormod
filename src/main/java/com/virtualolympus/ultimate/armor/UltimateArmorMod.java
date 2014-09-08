package com.virtualolympus.ultimate.armor;

import com.virtualolympus.ultimate.armor.items.ObsidianBoots;
import com.virtualolympus.ultimate.armor.items.ObsidianHelmet;
import com.virtualolympus.ultimate.armor.items.ObsidianPlate;

import net.minecraft.init.Blocks;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.event.*;
import cpw.mods.fml.common.registry.*;

@Mod(modid = UltimateArmorMod.MODID, version = UltimateArmorMod.VERSION, name = "UltimateArmorMod")
public class UltimateArmorMod
{
	@Instance(value = "UltimateArmorMod")
	public static UltimateArmorMod instance;
	
    public static final String MODID = "ultimatearmormod";
    public static final String VERSION = "0.0.1";
    
	@EventHandler
	public void init(FMLInitializationEvent event) {
		// Obsidian
		ObsidianHelmet.RegisterItem();
		
		// Add the plate registration here...
		ObsidianPlate.RegisterItem();
		
		ObsidianBoots.RegisterItem();
	}
	
}
