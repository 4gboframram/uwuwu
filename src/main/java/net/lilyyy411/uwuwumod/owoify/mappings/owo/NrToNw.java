package net.lilyyy411.uwuwumod.owoify.mappings.owo;

import net.lilyyy411.uwuwumod.owoify.Word;
import net.lilyyy411.uwuwumod.owoify.mappings.Mapping;

import java.util.regex.Pattern;

public class NrToNw implements Mapping {
    public static Pattern NR_TO_NW_UPPER = Pattern.compile("NR");
    public static Pattern NR_TO_NW_LOWER = Pattern.compile("nr");

    public Word map(Word input) {
        return input.replace(NR_TO_NW_LOWER, "nw")
                .replace(NR_TO_NW_UPPER, "NW");
    }
}
