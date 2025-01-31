package net.lilyyy411.uwuwumod.owoify.mappings.word;

import net.lilyyy411.uwuwumod.owoify.Word;
import net.lilyyy411.uwuwumod.owoify.mappings.Mapping;

import java.util.regex.Pattern;

public class TheToTeh implements Mapping {
    public static Pattern THE_TO_TEH = Pattern.compile("\\b([Tt])he\\b");

    public Word map(Word input) {
        return input.replace(THE_TO_TEH, "$1eh");
    }
}
