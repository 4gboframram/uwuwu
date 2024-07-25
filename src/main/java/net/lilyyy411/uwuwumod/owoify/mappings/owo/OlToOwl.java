package net.lilyyy411.uwuwumod.owoify.mappings.owo;

import net.lilyyy411.uwuwumod.owoify.Word;
import net.lilyyy411.uwuwumod.owoify.mappings.Mapping;

import java.util.regex.Pattern;

public class OlToOwl implements Mapping {
    public static Pattern OL_TO_OWL_UPPER = Pattern.compile("OL");
    public static Pattern OL_TO_OWL_LOWER = Pattern.compile("([Oo])l");

    public Word map(Word input) {
        return input.replace(OL_TO_OWL_LOWER, "$1wl")
                .replace(OL_TO_OWL_UPPER, "OWL");
    }
}
