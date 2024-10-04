package me.jonasjones.nec.item;

import me.jonasjones.nec.item.materials.DirtToolMaterial;
import net.minecraft.item.Item;
import net.minecraft.item.SwordItem;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

import static me.jonasjones.nec.NotEnoughCursedness.MOD_ID;
import static net.minecraft.registry.Registries.ITEM;

public class ModItems {
    public static Item STEEL_ITEM;
    public static SwordItem DIRT_SWORD_ITEM;
    public static Item NEGATIVE_FLINT_ITEM;
    public static Item LETTER_ITEM;
    public static Item CHAINMAIL_ITEM;
    public static Item AK47_ITEM;
    public static Item HELMET_ON_A_STICK_ITEM;

    public static void register() {
        SwordItem DIRT_SWORD = new SwordItem(DirtToolMaterial.INSTANCE, new Item.Settings());
        DIRT_SWORD_ITEM = Registry.register(ITEM, Identifier.of(MOD_ID, "dirt_sword"), DIRT_SWORD);

        Item STEEL = new Item(new Item.Settings());
        STEEL_ITEM = Registry.register(ITEM, Identifier.of(MOD_ID, "steel"), STEEL);

        Item NEGATIVE_FLINT = new Item(new Item.Settings());
        NEGATIVE_FLINT_ITEM = Registry.register(ITEM, Identifier.of(MOD_ID, "negative_flint"), NEGATIVE_FLINT);

        Item LETTER = new Item(new Item.Settings());
        LETTER_ITEM = Registry.register(ITEM, Identifier.of(MOD_ID, "letter"), LETTER);

        Item CHAINMAIL = new Item(new Item.Settings());
        CHAINMAIL_ITEM = Registry.register(ITEM, Identifier.of(MOD_ID, "chainmail"), CHAINMAIL);

        Item AK47 = new Item(new Item.Settings());
        AK47_ITEM = Registry.register(ITEM, Identifier.of(MOD_ID, "ak_47"), AK47);

        Item HELMET_ON_A_STICK = new Item(new Item.Settings());
        HELMET_ON_A_STICK_ITEM = Registry.register(ITEM, Identifier.of(MOD_ID, "helmet_on_a_stick"), HELMET_ON_A_STICK);
    }
}
