package me.jonasjones.nec.item;

import me.jonasjones.nec.item.materials.DirtToolMaterial;
import me.jonasjones.nec.util.ModRegistries;
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
        //ModRegistries.register_item(DIRT_SWORD_ITEM);

        Item STEEL = new Item(new Item.Settings());
        STEEL_ITEM = Registry.register(ITEM, Identifier.of(MOD_ID, "steel"), STEEL);
        //ModRegistries.register_item(STEEL_ITEM);

        Item NEGATIVE_FLINT = new Item(new Item.Settings());
        NEGATIVE_FLINT_ITEM = Registry.register(ITEM, Identifier.of(MOD_ID, "negative_flint"), NEGATIVE_FLINT);
        //ModRegistries.register_item(NEGATIVE_FLINT_ITEM);

        Item LETTER = new Item(new Item.Settings());
        LETTER_ITEM = Registry.register(ITEM, Identifier.of(MOD_ID, "letter"), LETTER);
        //ModRegistries.register_item(LETTER_ITEM);

        Item CHAINMAIL = new Item(new Item.Settings());
        CHAINMAIL_ITEM = Registry.register(ITEM, Identifier.of(MOD_ID, "chainmail"), CHAINMAIL);
        //ModRegistries.register_item(CHAINMAIL_ITEM);

        Item AK47 = new Item(new Item.Settings());
        AK47_ITEM = Registry.register(ITEM, Identifier.of(MOD_ID, "ak_47"), AK47);
        //ModRegistries.register_item(AK47_ITEM);

        Item HELMET_ON_A_STICK = new Item(new Item.Settings());
        HELMET_ON_A_STICK_ITEM = Registry.register(ITEM, Identifier.of(MOD_ID, "helmet_on_a_stick"), HELMET_ON_A_STICK);
        //ModRegistries.register_item(HELMET_ON_A_STICK_ITEM);
    }
}
