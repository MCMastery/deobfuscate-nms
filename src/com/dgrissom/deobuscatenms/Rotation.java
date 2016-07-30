package com.dgrissom.deobfuscatenms;

import ct.a;

// class aos
//todo finish
public enum Rotation {
    a("rotate_0"),
    b("rotate_90"),
    c("rotate_180"),
    d("rotate_270");

    // e
    private final String name;
    // f
    private static final String[] rotationNames;

    private Rotation(String name) {
        this.name = name;
    }

    public Rotation a(Rotation rotation) {
        switch (rotation) {
            case c:
                switch (this) {
                    case a:
                        return c;
                    case b:
                        return d;
                    case c:
                        return a;
                    case d:
                        return b;
                }
            case d:
                switch (this) {
                    case a:
                        return d;
                    case b:
                        return a;
                    case c:
                        return b;
                    case d:
                        return c;
                }
            case b:
                switch (this) {
                    case a:
                        return b;
                    case b:
                        return c;
                    case c:
                        return d;
                    case d:
                        return a;
                }
            default:
                return this;
        }
    }

    public ct a(ct ☃) {
        if (☃.k() == a.b) {
            return ☃;
        } else {
            switch (Rotation.a[this.ordinal()]) {
                case 2:
                    return ☃.e();
                case 3:
                    return ☃.d();
                case 4:
                    return ☃.f();
                default:
                    return ☃;
            }
        }
    }

    public int a(int ☃, int ☃1) {
        switch(Rotation.a[this.ordinal()]) {
            case 2:
                return (☃ + ☃1 / 4) % ☃1;
            case 3:
                return (☃ + ☃1 / 2) % ☃1;
            case 4:
                return (☃ + ☃1 * 3 / 4) % ☃1;
            default:
                return ☃;
        }
    }

    static {
        rotationNames = new String[values().length];
        // effictively same as "i" in loop below
        int j = 0;
        Rotation[] rotations = values();
        int rotationCount = rotations.length;

        for (int i = 0; i < rotationCount; i++) {
            Rotation rotation = rotations[i];
            rotationNames[j++] = rotation.name;
        }
    }
}
