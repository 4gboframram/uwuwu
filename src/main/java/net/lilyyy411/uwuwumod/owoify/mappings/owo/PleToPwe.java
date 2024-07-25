package net.lilyyy411.uwuwumod.owoify.mappings.owo;

import net.lilyyy411.uwuwumod.owoify.Word;
import net.lilyyy411.uwuwumod.owoify.mappings.Mapping;

import java.util.regex.Pattern;

public class PleToPwe implements Mapping {
    public static Pattern PLE_TO_PWE = Pattern.compile("([Pp])le");

    public Word map(Word input) {
        return input.replace(PLE_TO_PWE, "$1we");
    }
}
