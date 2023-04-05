package me.jonasjones.nec.item;

import me.jonasjones.nec.item.items.MaskItem;
import me.jonasjones.nec.item.materials.DirtToolMaterial;
import me.jonasjones.nec.item.materials.MaskArmorMaterial;
import me.jonasjones.nec.util.ModRegistries;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    private static Item STEEL_ITEM;
    private static ToolItem DIRT_SWORD_ITEM;
    private static Item NEGATIVE_FLINT_ITEM;
    private static Item LETTER_ITEM;
    private static Item CHAINMAIL_ITEM;
    private static Item AK47_ITEM;
    private static Item MASK_ITEM;

    public static void register() {
        ToolItem DIRT_SWORD = new SwordItem(DirtToolMaterial.INSTANCE, 1, -3.0F, new Item.Settings());
        DIRT_SWORD_ITEM = Registry.register(Registries.ITEM, new Identifier("nec", "dirt_sword"), DIRT_SWORD);
        ModRegistries.register_item(DIRT_SWORD_ITEM);

        Item STEEL = new Item(new FabricItemSettings());
        STEEL_ITEM = Registry.register(Registries.ITEM, new Identifier("nec", "steel"), STEEL);
        ModRegistries.register_item(STEEL_ITEM);

        Item NEGATIVE_FLINT = new Item(new FabricItemSettings());
        NEGATIVE_FLINT_ITEM = Registry.register(Registries.ITEM, new Identifier("nec", "negative_flint"), NEGATIVE_FLINT);
        ModRegistries.register_item(NEGATIVE_FLINT_ITEM);

        Item LETTER = new Item(new FabricItemSettings());
        LETTER_ITEM = Registry.register(Registries.ITEM, new Identifier("nec", "letter"), LETTER);
        ModRegistries.register_item(LETTER_ITEM);

        Item CHAINMAIL = new Item(new FabricItemSettings());
        CHAINMAIL_ITEM = Registry.register(Registries.ITEM, new Identifier("nec", "chainmail"), CHAINMAIL);
        ModRegistries.register_item(CHAINMAIL_ITEM);

        Item AK47 = new Item(new FabricItemSettings());
        AK47_ITEM = Registry.register(Registries.ITEM, new Identifier("nec", "ak_47"), AK47);
        ModRegistries.register_item(AK47_ITEM);

        ArmorMaterial MaskArmorMaterial = new MaskArmorMaterial();
        MaskItem MASK = new MaskItem(MaskArmorMaterial, MaskItem.Type.HELMET, new Item.Settings());
        MASK_ITEM = Registry.register(Registries.ITEM, new Identifier("nec", "mask"), MASK);
        ModRegistries.register_item(MASK_ITEM);
    }
}
