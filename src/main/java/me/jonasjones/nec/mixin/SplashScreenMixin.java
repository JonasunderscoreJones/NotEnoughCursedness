package me.jonasjones.nec.mixin;

import com.sun.jna.platform.RasterRangesUtils;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.screens.LoadingOverlay;
import net.minecraft.resources.ResourceLocation;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

import java.awt.*;

import static me.jonasjones.nec.NotEnoughCursedness.MOD_ID;

@Mixin(LoadingOverlay.class)
public class SplashScreenMixin {

	@Inject(method = "<clinit>", at = @At("TAIL"), cancellable = true)
	private static void init(CallbackInfo ci) { // Load our custom textures at game start //
		static final ResourceLocation MOJANG_STUDIOS_LOGO_LOCATION = new ResourceLocation(MOD_ID, "textures/gui/title/mojangstudios.png");
	}
}
