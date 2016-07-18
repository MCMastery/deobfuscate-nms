package com.dgrissom.deobuscatenms;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;
import javax.annotation.Nullable;

// class "a"
public enum ChatColor {
    // a
    BLACK("BLACK", '0', 0),
    // b
    DARK_BLUE("DARK_BLUE", '1', 1),
    // c
    DARK_GREEN("DARK_GREEN", '2', 2),
    // d
    DARK_AQUA("DARK_AQUA", '3', 3),
    // e
    DARK_RED("DARK_RED", '4', 4),
    // f
    DARK_PURPLE("DARK_PURPLE", '5', 5),
    // g
    GOLD("GOLD", '6', 6),
    // h
    GRAY("GRAY", '7', 7),
    // i
    DARK_GRAY("DARK_GRAY", '8', 8),
    // j
    BLUE("BLUE", '9', 9),
    // k
    GREEN("GREEN", 'a', 10),
    // l
    AQUA("AQUA", 'b', 11),
    // m
    RED("RED", 'c', 12),
    // n
    LIGHT_PURPLE("LIGHT_PURPLE", 'd', 13),
    // o
    YELLOW("YELLOW", 'e', 14),
    // p
    WHITE("WHITE", 'f', 15),
    // q
    OBFUSCATED("OBFUSCATED", 'k', true),
    // r
    BOLD("BOLD", 'l', true),
    // s
    STRIKETHROUGH("STRIKETHROUGH", 'm', true),
    // t
    UNDERLINE("UNDERLINE", 'n', true),
    // u
    ITALIC("ITALIC", 'o', true),
    // v
    RESET("RESET", 'r', -1);

    // map of ChatColors with associated "simplified names" (uses simplifyName())
    private static final Map<String, ChatColor> chatColors;
    // x
    // (?i)§[0-9A-FK-OR]
    private static final Pattern chatColorMatcher; // matches chat colors (case-insensitive)
    // y
    private final String name;
    // z
    private final char ch; // character (l for bold, 4 for dark red, r for reset, etc.) todo (nothing uses this...)
    // A
    private final boolean isFormat;
    // B
    private final String usage; // section symbol + code
    // C
    private final int code;
    
    // converts to lower-case, then removes every non-alphabetic character
    // ex. DARK_BLUE to darkblue
    // OBFUSCATED to obfuscated
    //todo find better name.
    private static String simplifyName(String string) {
        return string.toLowerCase().replaceAll("[^a-z]", "");
    }

    ChatColor(String name, char ch, int code) {
        this(name, ch, false, code);
    }

    ChatColor(String name, char ch, boolean isFormat) {
        this(name, ch, isFormat, -1);
    }

    ChatColor(String name, char ch, boolean isFormat, int code) {
        this.name = name;
        this.ch = ch;
        this.isFormat = isFormat;
        this.code = code;
        this.usage = "§" + ch;
    }
    
    // b
    public int getCode() {
        return this.code;
    }
    // c
    public boolean isFormat() {
        return this.isFormat;
    }
    // d
    public boolean isColor() {
        return !this.isFormat && this != RESET;
    }
    // e
    public String e() {
        return this.name().toLowerCase();
    }
    @Override
    public String toString() {
        return this.usage;
    }

    // a
    // strips the color usages from a string '§' + code (HELLO§kHI will return HELLOHI)
    @Nullable
    public static String stripColor(@Nullable String string) {
        return string == null ? null : chatColorMatcher.matcher(string).replaceAll("");
    }

    // b
    // accepts string as null, or in the format "ABCD_EFGH", like "DARK_BLUE" or "OBFUSCATED", and returns the associated ChatColor
    @Nullable
    public static ChatColor fromName(@Nullable String string) {
        return string == null ? null : chatColors.get(simplifyName(string));
    }

    // a
    @Nullable
    public static ChatColor fromCode(int code) {
        if (code < 0) {
            return RESET;
        } else {
            ChatColor[] values = values();
            int valueCount = values.length;

            for (int i = 0; i < valueCount; i++) {
                ChatColor chatColor = values[i];
                if (chatColor.getCode() == code) {
                    return chatColor;
                }
            }

            return null;
        }
    }

    // (true, false) will return all colors
    // (false, true) will return all formatting
    // (false, false) will return reset
    // (true, true) will return everything
    // a
    public static List<String> fromTypes(boolean allowColors, boolean allowFormatting) {
        List<String> list = new ArrayList<>();
        ChatColor[] values = values();
        int valueCount = values.length;

        for (int i = 0; i < valueCount; i++) {
            ChatColor chatColor = values[i];
            if ((!chatColor.isColor() || allowColors) && (!chatColor.isFormat() || allowFormatting))
                list.add(chatColor.e());
        }

        return list;
    }

    static {
        chatColors = new HashMap<>();
        chatColorMatcher = Pattern.compile("(?i)" + String.valueOf('§') + "[0-9A-FK-OR]");
        ChatColor[] values = values();
        int valueCount = values.length;

        for (int i = 0; i < valueCount; i++) {
            ChatColor chatColor = values[i];
            chatColors.put(simplifyName(chatColor.name), chatColor);
        }
    }
}
