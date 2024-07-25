package net.lilyyy411.uwuwumod.owoify.mappings.owo;

import net.lilyyy411.uwuwumod.owoify.Word;
import net.lilyyy411.uwuwumod.owoify.mappings.Mapping;

import java.util.regex.Pattern;

public class OldToOwld implements Mapping {
    public static Pattern OLD_TO_OWLD_UPPER = Pattern.compile("OLD");
    public static Pattern OLD_TO_OWLD_LOWER = Pattern.compile("([Oo])ld");

    public Word map(Word input) {
        return input.replace(OLD_TO_OWLD_LOWER, "$1wld")
                .replace(OLD_TO_OWLD_UPPER, "OWLD");
    }
}
