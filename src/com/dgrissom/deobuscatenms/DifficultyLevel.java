package com.dgrissom.deobfuscatenms;

// class qp
public enum DifficultyLevel {
    // a
    PEACEFUL(0, "options.difficulty.peaceful"),
    // b
    EASY(1, "options.difficulty.easy"),
    // c
    NORMAL(2, "options.difficulty.normal"),
    // d
    HARD(3, "options.difficulty.hard");

    // e
    // levels by ID (PEACEFUL is at it's ID index (0). really just values() I guess
    private static final DifficultyLevel[] levels;
    // f
    private final int id;
    // g
    private final String path;

    private DifficultyLevel(int id, String path) {
        this.id = id;
        this.path = path;
    }

    // a
    public int getId() {
        return this.id;
    }

    // a
    //todo not sure what this does yet
    //todo find better name
    public static DifficultyLevel a(int i) {
        return levels[i % e.length];
    }

    // b
    public String getPath() {
        return this.path;
    }

    static {
        levels = new DifficultyLevel[values().length];
        DifficultyLevel[] allLevels = values();
        int numLevels = allLevels.length;

        for (int i = 0; i < numLevels; i++){
            DifficultyLevel level = allLevels[i];
            levels[level.id] = level;
        }
    }
}
