package net.lilyyy411.uwuwumod.owoify.mappings.word;

import net.lilyyy411.uwuwumod.owoify.Word;
import net.lilyyy411.uwuwumod.owoify.mappings.Mapping;

import java.util.regex.Pattern;

public class RememberToRember implements Mapping {
    public static Pattern REMEMBER_TO_REMBER = Pattern.compile("([Rr])emember");

    public Word map(Word input) {
        return input.replace(REMEMBER_TO_REMBER, "$1ember");
    }
}
