package net.lilyyy411.uwuwumod.owoify.mappings.word;

import net.lilyyy411.uwuwumod.owoify.Word;
import net.lilyyy411.uwuwumod.owoify.mappings.Mapping;

import java.util.regex.Pattern;

public class MeToMwe implements Mapping {
    public static Pattern ME_TO_MWE = Pattern.compile("([Mm])e");

    public Word map(Word input) {
        return input.replace(ME_TO_MWE, "$1we");
    }
}
