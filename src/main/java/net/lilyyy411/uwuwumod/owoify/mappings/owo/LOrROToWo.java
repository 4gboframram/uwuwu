package net.lilyyy411.uwuwumod.owoify.mappings.owo;

import net.lilyyy411.uwuwumod.owoify.Word;
import net.lilyyy411.uwuwumod.owoify.mappings.Mapping;

import java.util.regex.Pattern;

public class LOrROToWo implements Mapping {
    public static Pattern L_OR_R_O_TO_WO_UPPER = Pattern.compile("[LR]([oO])");
    public static Pattern L_OR_R_O_TO_WO_LOWER = Pattern.compile("[lr]o");

    public Word map(Word input) {
        return input.replace(L_OR_R_O_TO_WO_LOWER, "wo")
                .replace(L_OR_R_O_TO_WO_UPPER, "W$1");
    }
}
