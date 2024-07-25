package net.lilyyy411.uwuwumod.owoify.mappings.uvu;

import net.lilyyy411.uwuwumod.owoify.Word;
import net.lilyyy411.uwuwumod.owoify.mappings.Mapping;

import java.util.regex.Pattern;

public class EwToUwu implements Mapping {
    public static Pattern EW_TO_UWU = Pattern.compile("ew");

    public Word map(Word input) {
        return input.replace(EW_TO_UWU, "uwu");
    }
}
