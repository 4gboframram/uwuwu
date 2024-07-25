package net.lilyyy411.uwuwumod.owoify.mappings.uwu;

import net.lilyyy411.uwuwumod.owoify.Word;
import net.lilyyy411.uwuwumod.owoify.mappings.Mapping;

import java.util.regex.Pattern;

public class RyToWwy implements Mapping {
    public static Pattern RY_TO_WWY = Pattern.compile("ry");

    public Word map(Word input) {
        return input.replace(RY_TO_WWY, "wwy");
    }
}
