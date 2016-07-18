package com.dgrissom.deobfuscatenms;

// class wt
//todo finish
public enum HorseType {
    HORSE,
    DONKEY,
    MULE,
    ZOMBIE,
    SKELETON;

    private final ff f;
    private final kn g;
    private final ni h;
    private final ni i;
    private final ni j;
    private final kn k;

    private HorseType(String name, String ☃1, ni ☃2, ni ☃3, ni ☃4, kn ☃5) {
        this.f = new ff("entity." + name + ".name", new Object[0]);
        this.g = new kn("textures/entity/horse/" + ☃1 + ".png");
        this.h = ☃3;
        this.i = ☃2;
        this.j = ☃4;
        this.k = ☃5;
    }

    public ni a() {
        return this.i;
    }

    public ni b() {
        return this.h;
    }

    public ni c() {
        return this.j;
    }

    public ff d() {
        return this.f;
    }

    public boolean f() {
        return this == b || this == c;
    }

    public boolean g() {
        return this == b || this == c;
    }

    public boolean h() {
        return this == d || this == e;
    }

    public boolean i() {
        return !this.h() && this != c;
    }

    public boolean j() {
        return this == a;
    }

    public int k() {
        return this.ordinal();
    }

    public static wt a(int ☃) {
        return values()[☃];
    }

    public kn l() {
        return this.k;
    }

    static {
        HORSE = new HorseType("HORSE", 0, "EntityHorse", "horse_white", nj.cp, nj.cw, nj.ct, bak.F);
        DONKEY = new HorseType("DONKEY", 1, "Donkey", "donkey", nj.ax, nj.aB, nj.aA, bak.F);
        MULE = new HorseType("MULE", 2, "Mule", "mule", nj.dD, nj.dF, nj.dE, bak.F);
        ZOMBIE = new HorseType("ZOMBIE", 3, "ZombieHorse", "horse_zombie", nj.hF, nj.hH, nj.hG, bak.G);
        SKELETON = new HorseType("SKELETON", 4, "SkeletonHorse", "horse_skeleton", nj.fv, nj.fx, nj.fw, bak.H);
    }
}
