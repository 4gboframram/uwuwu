package net.lilyyy411.uwuwumod.owoify.mappings.word;

import net.lilyyy411.uwuwumod.owoify.Word;
import net.lilyyy411.uwuwumod.owoify.mappings.Mapping;

import java.util.regex.Pattern;

public class YouToU implements Mapping {
    public static Pattern YOU_TO_U_UPPER = Pattern.compile("\\bYou\\b");
    public static Pattern YOU_TO_U_LOWER = Pattern.compile("\\byou\\b");

    public Word map(Word input) {
        return input.replace(YOU_TO_U_UPPER, "U")
                .replace(YOU_TO_U_LOWER, "u");
    }
}
