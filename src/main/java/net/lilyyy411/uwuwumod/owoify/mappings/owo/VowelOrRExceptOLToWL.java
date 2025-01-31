package net.lilyyy411.uwuwumod.owoify.mappings.owo;

import net.lilyyy411.uwuwumod.owoify.Word;
import net.lilyyy411.uwuwumod.owoify.mappings.Mapping;

import java.util.regex.Pattern;

public class VowelOrRExceptOLToWL implements Mapping {
    public static Pattern VOWEL_OR_R_EXCEPT_O_L_TO_WL_UPPER = Pattern.compile("[AEIUR]([lL])$");
    public static Pattern VOWEL_OR_R_EXCEPT_O_L_TO_WL_LOWER = Pattern.compile("[aeiur]l$");

    public Word map(Word input) {
        return input.replace(VOWEL_OR_R_EXCEPT_O_L_TO_WL_LOWER, "wl")
                .replace(VOWEL_OR_R_EXCEPT_O_L_TO_WL_UPPER, "W$1");
    }
}
