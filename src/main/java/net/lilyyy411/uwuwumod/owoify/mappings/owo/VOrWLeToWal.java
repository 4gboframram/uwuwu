package net.lilyyy411.uwuwumod.owoify.mappings.owo;

import net.lilyyy411.uwuwumod.owoify.Word;
import net.lilyyy411.uwuwumod.owoify.mappings.Mapping;

import java.util.regex.Pattern;

public class VOrWLeToWal implements Mapping {
    public static Pattern V_OR_W_LE_TO_WAL = Pattern.compile("[vw]le");

    public Word map(Word input) {
        return input.replace(V_OR_W_LE_TO_WAL, "wal");
    }
}
