package net.lilyyy411.uwuwumod.owoify.mappings.owo;

import net.lilyyy411.uwuwumod.owoify.Word;
import net.lilyyy411.uwuwumod.owoify.mappings.Mapping;

import java.util.regex.Pattern;

public class VerToWer implements Mapping {
    public static Pattern VER_TO_WER = Pattern.compile("([Vv])er");

    public Word map(Word input) {
        return input.replace(VER_TO_WER, "wer");
    }
}
