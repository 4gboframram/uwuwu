package net.lilyyy411.uwuwumod.owoify.mappings.word;

import net.lilyyy411.uwuwumod.owoify.Word;
import net.lilyyy411.uwuwumod.owoify.mappings.Mapping;

import java.util.regex.Pattern;

public class WorseToWose implements Mapping {
    public static Pattern WORSE_TO_WOSE = Pattern.compile("([Ww])orse");

    public Word map(Word input) {
        return input.replace(WORSE_TO_WOSE, "$1ose");
    }
}
