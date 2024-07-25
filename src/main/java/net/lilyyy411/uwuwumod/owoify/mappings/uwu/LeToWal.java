package net.lilyyy411.uwuwumod.owoify.mappings.uwu;

import net.lilyyy411.uwuwumod.owoify.Word;
import net.lilyyy411.uwuwumod.owoify.mappings.Mapping;

import java.util.regex.Pattern;

public class LeToWal implements Mapping {
    public static Pattern LE_TO_WAL = Pattern.compile("le$");

    public Word map(Word input) {
        return input.replace(LE_TO_WAL, "wal");
    }
}
