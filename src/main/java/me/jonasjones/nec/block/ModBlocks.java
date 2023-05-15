package me.jonasjones.nec.block;

import me.jonasjones.nec.util.ModRegistries;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.core.Registry;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.material.Material;

import static me.jonasjones.nec.NotEnoughCursedness.MOD_ID;
import static net.minecraft.core.registries.BuiltInRegistries.BLOCK;
import static net.minecraft.core.registries.BuiltInRegistries.ITEM;

public class ModBlocks {
    public static final Block GREEN_BIRCH_LOG = new RotatedPillarBlock(FabricBlockSettings.of(Material.WOOD).strength(4.0f));
    public static final Block BLAZE_BLOCK = new Block(FabricBlockSettings.of(Material.STONE).strength(4.0F));
    public static final Block GUN_BLOCK = new Block(FabricBlockSettings.of(Material.STONE).strength(4.0F));
    public static final Block DIAMOND_ORE_ORE = new Block(FabricBlockSettings.of(Material.STONE).strength(4.0F));
    public static final Block DEEPSLATE_DIAMOND_ORE_ORE = new Block(FabricBlockSettings.of(Material.STONE).strength(4.0F));
    public static final Block JAVA_BLOCK = new Block(FabricBlockSettings.of(Material.STONE).strength(5.0F));
    public static final Block POCKET_BLOCK = new Block(FabricBlockSettings.of(Material.STONE).strength(5.0F));
    public static Block FLETCHING_STAIRS_BLOCK = null;
    private static BlockItem GUN_BLOCK_ITEM;
    private static Block GUN_BLOCK_BLOCK;
    private static BlockItem BLAZE_BLOCK_ITEM;
    private static Block BLAZE_BLOCK_BLOCK;
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
    //public static final Block GREEN_BIRCH_WOOD = new PillarBlock(FabricBlockSettings.of(Material.WOOD).strength(4.0f));
    //public static final Block STRIPPED_GREEN_BIRCH_LOG = new PillarBlock(FabricBlockSettings.of(Material.WOOD).strength(4.0f));
    //public static final Block STRIPPED_GREEN_BIRCH_WOOD = new PillarBlock(FabricBlockSettings.of(Material.WOOD).strength(4.0f));

    public static void register() {
        BLAZE_BLOCK_BLOCK = Registry.register(BLOCK, new ResourceLocation(MOD_ID, "blaze_block"), BLAZE_BLOCK);
        BLAZE_BLOCK_ITEM = Registry.register(ITEM, new ResourceLocation(MOD_ID, "blaze_block"), new BlockItem(BLAZE_BLOCK, new FabricItemSettings()));
        ModRegistries.register_item(BLAZE_BLOCK_ITEM);

        GREEEN_BIRCH_LOG_BLOCK = Registry.register(BLOCK, new ResourceLocation(MOD_ID, "green_birch_log"), GREEN_BIRCH_LOG);
        GREEN_BIRCH_LOG_ITEM = Registry.register(ITEM, new ResourceLocation(MOD_ID, "green_birch_log"), new BlockItem(GREEN_BIRCH_LOG, new FabricItemSettings()));
        ModRegistries.register_item(GREEN_BIRCH_LOG_ITEM);

        GUN_BLOCK_BLOCK = Registry.register(BLOCK, new ResourceLocation(MOD_ID, "gun_block"), GUN_BLOCK);
        GUN_BLOCK_ITEM = Registry.register(ITEM, new ResourceLocation(MOD_ID, "gun_block"), new BlockItem(GUN_BLOCK, new FabricItemSettings()));
        ModRegistries.register_item(GUN_BLOCK_ITEM);

        DIAMOND_ORE_ORE_BLOCK = Registry.register(BLOCK, new ResourceLocation(MOD_ID, "diamond_ore_ore"), DIAMOND_ORE_ORE);
        DIAMOND_ORE_ORE_ITEM = Registry.register(ITEM, new ResourceLocation(MOD_ID, "diamond_ore_ore"), new BlockItem(DIAMOND_ORE_ORE, new FabricItemSettings()));
        ModRegistries.register_item(DIAMOND_ORE_ORE_ITEM);

        DEEPSLATE_DIAMOND_ORE_ORE_BLOCK = Registry.register(BLOCK, new ResourceLocation(MOD_ID, "deepslate_diamond_ore_ore"), DEEPSLATE_DIAMOND_ORE_ORE);
        DEEPSLATE_DIAMOND_ORE_ORE_ITEM = Registry.register(ITEM, new ResourceLocation(MOD_ID, "deepslate_diamond_ore_ore"), new BlockItem(DEEPSLATE_DIAMOND_ORE_ORE, new FabricItemSettings()));
        ModRegistries.register_item(DEEPSLATE_DIAMOND_ORE_ORE_ITEM);

        JAVA_BLOCK_BLOCK = Registry.register(BLOCK, new ResourceLocation(MOD_ID, "java_block"), JAVA_BLOCK);
        JAVA_BLOCK_ITEM = Registry.register(ITEM, new ResourceLocation(MOD_ID, "java_block"), new BlockItem(JAVA_BLOCK, new FabricItemSettings()));
        ModRegistries.register_item(JAVA_BLOCK_ITEM);

        POCKET_BLOCK_BLOCK = Registry.register(BLOCK, new ResourceLocation(MOD_ID, "pocket_block"), POCKET_BLOCK);
        POCKET_BLOCK_ITEM = Registry.register(ITEM, new ResourceLocation(MOD_ID, "pocket_block"), new BlockItem(POCKET_BLOCK, new FabricItemSettings()));
        ModRegistries.register_item(POCKET_BLOCK_ITEM);

        FLETCHING_STAIRS_BLOCK = new StairBlock(GREEEN_BIRCH_LOG_BLOCK.defaultBlockState(), FabricBlockSettings.of(Material.WOOD).strength(1.0F));
        FLETCHING_STAIRS_BLOCK_BLOCK = Registry.register(BLOCK, new ResourceLocation(MOD_ID, "fletching_stairs"), FLETCHING_STAIRS_BLOCK);
        FLETCHING_STAIRS_TIEM = Registry.register(ITEM, new ResourceLocation(MOD_ID, "fletching_stairs"), new BlockItem(FLETCHING_STAIRS_BLOCK, new FabricItemSettings()));
        ModRegistries.register_item(FLETCHING_STAIRS_TIEM);
    }
}
