package net.lilyyy411.uwuwumod.owoify.mappings.uvu;

import net.lilyyy411.uwuwumod.owoify.Word;
import net.lilyyy411.uwuwumod.owoify.mappings.Mapping;

import java.util.regex.Pattern;

public class OToOwo implements Mapping {
    public static Pattern O_TO_OWO = Pattern.compile("o");

    public Word map(Word input) {
        String replacement = Math.random() > 0.33 ? "owo" : "o";
        return input.replace(O_TO_OWO, replacement);
    }
}
