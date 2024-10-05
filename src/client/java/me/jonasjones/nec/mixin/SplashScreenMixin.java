package me.jonasjones.nec.mixin;

import com.llamalad7.mixinextras.sugar.Local;
import com.llamalad7.mixinextras.sugar.ref.LocalRef;
import com.mojang.blaze3d.systems.RenderSystem;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.font.TextRenderer;
import net.minecraft.client.gui.DrawContext;
import net.minecraft.client.gui.screen.SplashOverlay;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.resource.ResourceReload;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Mutable;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

import java.lang.reflect.Field;
import java.util.Optional;
import java.util.function.Consumer;

import static com.mojang.text2speech.Narrator.LOGGER;
import static me.jonasjones.nec.NotEnoughCursedness.MOD_ID;
import static me.jonasjones.nec.NotEnoughCursednessClient.NEW_LOGO;

@Mixin(value = SplashOverlay.class)
public class SplashScreenMixin {
    @Inject(method = "render", at = @At("TAIL"))
    private void injectRender(DrawContext context, int mouseX, int mouseY, float delta, CallbackInfo ci) {
        TextRenderer textRenderer = MinecraftClient.getInstance().textRenderer;
        context.drawTextWithShadow(textRenderer, Text.translatable("text.nec.splashscreen"), mouseX, mouseY, 0xFFFFFF);
    }
}
