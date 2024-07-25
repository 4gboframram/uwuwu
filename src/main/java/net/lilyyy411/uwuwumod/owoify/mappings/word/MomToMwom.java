package net.lilyyy411.uwuwumod.owoify.mappings.word;

import net.lilyyy411.uwuwumod.owoify.Word;
import net.lilyyy411.uwuwumod.owoify.mappings.Mapping;

import java.util.regex.Pattern;

public class MomToMwom implements Mapping {
    public static Pattern MOM_TO_MWOM = Pattern.compile("([Mm])om");

    public Word map(Word input) {
        return input.replace(MOM_TO_MWOM, "$1wom");
    }
}
