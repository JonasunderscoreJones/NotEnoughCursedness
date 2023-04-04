package me.jonasjones.nec.block;

import me.jonasjones.nec.util.ModRegistries;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.block.PillarBlock;
import net.minecraft.item.BlockItem;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModBlocks {
    public static final Block GREEN_BIRCH_LOG = new PillarBlock(FabricBlockSettings.of(Material.WOOD).strength(4.0f));
    public static final Block BLAZE_BLOCK = new Block(FabricBlockSettings.of(Material.STONE).strength(4.0F));
    public static final Block GUN_BLOCK = new Block(FabricBlockSettings.of(Material.STONE).strength(4.0F));
    private static BlockItem GUN_BLOCK_ITEM;
    private static Block GUN_BLOCK_BLOCK;
    private static BlockItem BLAZE_BLOCK_ITEM;
    private static Block BLAZE_BLOCK_BLOCK;
    public static Block GREEEN_BIRCH_LOG_BLOCK;
    public static BlockItem GREEN_BIRCH_LOG_ITEM;
    //public static final Block GREEN_BIRCH_WOOD = new PillarBlock(FabricBlockSettings.of(Material.WOOD).strength(4.0f));
    //public static final Block STRIPPED_GREEN_BIRCH_LOG = new PillarBlock(FabricBlockSettings.of(Material.WOOD).strength(4.0f));
    //public static final Block STRIPPED_GREEN_BIRCH_WOOD = new PillarBlock(FabricBlockSettings.of(Material.WOOD).strength(4.0f));

    public static void register() {
        BLAZE_BLOCK_BLOCK = Registry.register(Registries.BLOCK, new Identifier("nec", "blaze_block"), BLAZE_BLOCK);
        BLAZE_BLOCK_ITEM = Registry.register(Registries.ITEM, new Identifier("nec", "blaze_block"), new BlockItem(BLAZE_BLOCK, new FabricItemSettings()));
        ModRegistries.register_item(BLAZE_BLOCK_ITEM);

        GREEEN_BIRCH_LOG_BLOCK = Registry.register(Registries.BLOCK, new Identifier("nec", "green_birch_log"), GREEN_BIRCH_LOG);
        GREEN_BIRCH_LOG_ITEM = Registry.register(Registries.ITEM, new Identifier("nec", "green_birch_log"), new BlockItem(GREEN_BIRCH_LOG, new FabricItemSettings()));
        ModRegistries.register_item(GREEN_BIRCH_LOG_ITEM);

        GUN_BLOCK_BLOCK = Registry.register(Registries.BLOCK, new Identifier("nec", "gun_block"), GUN_BLOCK);
        GUN_BLOCK_ITEM = Registry.register(Registries.ITEM, new Identifier("nec", "gun_block"), new BlockItem(GUN_BLOCK, new FabricItemSettings()));
        ModRegistries.register_item(GUN_BLOCK_ITEM);
    }
}
