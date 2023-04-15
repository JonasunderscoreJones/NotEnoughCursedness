package me.jonasjones.nec.item.materials;


import net.minecraft.world.item.Items;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.crafting.Ingredient;

public class DirtToolMaterial implements Tier {

    public static final DirtToolMaterial INSTANCE = new DirtToolMaterial();

    @Override
    public int getUses() {
        return 5;
    }

    @Override
    public float getSpeed() {
        return 1;
    }

    @Override
    public float getAttackDamageBonus() {
        return 2;
    }

    @Override
    public int getLevel() {
        return 0;
    }

    @Override
    public int getEnchantmentValue() {
        return 100;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return Ingredient.of(Items.DIRT, Items.COARSE_DIRT, Items.DIRT_PATH, Items.ROOTED_DIRT);
    }
}