package net.lilyyy411.uwuwumod.owoify.mappings.word;


import net.lilyyy411.uwuwumod.owoify.Word;
import net.lilyyy411.uwuwumod.owoify.mappings.Mapping;

import java.util.regex.Pattern;

public class FucToFwuc implements Mapping {
    public static Pattern FUC_TO_FWUC = Pattern.compile("([Ff])uc");

    public Word map(Word input) {
        return input.replace(FUC_TO_FWUC, "$1wuc");
    }
}
