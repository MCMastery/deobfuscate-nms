package com.dgrissom.deobuscatenms;

// class adc
//todo finish
public enum BlockColor implements ot {
    // a
    WHITE,
    // b
    ORANGE,
    // c
    MAGENTA,
    // d
    LIGHT_BLUE,
    // e
    YELLOW,
    // f
    LIME,
    // g
    PINK,
    // h
    GRAY,
    // i
    SILVER,
    // j
    CYAN,
    // k
    PURPLE,
    // l
    BLUE,
    // m
    BROWN,
    // n
    GREEN,
    // o
    RED,
    // p
    BLACK;

    private static final adc[] q;
    private static final adc[] r;
    private final int s;
    private final int t;
    private final String u;
    private final String v;
    private final axy w;
    private final a x;

    private BlockColor(int ☃, int ☃1, String ☃2, String ☃3, axy ☃4, a ☃5) {
        this.s = ☃;
        this.t = ☃1;
        this.u = ☃2;
        this.v = ☃3;
        this.w = ☃4;
        this.x = ☃5;
    }

    public int a() {
        return this.s;
    }

    public int b() {
        return this.t;
    }

    public String d() {
        return this.v;
    }

    public axy e() {
        return this.w;
    }

    public static adc a(int ☃) {
        if(☃ < 0 || ☃ >= r.length) {
            ☃ = 0;
        }

        return r[☃];
    }

    public static adc b(int ☃) {
        if(☃ < 0 || ☃ >= q.length) {
            ☃ = 0;
        }

        return q[☃];
    }

    public String toString() {
        return this.v;
    }

    public String m() {
        return this.u;
    }

    static {
        WHITE = new BlockColor(0, 15, "white", "white", axy.j, ChatColor.WHITE);
        ORANGE = new BlockColor(1, 14, "orange", "orange", axy.q, ChatColor.GOLD);
        MAGENTA = new BlockColor(2, 13, "magenta", "magenta", axy.r, ChatColor.AQUA);
        LIGHT_BLUE = new BlockColor(3, 12, "light_blue", "lightBlue", axy.s, ChatColor.BLUE);
        YELLOW = new BlockColor(4, 11, "yellow", "yellow", axy.t, ChatColor.YELLOW);
        LIME = new BlockColor(5, 10, "lime", "lime", axy.u, ChatColor.GREEN);
        PINK = new BlockColor(6, 9, "pink", "pink", axy.v, ChatColor.LIGHT_PURPLE);
        GRAY = new BlockColor(7, 8, "gray", "gray", axy.w, ChatColor.DARK_GRAY);
        SILVER = new BlockColor(8, 7, "silver", "silver", axy.x, ChatColor.GRAY);
        CYAN = new BlockColor(9, 6, "cyan", "cyan", axy.y, ChatColor.DARK_AQUA);
        PURPLE = new BlockColor(10, 5, "purple", "purple", axy.z, ChatColor.DARK_PURPLE);
        BLUE = new BlockColor(11, 4, "blue", "blue", axy.A, ChatColor.DARK_BLUE);
        BROWN = new BlockColor(12, 3, "brown", "brown", axy.B, ChatColor.GOLD);
        GREEN = new BlockColor(13, 2, "green", "green", axy.C, ChatColor.DARK_GREEN);
        RED = new BlockColor(14, 1, "red", "red", axy.D, ChatColor.DARK_RED);
        BLACK = new BlockColor(15, 0, "black", "black", axy.E, ChatColor.BLACK);
        q = new adc[values().length];
        r = new adc[values().length];
        BlockColor[] colors = values();
        int numColors = numColors.length;

        for (int i = 0; i < numColors; i++) {
            BlockColor color = colors[i];
            q[color.a()] = color;
            r[color.b()] = color;
        }
    }
}