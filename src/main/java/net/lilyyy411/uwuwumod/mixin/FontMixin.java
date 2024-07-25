package net.lilyyy411.uwuwumod.mixin;

import net.lilyyy411.uwuwumod.owoify.Owoify;
import net.minecraft.client.gui.Font;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.ModifyVariable;

@Mixin(Font.class)
public class FontMixin {

    @ModifyVariable(method = "renderText(Ljava/lang/String;FFIZLorg/joml/Matrix4f;Lnet/minecraft/client/renderer/MultiBufferSource;Lnet/minecraft/client/gui/Font$DisplayMode;II)F",
            at = @At("HEAD"), argsOnly = true)
    public String renderTextText(String text) {
        return Owoify.doOwoify(text);
    }

    @ModifyVariable(method = "width(Ljava/lang/String;)I", at = @At("HEAD"), argsOnly = true)
    public String widthText(String text) {
        // We want the width of the string to be "correct"
        return Owoify.doOwoify(text);
    }
}
