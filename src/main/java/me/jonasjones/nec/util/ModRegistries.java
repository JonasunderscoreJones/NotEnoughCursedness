package me.jonasjones.nec.util;

import me.jonasjones.nec.block.ModBlocks;
import me.jonasjones.nec.item.ModItems;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.fabricmc.fabric.api.registry.FlammableBlockRegistry;
import net.fabricmc.fabric.api.registry.FuelRegistry;
import net.fabricmc.fabric.api.registry.StrippableBlockRegistry;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;

import static me.jonasjones.nec.NotEnoughCursedness.MOD_ID;

public class ModRegistries {
    public static CreativeModeTab ITEM_GROUP = FabricItemGroup.builder().title(Component.translatable("itemGroup.nec.not_enough_cursedness")).icon(() -> new ItemStack(ModBlocks.GREEN_BIRCH_LOG_ITEM)).build();


    public static void registerModStuffs() {
        registerFuels();
        registerCommands();
        registerEvents();
        registerStrippables();
        registerFlammableBlock();
        register_itemGroup();
    }

    private static void registerFuels() {
        FuelRegistry registry = FuelRegistry.INSTANCE;

        //registry.add(ModItems.LILAC_FLOWER_BULB, 200);
    }

    private static void registerCommands() {
        //CommandRegistrationCallback.EVENT.register(SetHomeCommand::register);
        //CommandRegistrationCallback.EVENT.register(ReturnHomeCommand::register);
    }

    private static void registerStrippables() {
        //StrippableBlockRegistry.register(ModBlocks.GREEEN_BIRCH_LOG_BLOCK, ModBlocks.STRIPPED_JACARANDA_LOG);
        StrippableBlockRegistry.register(ModBlocks.GREEEN_BIRCH_LOG_BLOCK, ModBlocks.GREEEN_BIRCH_LOG_BLOCK);
    }

    private static void registerFlammableBlock() {
        FlammableBlockRegistry instance = FlammableBlockRegistry.getDefaultInstance();

        instance.add(ModBlocks.GREEN_BIRCH_LOG, 5, 5);
    }

    private static void registerEvents() {
        //ServerPlayerEvents.COPY_FROM.register(new ModPlayerEventCopyFrom());
    }

    public static void register_item(Item CUSTOM_ITEM) {
        //ItemGroupEvents.modifyEntriesEvent(ITEM_GROUP).register(content -> {
        //    content.add(CUSTOM_ITEM);
        //});
    }

    public static void register_itemGroup() {

        ItemGroupEvents.modifyEntriesEvent(CreativeModeTabs.BUILDING_BLOCKS).register(content -> {
            content.accept(new ItemStack(ModBlocks.GREEN_BIRCH_LOG_ITEM));
            content.accept(new ItemStack(ModBlocks.BLAZE_BLOCK));
            content.accept(new ItemStack(ModBlocks.GUN_BLOCK));
            content.accept(new ItemStack(ModBlocks.DIAMOND_ORE_ORE));
            content.accept(new ItemStack(ModBlocks.DEEPSLATE_DIAMOND_ORE_ORE));
            content.accept(new ItemStack(ModBlocks.JAVA_BLOCK));
            content.accept(new ItemStack(ModBlocks.POCKET_BLOCK));
            content.accept(new ItemStack(ModBlocks.FLETCHING_STAIRS_BLOCK));
        });

        ItemGroupEvents.modifyEntriesEvent(CreativeModeTabs.INGREDIENTS).register(content -> {
            content.accept(new ItemStack(ModItems.STEEL_ITEM));
            content.accept(new ItemStack(ModItems.NEGATIVE_FLINT_ITEM));
            content.accept(new ItemStack(ModItems.LETTER_ITEM));
            content.accept(new ItemStack(ModItems.CHAINMAIL_ITEM));
        });

        ItemGroupEvents.modifyEntriesEvent(CreativeModeTabs.COMBAT).register(content -> {
            content.accept(new ItemStack(ModItems.DIRT_SWORD_ITEM));
            content.accept(new ItemStack(ModItems.AK47_ITEM));
            content.accept(new ItemStack(ModItems.HELMET_ON_A_STICK_ITEM));
        });

        ITEM_GROUP = Registry.register(BuiltInRegistries.CREATIVE_MODE_TAB, new ResourceLocation(MOD_ID, "nec"), ITEM_GROUP);
    }
}
