package me.jonasjones.nec.registry;

import me.jonasjones.nec.block.EvenThickerEndRodBlock;
import me.jonasjones.nec.block.RodBlock;
import me.jonasjones.nec.block.ThickEndRodBlock;
import me.jonasjones.nec.block.ThickerEndRodBlock;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.*;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

import java.util.HashMap;

import static me.jonasjones.nec.NotEnoughCursedness.MOD_ID;
import static net.minecraft.registry.Registries.BLOCK;
import static net.minecraft.registry.Registries.ITEM;

public class ModBlocks {

    public static BlockWithItem GREEN_BIRCH_LOG;
    public static BlockWithItem BLAZE_BLOCK;
    public static BlockWithItem GUN_BLOCK;
    public static BlockWithItem DIAMOND_ORE_ORE;
    public static BlockWithItem DEEPSLATE_DIAMOND_ORE_ORE;
    public static BlockWithItem JAVA_BLOCK;
    public static BlockWithItem POCKET_BLOCK;
    public static BlockWithItem FLETCHING_STAIRS_BLOCK;
    public static BlockWithItem THICK_END_ROD;
    public static BlockWithItem THICKER_END_ROD;
    public static BlockWithItem EVEN_THICKER_END_ROD;
    public static BlockWithItem END_ROD_BLOCK;

    public static class BlockWithItem {
        public final Block block;
        public final BlockItem blockItem;

        public BlockWithItem(Block block, BlockItem blockItem) {
            this.block = block;
            this.blockItem = blockItem;
        }
    }

    public static void register() {
        BLAZE_BLOCK = registerBlock(
                "blaze_block",
                new Block(FabricBlockSettings.copyOf(Blocks.DIAMOND_BLOCK).strength(5.0F))
        );

        GREEN_BIRCH_LOG = registerBlock(
                "green_birch_log",
                new PillarBlock(FabricBlockSettings.copyOf(Blocks.BIRCH_LOG).strength(4.0f))
        );

        GUN_BLOCK = registerBlock(
                "gun_block",
                new Block(FabricBlockSettings.copyOf(Blocks.DIAMOND_BLOCK).strength(5.0F))
        );

        DIAMOND_ORE_ORE = registerBlock(
                "diamond_ore_ore",
                new Block(FabricBlockSettings.copyOf(Blocks.DIAMOND_ORE).strength(5.0F))
        );

        DEEPSLATE_DIAMOND_ORE_ORE = registerBlock(
                "deepslate_diamond_ore_ore",
                new Block(FabricBlockSettings.copyOf(Blocks.DEEPSLATE_DIAMOND_ORE).strength(5.0F))
        );

        JAVA_BLOCK = registerBlock(
                "java_block",
                new Block(FabricBlockSettings.copyOf(Blocks.DIAMOND_BLOCK).strength(5.0F))
        );

        POCKET_BLOCK = registerBlock(
                "pocket_block",
                new Block(FabricBlockSettings.copyOf(Blocks.DIAMOND_BLOCK).strength(5.0F))
        );

        FLETCHING_STAIRS_BLOCK = registerBlock(
                "fletching_stairs",
                new StairsBlock(GREEN_BIRCH_LOG.block.getDefaultState(), FabricBlockSettings.copyOf(Blocks.OAK_STAIRS).strength(1.0F))
        );

        THICK_END_ROD = registerBlock(
                "thick_end_rod",
                new ThickEndRodBlock(FabricBlockSettings.copyOf(Blocks.END_ROD).strength(0.0F))
        );

        THICKER_END_ROD = registerBlock(
                "thicker_end_rod",
                new ThickerEndRodBlock(FabricBlockSettings.copyOf(Blocks.END_ROD).strength(0.0F))
        );

        EVEN_THICKER_END_ROD = registerBlock(
                "even_thicker_end_rod",
                new EvenThickerEndRodBlock(FabricBlockSettings.copyOf(Blocks.END_ROD).strength(0.0F))
        );

        END_ROD_BLOCK = registerBlock(
                "end_rod_block",
                new RodBlock(FabricBlockSettings.copyOf(Blocks.BONE_BLOCK).strength(1.0F))
        );
    }

    public static BlockWithItem registerBlock(String name, Block block) {
        Identifier id = Identifier.of(MOD_ID, name);

        Block registeredBlock = Registry.register(BLOCK, id, block);
        BlockItem registeredItem = Registry.register(ITEM, id, new BlockItem(block, new Item.Settings()));

        return new BlockWithItem(registeredBlock, registeredItem); // Return both the block and block item
    }
}
