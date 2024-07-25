package net.lilyyy411.uwuwumod.owoify.mappings.uwu;

import net.lilyyy411.uwuwumod.owoify.Word;
import net.lilyyy411.uwuwumod.owoify.mappings.Mapping;

import java.util.regex.Pattern;

public class ROrLToW implements Mapping {
    public static Pattern RORL_TO_W_UPPER = Pattern.compile("(?:R|L)");
    public static Pattern RORL_TO_W_LOWER = Pattern.compile("(?:r|l)");

    public Word map(Word input) {
        return input.replace(RORL_TO_W_LOWER, "w")
                .replace(RORL_TO_W_UPPER, "W");
    }
}
