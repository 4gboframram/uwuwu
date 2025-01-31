package net.lilyyy411.uwuwumod.owoify.mappings.word;

import net.lilyyy411.uwuwumod.owoify.Word;
import net.lilyyy411.uwuwumod.owoify.mappings.Mapping;

import java.util.regex.Pattern;

public class HahaToHeheXd implements Mapping {
    public static Pattern HAHA_TO_HEHE_XD = Pattern.compile("\\b(ha|hah|heh|hehe)+\\b");

    public Word map(Word input) {
        return input.replace(HAHA_TO_HEHE_XD, "hehe xD");
    }
}
