package me.jonasjones.nec;

import net.fabricmc.api.ClientModInitializer;
import net.minecraft.util.Identifier;

import static me.jonasjones.nec.NotEnoughCursedness.MOD_ID;

public class NotEnoughCursednessClient implements ClientModInitializer {
    public static final Identifier NEW_LOGO = Identifier.of(MOD_ID, "textures/gui/mojangstudios.png");
    @Override
    public void onInitializeClient() {
        // This code runs on the client side. In a real mod, you might do things like loading
        // mod settings, registering key bindings, or registering custom model loaders here.
    }
}
