package com.virtualolympus.ultimate.armor;

public enum ArmorSlot {
	HELMET (0),
	CHESTPLATE (1),
	LEGGINGS (2),
	BOOTS (3);
	
	private final int slotNumber;
	ArmorSlot(int slot){
		this.slotNumber = slot;
	}
	
	public int getSlotNumber() {
		return this.slotNumber;
	}
}
