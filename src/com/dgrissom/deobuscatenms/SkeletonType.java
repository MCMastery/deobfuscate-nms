package com.dgrissom.deobfuscatenms;

// class ze
//todo finish
public enum SkeletonType {
    // a
    NORMAL,
    // b
    WITHER_SKELETON,
    // c
    STRAY;

    private final ff d;
    private final kn e;

    private SkeletonType(String name, kn☃1) {
        this.d = new ff("entity." + name + ".name", new Object[0]);
        this.e =☃1;
    }

    // a
    public int getId() {
        return this.ordinal();
    }

    // a
    public static SkeletonType fromId(int id) {
        return values()[id];
    }

    public kn c() {
        return this.e;
    }

    public ni d() {
        switch (SkeletonType.a[this.ordinal()]) { // this isn't fromId - fromId returns SkeltonType, not integer... originally was SkeltonType.SyntheticClass_1.a
            case 1:
                return nj.ha;
            case 2:
                return nj.gu;
            default:
                return nj.ft;
        }
    }

    public ni e() {
        switch (SkeletonType.a[this.ordinal()]) {
            case 1:
                return nj.hc;
            case 2:
                return nj.gw;
            default:
                return nj.fy;
        }
    }

    public ni f() {
        switch (ze.a[this.ordinal()]) {
            case 1:
                return nj.hb;
            case 2:
                return nj.gv;
            default:
                return nj.fu;
        }
    }

    public ni g() {
        switch (ze.a[this.ordinal()]) {
            case 1:
                return nj.hd;
            case 2:
                return nj.gx;
            default:
                return nj.fA;
        }
    }

    static {
        NORMAL = new SkeletonType("NORMAL", 0, "Skeleton", bak.al);
        WITHER = new SkeletonType("WITHER", 1, "WitherSkeleton", bak.am);
        STRAY = new SkeletonType("STRAY", 2, "Stray", bak.an);
    }
}