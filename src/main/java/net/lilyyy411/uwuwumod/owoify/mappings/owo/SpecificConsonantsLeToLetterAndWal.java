package net.lilyyy411.uwuwumod.owoify.mappings.owo;

import net.lilyyy411.uwuwumod.owoify.Word;
import net.lilyyy411.uwuwumod.owoify.mappings.Mapping;

import java.util.regex.Pattern;

public class SpecificConsonantsLeToLetterAndWal implements Mapping {
    public static Pattern SPECIFIC_CONSONANTS_LE_TO_LETTER_AND_WAL = Pattern.compile("([DdFfGgHhJjPpQqRrSsTtXxYyZz])le$");

    public Word map(Word input) {
        return input.replace(SPECIFIC_CONSONANTS_LE_TO_LETTER_AND_WAL, "$1wal");
    }
}
