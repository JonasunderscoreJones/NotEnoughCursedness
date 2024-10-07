package me.jonasjones.nec.registry;

import me.jonasjones.nec.item.materials.DirtToolMaterial;
import net.minecraft.component.type.FoodComponent;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
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
    public static Item LAPIS_GOLDEN_APPLE_ITEM;

    public static void register() {
        DIRT_SWORD_ITEM = (SwordItem) registerItem(
                "dirt_sword",
                new SwordItem(DirtToolMaterial.INSTANCE, new Item.Settings())
        );

        STEEL_ITEM = registerItem(
                "steel",
                new Item(new Item.Settings())
        );

        NEGATIVE_FLINT_ITEM = registerItem(
                "negative_flint",
                new Item(new Item.Settings())
        );

        LETTER_ITEM = registerItem(
                "letter",
                new Item(new Item.Settings())
        );

        CHAINMAIL_ITEM = registerItem(
                "chainmail",
                new Item(new Item.Settings())
        );

        AK47_ITEM = registerItem(
                "ak_47",
                new Item(new Item.Settings())
        );

        HELMET_ON_A_STICK_ITEM = registerItem(
                "helmet_on_a_stick",
                new Item(new Item.Settings())
        );

        LAPIS_GOLDEN_APPLE_ITEM = registerItem(
                "lapis_golden_apple",
                new Item(new Item.Settings().food(new FoodComponent.Builder()
                        .saturationModifier(0.3f)
                        .statusEffect(new StatusEffectInstance(StatusEffects.REGENERATION, 200, 1), 1.0f)
                        .statusEffect(new StatusEffectInstance(StatusEffects.ABSORPTION, 2400), 1.0f)
                        .statusEffect(new StatusEffectInstance(StatusEffects.RESISTANCE, 6000), 1.0f)
                        .statusEffect(new StatusEffectInstance(StatusEffects.FIRE_RESISTANCE, 6000), 1.0f)
                        .statusEffect(new StatusEffectInstance(StatusEffects.ABSORPTION, 2400), 1.0f)
                        .statusEffect(new StatusEffectInstance(StatusEffects.SATURATION, 2400), 1.0f)
                        .alwaysEdible()
                        .build())
                )
        );
    }

    private static Item registerItem(String name, Item item) {
        return Registry.register(ITEM, Identifier.of(MOD_ID, name), item);
    }
}
