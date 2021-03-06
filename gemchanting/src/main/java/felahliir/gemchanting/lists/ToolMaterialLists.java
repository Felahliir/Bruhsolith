package felahliir.gemchanting.lists;

import net.minecraft.item.IItemTier;
import net.minecraft.item.Item;
import net.minecraft.item.crafting.Ingredient;

public enum ToolMaterialLists implements IItemTier { 
	
	
	lead (6.0f, 6.0f, 400, 2, 0, Itemlists.lead_ingot),
	copper (6.0f, 15.0f, 200, 2, 15, Itemlists.copper_ingot),
	silver (7.0f, 10.0f, 800, 3, 25, Itemlists.silver_nugget);

	
	
	
	
	 private float attackDamage, efficiency;
	 private int durability, harvestLevel, enchantability;
	 private Item repairMaterial;
	
	
	
	
	
	private ToolMaterialLists(float attackDamage, float efficiency, int durability, int harvestLevel,int enchantability, Item repairMaterial) 
	
	{
	this.attackDamage = attackDamage;
	this.efficiency = efficiency;
	this.durability = durability;
	this.harvestLevel = harvestLevel;
	this.enchantability = enchantability;
	this.repairMaterial = repairMaterial;
		
	}





	@Override
	public int getMaxUses() {
		
		return this.durability;
	}





	@Override
	public float getEfficiency() {
		return this.efficiency;
	}





	@Override
	public float getAttackDamage() {
		
		return this.attackDamage;
	}





	@Override
	public int getHarvestLevel() {
		return this.harvestLevel;
	}





	@Override
	public int getEnchantability() {
		return this.enchantability;	
	}





	@Override
	public Ingredient getRepairMaterial() {
		return Ingredient.fromItems(this.repairMaterial);
	}
	
	
}
