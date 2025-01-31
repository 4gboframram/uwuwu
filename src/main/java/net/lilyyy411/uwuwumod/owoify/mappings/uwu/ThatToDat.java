package net.lilyyy411.uwuwumod.owoify.mappings.uwu;

import net.lilyyy411.uwuwumod.owoify.Word;
import net.lilyyy411.uwuwumod.owoify.mappings.Mapping;

import java.util.regex.Pattern;

public class ThatToDat implements Mapping {
    public static Pattern THAT_TO_DAT_UPPER = Pattern.compile("That");
    public static Pattern THAT_TO_DAT_LOWER = Pattern.compile("that");

    public Word map(Word input) {
        return input.replace(THAT_TO_DAT_UPPER, "dat")
                .replace(THAT_TO_DAT_LOWER, "Dat");
    }
}
