package com.virtualolympus.ultimate.armor;

public enum ArmorRenderType {
	CLOTH(0),
	CHAIN(1),
	IRON(2),
	DIAMOND(3),
	GOLD(4);
	
	private final int renderType;
	ArmorRenderType(int type){
		this.renderType = type;
	}
	
	public int getType(){
		return this.renderType;
	}
}
