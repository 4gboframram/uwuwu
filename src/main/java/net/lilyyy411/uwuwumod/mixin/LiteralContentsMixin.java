package net.lilyyy411.uwuwumod.mixin;

import net.lilyyy411.uwuwumod.owoify.Owoify;
import net.minecraft.network.chat.contents.LiteralContents;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.ModifyVariable;

@Mixin(LiteralContents.class)
public class LiteralContentsMixin {
    @ModifyVariable(method = "<init>",
            at = @At("HEAD"), argsOnly = true)
    private static String literalConstructor(String text) {
        // Almost all rendered text ends up eventually being turned into a Literal component.
        // Either that, or it's directly written to the screen with some abstraction around `Font.renderText`.
        return Owoify.doOwoify(text);
    }
}
