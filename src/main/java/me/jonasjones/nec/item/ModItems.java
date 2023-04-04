package me.jonasjones.nec.item;

import me.jonasjones.nec.item.materials.DirtToolMaterial;
import me.jonasjones.nec.util.ModRegistries;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    private static ToolItem DIRT_SWORD_ITEM;

    public static void register() {
        ToolItem DIRT_SWORD = new SwordItem(DirtToolMaterial.INSTANCE, 1, -3.0F, new Item.Settings());
        DIRT_SWORD_ITEM = Registry.register(Registries.ITEM, new Identifier("nec", "dirt_sword"), DIRT_SWORD);
        ModRegistries.register_item(DIRT_SWORD_ITEM);
    }
}
