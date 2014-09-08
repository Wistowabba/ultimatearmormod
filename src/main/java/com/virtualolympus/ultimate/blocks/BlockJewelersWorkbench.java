package com.virtualolympus.ultimate.blocks;

import com.virtualolympus.ultimate.materials.MaterialJewelersWorkbench;
import com.virtualolympus.ultimate.tiles.TileEntityJewelersWorkbench;

import net.minecraft.block.BlockContainer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

public class BlockJewelersWorkbench extends BlockContainer {

	public BlockJewelersWorkbench(){
		super(MaterialJewelersWorkbench.instance);
	}
	
	@Override
	public TileEntity createNewTileEntity(World world, int blockMetadata) {
		return new TileEntityJewelersWorkbench(world, this, blockMetadata);
	}

}
