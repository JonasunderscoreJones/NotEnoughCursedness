package me.jonasjones.nec.util;

import me.jonasjones.nec.block.ModBlocks;
import me.jonasjones.nec.item.ModItems;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.fabricmc.fabric.api.registry.FlammableBlockRegistry;
import net.fabricmc.fabric.api.registry.FuelRegistry;
import net.fabricmc.fabric.api.registry.StrippableBlockRegistry;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

import static me.jonasjones.nec.NotEnoughCursedness.MOD_ID;

public class ModRegistries {
    public static ItemGroup NEC_GROUP = null;

    public static void registerModStuffs() {
        registerStrippables();
        registerFlammableBlock();
        register_itemGroup();
        fuelRegistry();
    }

    private static void registerStrippables() {
        StrippableBlockRegistry.register(ModBlocks.GREEEN_BIRCH_LOG_BLOCK, ModBlocks.GREEEN_BIRCH_LOG_BLOCK);
    }

    private static void registerFlammableBlock() {
        FlammableBlockRegistry instance = FlammableBlockRegistry.getDefaultInstance();

        instance.add(ModBlocks.GREEN_BIRCH_LOG, 5, 5);
    }

    private static void fuelRegistry() {
        FuelRegistry.INSTANCE.add(ModBlocks.GREEN_BIRCH_LOG, 300);
        FuelRegistry.INSTANCE.add(ModBlocks.FLETCHING_STAIRS_BLOCK, 300);
        FuelRegistry.INSTANCE.add(ModBlocks.BLAZE_BLOCK, 1200);
        FuelRegistry.INSTANCE.add(Items.CAMPFIRE, Integer.MAX_VALUE); // very broken thus cursed enough
    }

    public static void register_itemGroup() {
        NEC_GROUP = FabricItemGroup.builder()
                .icon(() -> new ItemStack(ModItems.DIRT_SWORD_ITEM))
                .displayName(Text.translatable("itemGroup.nec.not_enough_cursedness"))
                .entries(((displayContext, entries) -> {
                    entries.add(new ItemStack(ModBlocks.GREEN_BIRCH_LOG_ITEM));
                    entries.add(new ItemStack(ModBlocks.BLAZE_BLOCK));
                    entries.add(new ItemStack(ModBlocks.GUN_BLOCK));
                    entries.add(new ItemStack(ModBlocks.DIAMOND_ORE_ORE));
                    entries.add(new ItemStack(ModBlocks.DEEPSLATE_DIAMOND_ORE_ORE));
                    entries.add(new ItemStack(ModBlocks.JAVA_BLOCK));
                    entries.add(new ItemStack(ModBlocks.POCKET_BLOCK));
                    entries.add(new ItemStack(ModBlocks.FLETCHING_STAIRS_BLOCK));
                    entries.add(new ItemStack(ModBlocks.THICK_END_ROD));
                    entries.add(new ItemStack(ModBlocks.THICKER_END_ROD));
                    entries.add(new ItemStack(ModBlocks.EVEN_THICKER_END_ROD));

                    entries.add(new ItemStack(ModItems.STEEL_ITEM));
                    entries.add(new ItemStack(ModItems.NEGATIVE_FLINT_ITEM));
                    entries.add(new ItemStack(ModItems.LETTER_ITEM));
                    entries.add(new ItemStack(ModItems.CHAINMAIL_ITEM));

                    entries.add(new ItemStack(ModItems.DIRT_SWORD_ITEM));
                    entries.add(new ItemStack(ModItems.AK47_ITEM));
                    entries.add(new ItemStack(ModItems.HELMET_ON_A_STICK_ITEM));
                    entries.add(new ItemStack(ModItems.LAPIS_GOLDEN_APPLE_ITEM));
                }))
                .build();

        Registry.register(Registries.ITEM_GROUP, Identifier.of(MOD_ID, "nec"), NEC_GROUP);
    }
}
