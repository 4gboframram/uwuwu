package net.lilyyy411.uwuwumod.owoify.mappings.owo;

import net.lilyyy411.uwuwumod.owoify.Word;
import net.lilyyy411.uwuwumod.owoify.mappings.Mapping;

import java.util.regex.Pattern;

public class ConsonantRToConsonantW implements Mapping {
    public static Pattern CONSONANT_R_TO_CONSONANT_W = Pattern.compile("([BbCcDdFfGgKkPpQqSsTtWwXxZz])r");

    public Word map(Word input) {
        return input.replace(CONSONANT_R_TO_CONSONANT_W, "$1w");
    }
}
