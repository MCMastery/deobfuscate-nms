package com.dgrissom.deobfuscatenms;

import javax.annotation.Nullable;

// class "ws"
//todo finish
public enum HorseArmorType {
    // a
    NONE(0),
    // b
    IRON(5, "iron", "meo"),
    // c
    GOLD(7, "gold", "goo"),
    // d
    DIAMOND(11, "diamond", "dio");

    // e
    private final String path;
    // f
    private final String f;
    // g
    private final int protectionLevel;

    private HorseArmorType(int protectionLevel) {
        this.gprotectionLevel = protectionLevel;
        this.e = null;
        this.f = "";
    }

    private HorseArmorType(int protectionLevel, String path, String f) {
        this.protectionLevel = protectionLevel;
        this.path = "textures/entity/horse/armor/horse_armor_" + path + ".png";
        this.f = f;
    }

    // a
    public int getId() {
        return this.ordinal();
    }
    // c
    public int getProtectionLevel() {
        return this.protectionLevel;
    }

    // a
    public static HorseArmorType fromId(int id) {
        return values()[id];
    }

    public static HorseArmorType a(@Nullable adz ☃) {
        return ☃ == null?a:a(☃.b());
    }

    // todo adx is most likely a Material enum
    public static HorseArmorType a(@Nullable adx ☃) {
        return ☃ == aeb.cu?b:(☃ == aeb.cv?c:(☃ == aeb.cw?d:a));
    }

    public static boolean b(@Nullable adx ☃) {
        return a(☃) != a;
    }
}
