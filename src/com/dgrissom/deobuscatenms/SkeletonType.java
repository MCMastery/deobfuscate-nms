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

    private ze(String name, kn a) {
        this.d = new ff("entity." + name + ".name", new Object[0]);
        this.e = a;
    }

    public int a() {
        return this.ordinal();
    }

    public static ze a(int☃) {
        return values()[☃];
    }

    public kn c() {
        return this.e;
    }

    public ni d() {
        switch (this) {
            case WITHER_SKELETON:
                return nj.ha;
            case STRAY:
                return nj.gu;
            default:
                return nj.ft;
        }
    }

    public ni e() {
        switch (this) {
            case WITHER_SKELETON:
                return nj.hc;
            case STRAY:
                return nj.gw;
            default:
                return nj.fy;
        }
    }

    public ni f() {
        switch (this) {
            case WITHER_SKELETON:
                return nj.hb;
            case STRAY:
                return nj.gv;
            default:
                return nj.fu;
        }
    }

    public ni g() {
        switch (this) {
            case WITHER_SKELETON:
                return nj.hd;
            case STRAY:
                return nj.gx;
            default:
                return nj.fA;
        }
    }

    static {
        NORMAL = new SkeletonType("Skeleton", bak.al);
        WITHER = new SkeletonType("WitherSkeleton", bak.am);
        STRAY = new SkeletonType("Stray", bak.an);
    }
}