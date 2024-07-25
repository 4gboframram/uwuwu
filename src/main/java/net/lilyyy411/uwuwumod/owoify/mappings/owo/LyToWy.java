package net.lilyyy411.uwuwumod.owoify.mappings.owo;

import net.lilyyy411.uwuwumod.owoify.Word;
import net.lilyyy411.uwuwumod.owoify.mappings.Mapping;

import java.util.regex.Pattern;

public class LyToWy implements Mapping {
    public static Pattern LY_TO_WY_UPPER = Pattern.compile("Ly");
    public static Pattern LY_TO_WY_LOWER = Pattern.compile("ly");

    public Word map(Word input) {
        return input.replace(LY_TO_WY_LOWER, "wy")
                .replace(LY_TO_WY_UPPER, "Wy");
    }
}
