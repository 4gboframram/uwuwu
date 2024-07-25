package net.lilyyy411.uwuwumod.owoify.mappings.owo;

import net.lilyyy411.uwuwumod.owoify.Word;
import net.lilyyy411.uwuwumod.owoify.mappings.Mapping;

import java.util.regex.Pattern;

public class PoiToPwoi implements Mapping {
    public static Pattern POI_TO_PWOI = Pattern.compile("([Pp])oi");

    public Word map(Word input) {
        return input.replace(POI_TO_PWOI, "$1woi");
    }
}
