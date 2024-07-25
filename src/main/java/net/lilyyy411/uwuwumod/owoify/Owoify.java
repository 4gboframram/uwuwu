package net.lilyyy411.uwuwumod.owoify;

import com.google.common.cache.CacheBuilder;
import com.google.common.cache.CacheLoader;
import com.google.common.cache.LoadingCache;
import net.lilyyy411.uwuwumod.Config;
import net.lilyyy411.uwuwumod.UwuwuMod;
import net.lilyyy411.uwuwumod.owoify.mappings.Presets;
import org.jetbrains.annotations.NotNull;

import java.time.Duration;
import java.util.List;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

/**
 * The main class for the owoify API.
 *
 * @author SuperN64
 * @version 1.0.0, 1/1/23
 */
public class Owoify {

    public static Pattern WORD_REGEX = Pattern.compile("\\S+");
    public static Pattern SPACE_REGEX = Pattern.compile("\\s+");
    static CacheLoader<String, String> loader = new CacheLoader<String, String>() {
        @Override
        public @NotNull String load(@NotNull String key) {
            return tryOwoify(key);
        }
    };
    static LoadingCache<String, String> CACHE = CacheBuilder.newBuilder()
            .maximumSize(2048)
            .expireAfterAccess(Duration.ofSeconds(15))
            .build(loader);

    /**
     * Owoifies a string with level {@link OwoLevel#OWO}
     *
     * @param string the string to owoify
     * @return the owoified string
     */
    public static String owoify(String string) {
        return owoify(string, OwoLevel.OWO);
    }

    /**
     * Owoifies a string with various levels of owoness.
     *
     * @param string the string to owoify
     * @param level  the level of owoness to apply
     * @return the owoified string
     * @see OwoLevel
     */
    public static String owoify(String string, OwoLevel level) {
        UwuwuMod.LOGGER.debug("Owoifying {}", string);
        List<String> words = Utils.getAllMatches(WORD_REGEX.matcher(string));
        List<String> spaces = Utils.getAllMatches(SPACE_REGEX.matcher(string));
        words = words.stream().map(word -> {
            Word wordObject = new Word(word);
            Presets.SPECIFIC_WORD_MAPPINGS.forEach(mapping -> mapping.map(wordObject));
            switch (level) {
                case UVU:
                    Presets.UVU_MAPPINGS.forEach(mapping -> mapping.map(wordObject));
                case UWU:
                    Presets.UWU_MAPPINGS.forEach(mapping -> mapping.map(wordObject));
                case OWO:
                    Presets.OWO_MAPPINGS.forEach(mapping -> mapping.map(wordObject));
                default:
                    break;
            }
            return wordObject.toString();
        }).collect(Collectors.toList());
        return String.join("", Utils.interleaveList(words, spaces));
    }

    private static String tryOwoify(String string) {
        try {
            return owoify(string, Config.OWO_LEVEL.get());
        } catch (IllegalStateException e) {
            return owoify(string);
        }
    }

    public static String doOwoify(String string) {
        if (string.length() <= 2) {
            return string;
        }
        return CACHE.getUnchecked(string);
    }
}
