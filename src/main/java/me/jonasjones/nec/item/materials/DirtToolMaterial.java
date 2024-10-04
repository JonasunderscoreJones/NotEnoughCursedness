package me.jonasjones.nec.item.materials;


import net.minecraft.block.Block;
import net.minecraft.item.Items;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;
import net.minecraft.registry.tag.TagKey;

public class DirtToolMaterial implements ToolMaterial {

    public static final DirtToolMaterial INSTANCE = new DirtToolMaterial();

    @Override
    public int getDurability() {
        return 5;
    }

    @Override
    public float getMiningSpeedMultiplier() {
        return 1;
    }

    @Override
    public float getAttackDamage() {
        return 2;
    }

    @Override
    public TagKey<Block> getInverseTag() {
        return null;
    }

    @Override
    public int getEnchantability() {
        return 100;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return Ingredient.ofItems(Items.DIRT, Items.COARSE_DIRT, Items.DIRT_PATH, Items.ROOTED_DIRT);
    }
}