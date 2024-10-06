package me.jonasjones.nec.block;

import me.jonasjones.nec.block.util.EvenThickerEndRodBlock;
import me.jonasjones.nec.block.util.ThickEndRodBlock;
import me.jonasjones.nec.block.util.ThickerEndRodBlock;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.*;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

import static me.jonasjones.nec.NotEnoughCursedness.MOD_ID;
import static net.minecraft.registry.Registries.BLOCK;
import static net.minecraft.registry.Registries.ITEM;

public class ModBlocks {
    public static Block GREEN_BIRCH_LOG;
    public static Block BLAZE_BLOCK;
    public static Block GUN_BLOCK;
    public static Block DIAMOND_ORE_ORE;
    public static Block DEEPSLATE_DIAMOND_ORE_ORE;
    public static Block JAVA_BLOCK;
    public static Block POCKET_BLOCK;
    public static Block FLETCHING_STAIRS_BLOCK;
    public static Block THICK_END_ROD;
    public static Block THICKER_END_ROD;
    public static Block EVEN_THICKER_END_ROD;
    public static BlockItem GUN_BLOCK_ITEM;
    public static Block GUN_BLOCK_BLOCK;
    public static BlockItem BLAZE_BLOCK_ITEM;
    public static Block BLAZE_BLOCK_BLOCK;
    public static BlockItem GREEN_BIRCH_LOG_ITEM;
    public static Block GREEEN_BIRCH_LOG_BLOCK;
    public static BlockItem DIAMOND_ORE_ORE_ITEM;
    public static Block DIAMOND_ORE_ORE_BLOCK;
    public static BlockItem DEEPSLATE_DIAMOND_ORE_ORE_ITEM;
    public static Block DEEPSLATE_DIAMOND_ORE_ORE_BLOCK;
    public static BlockItem JAVA_BLOCK_ITEM;
    public static Block JAVA_BLOCK_BLOCK;
    public static BlockItem POCKET_BLOCK_ITEM;
    public static Block POCKET_BLOCK_BLOCK;
    public static BlockItem FLETCHING_STAIRS_TIEM;
    public static Block FLETCHING_STAIRS_BLOCK_BLOCK;
    public static BlockItem THICK_END_ROD_ITEM;
    public static Block THICK_END_ROD_BLOCK;
    public static BlockItem THICKER_END_ROD_ITEM;
    public static Block THICKER_END_ROD_BLOCK;
    public static BlockItem EVEN_THICKER_END_ROD_ITEM;
    public static Block EVEN_THICKER_END_ROD_BLOCK;

    public static void register() {
        BLAZE_BLOCK = new Block(FabricBlockSettings.copyOf(Blocks.DIAMOND_BLOCK).strength(5.0F));
        BLAZE_BLOCK_BLOCK = Registry.register(BLOCK, Identifier.of(MOD_ID, "blaze_block"), BLAZE_BLOCK);
        BLAZE_BLOCK_ITEM = Registry.register(ITEM, Identifier.of(MOD_ID, "blaze_block"), new BlockItem(BLAZE_BLOCK, new Item.Settings()));

        GREEN_BIRCH_LOG = new PillarBlock(FabricBlockSettings.copyOf(Blocks.BIRCH_LOG).strength(4.0f));
        GREEEN_BIRCH_LOG_BLOCK = Registry.register(BLOCK, Identifier.of(MOD_ID, "green_birch_log"), GREEN_BIRCH_LOG);
        GREEN_BIRCH_LOG_ITEM = Registry.register(ITEM, Identifier.of(MOD_ID, "green_birch_log"), new BlockItem(GREEN_BIRCH_LOG, new Item.Settings()));

        GUN_BLOCK = new Block(FabricBlockSettings.copyOf(Blocks.DIAMOND_BLOCK).strength(5.0F));
        GUN_BLOCK_BLOCK = Registry.register(BLOCK, Identifier.of(MOD_ID, "gun_block"), GUN_BLOCK);
        GUN_BLOCK_ITEM = Registry.register(ITEM, Identifier.of(MOD_ID, "gun_block"), new BlockItem(GUN_BLOCK, new Item.Settings()));

        DIAMOND_ORE_ORE = new Block(FabricBlockSettings.copyOf(Blocks.DIAMOND_ORE).strength(5.0F));
        DIAMOND_ORE_ORE_BLOCK = Registry.register(BLOCK, Identifier.of(MOD_ID, "diamond_ore_ore"), DIAMOND_ORE_ORE);
        DIAMOND_ORE_ORE_ITEM = Registry.register(ITEM, Identifier.of(MOD_ID, "diamond_ore_ore"), new BlockItem(DIAMOND_ORE_ORE, new Item.Settings()));

        DEEPSLATE_DIAMOND_ORE_ORE = new Block(FabricBlockSettings.copyOf(Blocks.DEEPSLATE_DIAMOND_ORE).strength(5.0F));
        DEEPSLATE_DIAMOND_ORE_ORE_BLOCK = Registry.register(BLOCK, Identifier.of(MOD_ID, "deepslate_diamond_ore_ore"), DEEPSLATE_DIAMOND_ORE_ORE);
        DEEPSLATE_DIAMOND_ORE_ORE_ITEM = Registry.register(ITEM, Identifier.of(MOD_ID, "deepslate_diamond_ore_ore"), new BlockItem(DEEPSLATE_DIAMOND_ORE_ORE, new Item.Settings()));

         JAVA_BLOCK = new Block(FabricBlockSettings.copyOf(Blocks.DIAMOND_BLOCK).strength(5.0F));
        JAVA_BLOCK_BLOCK = Registry.register(BLOCK, Identifier.of(MOD_ID, "java_block"), JAVA_BLOCK);
        JAVA_BLOCK_ITEM = Registry.register(ITEM, Identifier.of(MOD_ID, "java_block"), new BlockItem(JAVA_BLOCK, new Item.Settings()));

        POCKET_BLOCK = new Block(FabricBlockSettings.copyOf(Blocks.DIAMOND_BLOCK).strength(5.0F));
        POCKET_BLOCK_BLOCK = Registry.register(BLOCK, Identifier.of(MOD_ID, "pocket_block"), POCKET_BLOCK);
        POCKET_BLOCK_ITEM = Registry.register(ITEM, Identifier.of(MOD_ID, "pocket_block"), new BlockItem(POCKET_BLOCK, new Item.Settings()));

        FLETCHING_STAIRS_BLOCK = new StairsBlock(GREEEN_BIRCH_LOG_BLOCK.getDefaultState(), FabricBlockSettings.copyOf(Blocks.OAK_STAIRS).strength(1.0F));
        FLETCHING_STAIRS_BLOCK_BLOCK = Registry.register(BLOCK, Identifier.of(MOD_ID, "fletching_stairs"), FLETCHING_STAIRS_BLOCK);
        FLETCHING_STAIRS_TIEM = Registry.register(ITEM, Identifier.of(MOD_ID, "fletching_stairs"), new BlockItem(FLETCHING_STAIRS_BLOCK, new Item.Settings()));

        THICK_END_ROD = new ThickEndRodBlock(FabricBlockSettings.copyOf(Blocks.END_ROD).strength(0.0F));
        THICK_END_ROD_BLOCK = Registry.register(BLOCK, Identifier.of(MOD_ID, "thick_end_rod"), THICK_END_ROD);
        THICK_END_ROD_ITEM = Registry.register(ITEM, Identifier.of(MOD_ID, "thick_end_rod"), new BlockItem(THICK_END_ROD, new Item.Settings()));

        THICKER_END_ROD = new ThickerEndRodBlock(FabricBlockSettings.copyOf(Blocks.END_ROD).strength(0.0F));
        THICKER_END_ROD_BLOCK = Registry.register(BLOCK, Identifier.of(MOD_ID, "thicker_end_rod"), THICKER_END_ROD);
        THICKER_END_ROD_ITEM = Registry.register(ITEM, Identifier.of(MOD_ID, "thicker_end_rod"), new BlockItem(THICKER_END_ROD, new Item.Settings()));

        EVEN_THICKER_END_ROD = new EvenThickerEndRodBlock(FabricBlockSettings.copyOf(Blocks.END_ROD).strength(0.0F));
        EVEN_THICKER_END_ROD_BLOCK = Registry.register(BLOCK, Identifier.of(MOD_ID, "even_thicker_end_rod"), EVEN_THICKER_END_ROD);
        EVEN_THICKER_END_ROD_ITEM = Registry.register(ITEM, Identifier.of(MOD_ID, "even_thicker_end_rod"), new BlockItem(EVEN_THICKER_END_ROD, new Item.Settings()));
    }
}
