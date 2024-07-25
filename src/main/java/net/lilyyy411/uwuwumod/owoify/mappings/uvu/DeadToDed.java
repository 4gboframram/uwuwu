package net.lilyyy411.uwuwumod.owoify.mappings.uvu;

import net.lilyyy411.uwuwumod.owoify.Word;
import net.lilyyy411.uwuwumod.owoify.mappings.Mapping;

import java.util.regex.Pattern;

public class DeadToDed implements Mapping {
    public static Pattern DEAD_TO_DED_UPPER = Pattern.compile("Dead");
    public static Pattern DEAD_TO_DED_LOWER = Pattern.compile("dead");

    public Word map(Word input) {
        return input.replace(DEAD_TO_DED_UPPER, "Ded")
                .replace(DEAD_TO_DED_LOWER, "ded");
    }
}
