package me.jonasjones.nec.datagen;

import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricAdvancementProvider;
import net.minecraft.advancement.*;

import java.util.concurrent.CompletableFuture;
import java.util.function.Consumer;

import net.minecraft.advancement.criterion.InventoryChangedCriterion;
import net.minecraft.advancement.criterion.TickCriterion;
import net.minecraft.item.Items;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

import static me.jonasjones.nec.NotEnoughCursedness.MOD_ID;
import static me.jonasjones.nec.block.ModBlocks.*;
import static me.jonasjones.nec.item.ModItems.*;

public class NecDataGen implements DataGeneratorEntrypoint {
    @Override
    public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
        FabricDataGenerator.Pack pack = fabricDataGenerator.createPack();

        pack.addProvider(AdvancementsProvider::new);
    }

    static class AdvancementsProvider extends FabricAdvancementProvider {
        protected AdvancementsProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registryLookup) {
            super(output, registryLookup);
        }

        @Override
        public void generateAdvancement(RegistryWrapper.WrapperLookup registryLookup, Consumer<AdvancementEntry> consumer) {
            AdvancementEntry rootAdvancement = Advancement.Builder.create()
                    .display(
                            DIRT_SWORD_ITEM, // The display icon
                            Text.translatable("advancements.nec.root.title"), // The title
                            Text.translatable("advancements.nec.root.description"), // The description//new Identifier("textures/gui/advancements/backgrounds/adventure.png","textures/gui/advancements/backgrounds/adventure.png"), // Background image used
                            Identifier.of(MOD_ID, "textures/gui/advancements/backgrounds/nec.png"), // Background image used
                            AdvancementFrame.TASK, // Options: TASK, CHALLENGE, GOAL
                            false, // Show toast top right
                            false, // Announce to chat
                            false // Hidden in the advancement tab
                    )
                    // The first string used in criterion is the name referenced by other advancements when they want to have 'requirements'
                    .criterion("nec_root", TickCriterion.Conditions.createTick())
                    .build(consumer, "nec" + "/root");

            AdvancementEntry gotDirtSwordAdvancement = Advancement.Builder.create().parent(rootAdvancement)
                    .display(
                            DIRT_SWORD_ITEM,
                            Text.translatable("advancements.nec.dirt_sword.title"),
                            Text.translatable("advancements.nec.dirt_sword.description"),
                            null, // children to parent advancements don't need a background set
                            AdvancementFrame.TASK,
                            true,
                            true,
                            true
                    )
                    .rewards(AdvancementRewards.Builder.experience(1000))
                    .criterion("got_dirt_sword", InventoryChangedCriterion.Conditions.items(DIRT_SWORD_ITEM))
                    .build(consumer, "nec" + "/got_dirt_sword");

            AdvancementEntry gotAK47Advancement = Advancement.Builder.create().parent(rootAdvancement)
                    .display(
                            AK47_ITEM,
                            Text.translatable("advancements.nec.ak_47.title"),
                            Text.translatable("advancements.nec.ak_47.description"),
                            null, // children to parent advancements don't need a background set
                            AdvancementFrame.TASK,
                            true,
                            true,
                            true
                    )
                    .criterion("got_ak47", InventoryChangedCriterion.Conditions.items(AK47_ITEM))
                    .build(consumer, "nec" + "/got_ak47");

            AdvancementEntry gotPocketBlockAdvancement = Advancement.Builder.create().parent(rootAdvancement)
                    .display(
                            POCKET_BLOCK_ITEM,
                            Text.translatable("advancements.nec.pocket_block.title"),
                            Text.translatable("advancements.nec.pocket_block.description"),
                            null, // children to parent advancements don't need a background set
                            AdvancementFrame.TASK,
                            true,
                            true,
                            true
                    )
                    .criterion("got_pocket_block", InventoryChangedCriterion.Conditions.items(POCKET_BLOCK_ITEM))
                    .build(consumer, "nec" + "/got_pocket_block");

            AdvancementEntry gotJavaBlockAdvancement = Advancement.Builder.create().parent(gotPocketBlockAdvancement)
                    .display(
                            JAVA_BLOCK,
                            Text.translatable("advancements.nec.java_block.title"),
                            Text.translatable("advancements.nec.java_block.description"),
                            null, // children to parent advancements don't need a background set
                            AdvancementFrame.TASK,
                            true,
                            true,
                            true
                    )
                    .criterion("got_java_block", InventoryChangedCriterion.Conditions.items(JAVA_BLOCK))
                    .build(consumer, "nec" + "/got_java_block");

            AdvancementEntry gotBedrockAdvancement = Advancement.Builder.create().parent(gotJavaBlockAdvancement)
                    .display(
                            Items.BEDROCK,
                            Text.translatable("advancements.story.bedrock.title"),
                            Text.translatable("advancements.story.bedrock.description"),
                            null,
                            AdvancementFrame.CHALLENGE,
                            true,
                            true,
                            false
                    )
                    .criterion("got_bedrock", InventoryChangedCriterion.Conditions.items(Items.BEDROCK))
                    .build(consumer, "nec" + "/got_bedrock");

            AdvancementEntry gotFletchingStairsAdvancement = Advancement.Builder.create().parent(rootAdvancement)
                    .display(
                            FLETCHING_STAIRS_TIEM,
                            Text.translatable("advancements.nec.fletching_stairs.title"),
                            Text.translatable("advancements.nec.fletching_stairs.description"),
                            null, // children to parent advancements don't need a background set
                            AdvancementFrame.TASK,
                            true,
                            true,
                            true
                    )
                    .criterion("got_fletching_stairs", InventoryChangedCriterion.Conditions.items(FLETCHING_STAIRS_TIEM))
                    .build(consumer, "nec" + "/got_fletching_stairs");

            AdvancementEntry gotThickEndRodAdvancement = Advancement.Builder.create().parent(rootAdvancement)
                    .display(
                            THICK_END_ROD_ITEM,
                            Text.translatable("advancements.nec.thick_end_rod.title"),
                            Text.translatable("advancements.nec.thick_end_rod.description"),
                            null, // children to parent advancements don't need a background set
                            AdvancementFrame.TASK,
                            true,
                            true,
                            true
                    )
                    .criterion("got_thick_end_rod", InventoryChangedCriterion.Conditions.items(THICK_END_ROD_ITEM))
                    .build(consumer, "nec" + "/got_thick_end_rod");

            AdvancementEntry gotThickerEndRodAdvancement = Advancement.Builder.create().parent(gotThickEndRodAdvancement)
                    .display(
                            THICKER_END_ROD_ITEM,
                            Text.translatable("advancements.nec.thicker_end_rod.title"),
                            Text.translatable("advancements.nec.thicker_end_rod.description"),
                            null, // children to parent advancements don't need a background set
                            AdvancementFrame.TASK,
                            true,
                            true,
                            true
                    )
                    .criterion("got_thicker_end_rod", InventoryChangedCriterion.Conditions.items(THICKER_END_ROD_ITEM))
                    .build(consumer, "nec" + "/got_thicker_end_rod");

            AdvancementEntry gotEvenThickerEndRodAdvancement = Advancement.Builder.create().parent(gotThickerEndRodAdvancement)
                    .display(
                            EVEN_THICKER_END_ROD_ITEM,
                            Text.translatable("advancements.nec.even_thicker_end_rod.title"),
                            Text.translatable("advancements.nec.even_thicker_end_rod.description"),
                            null, // children to parent advancements don't need a background set
                            AdvancementFrame.TASK,
                            true,
                            true,
                            true
                    )
                    .criterion("got_even_thicker_end_rod", InventoryChangedCriterion.Conditions.items(EVEN_THICKER_END_ROD_ITEM))
                    .build(consumer, "nec" + "/got_even_thicker_end_rod");

            AdvancementEntry gotLapisGoldenAppleAdvancement = Advancement.Builder.create().parent(rootAdvancement)
                    .display(
                            LAPIS_GOLDEN_APPLE_ITEM,
                            Text.translatable("advancements.nec.lapis_golden_apple.title"),
                            Text.translatable("advancements.nec.lapis_golden_apple.description"),
                            null, // children to parent advancements don't need a background set
                            AdvancementFrame.TASK,
                            true,
                            true,
                            true
                    )
                    .criterion("got_lapis_golden_apple", InventoryChangedCriterion.Conditions.items(LAPIS_GOLDEN_APPLE_ITEM))
                    .build(consumer, "nec" + "/got_lapis_golden_apple");
        }
    }
}