package net.lilyyy411.uwuwumod.owoify.mappings.word;

import net.lilyyy411.uwuwumod.owoify.Word;
import net.lilyyy411.uwuwumod.owoify.mappings.Mapping;

import java.util.regex.Pattern;

public class OveToUv implements Mapping {
    public static Pattern OVE_TO_UV_UPPER = Pattern.compile("OVE");
    public static Pattern OVE_TO_UV_LOWER = Pattern.compile("ove");

    public Word map(Word input) {
        return input.replace(OVE_TO_UV_LOWER, "uv")
                .replace(OVE_TO_UV_UPPER, "UV");
    }
}
