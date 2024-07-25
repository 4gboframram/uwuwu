package net.lilyyy411.uwuwumod.owoify.mappings.owo;

import net.lilyyy411.uwuwumod.owoify.Word;
import net.lilyyy411.uwuwumod.owoify.mappings.Mapping;

import java.util.regex.Pattern;

public class LlToWw implements Mapping {
    public static Pattern LL_TO_WW = Pattern.compile("ll");

    public Word map(Word input) {
        return input.replace(LL_TO_WW, "ww");
    }
}
