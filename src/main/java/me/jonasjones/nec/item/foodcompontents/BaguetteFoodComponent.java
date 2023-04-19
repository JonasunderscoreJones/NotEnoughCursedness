package me.jonasjones.nec.item.foodcompontents;

import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemNameBlockItem;
import net.minecraft.world.level.block.Block;

public class BaguetteFoodComponent extends Item {
    private final FoodProperties foodComponent = new FoodProperties.Builder().saturationMod(1.0F).nutrition(3).build();

    public BaguetteFoodComponent(Properties properties) {
        super(properties);
    }
}
