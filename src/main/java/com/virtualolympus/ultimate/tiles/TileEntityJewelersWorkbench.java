package com.virtualolympus.ultimate.tiles;

import net.minecraft.block.Block;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

public class TileEntityJewelersWorkbench extends TileEntity {
	public TileEntityJewelersWorkbench(World world, Block owningBlock, int blockMetadata){
		super.worldObj = world;
		super.blockType = owningBlock;
		super.blockMetadata = blockMetadata;
	}
}
