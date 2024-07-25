package net.lilyyy411.uwuwumod.owoify.mappings.uwu;

import net.lilyyy411.uwuwumod.owoify.Word;
import net.lilyyy411.uwuwumod.owoify.mappings.Mapping;

import java.util.regex.Pattern;

public class VeToWe implements Mapping {
    public static Pattern VE_TO_WE_UPPER = Pattern.compile("Ve");
    public static Pattern VE_TO_WE_LOWER = Pattern.compile("ve");

    public Word map(Word input) {
        return input.replace(VE_TO_WE_LOWER, "we")
                .replace(VE_TO_WE_UPPER, "We");
    }
}
