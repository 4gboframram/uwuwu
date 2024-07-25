package net.lilyyy411.uwuwumod.owoify.mappings.word;

import net.lilyyy411.uwuwumod.owoify.Word;
import net.lilyyy411.uwuwumod.owoify.mappings.Mapping;

import java.util.regex.Pattern;

public class OverToOwor implements Mapping {
    public static Pattern OVER_TO_OWOR = Pattern.compile("([Oo])ver");

    public Word map(Word input) {
        return input.replace(OVER_TO_OWOR, "$1wor");
    }
}
