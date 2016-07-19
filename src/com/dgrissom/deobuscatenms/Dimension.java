package com.dgrissom.deobfuscatenms;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

// class "atm"
public enum Dimension {
    // a
    OVERWORLD(0, "Overworld", "", ato.class),
    // b
    NETHER(-1, "Nether", "_nether", atn.class),
    // c
    END(1, "The End", "_end", atr.class);

    // d
    private final int id;
    // e
    private final String name;
    // f
    private final String worldSuffix; // the suffix added after the world folder's name
    // g
    //todo I think this is the world generator / chunk generator (see d())
    private final Class<? extends atl> clazz;

    private Dimension(int id, String name, String worldSuffix, Class<? extends atl> clazz) {
        this.d = id;
        this.e = name;
        this.f = worldSuffix;
        this.clazz = clazz;
    }

    // a
    public int getId() {
        return this.id;
    }
    // b
    public String getName() {
        return this.name;
    }
    // c
    public String getWorldSuffix() {
        return this.worldSuffix;
    }

    // d
    //todo this seems to create a new dimension :P
    public atl d() {
        try {
            Constructor constructor = this.clazz.getConstructor(new Class[0]);
            return (atl) constructor.newInstance(new Object[0]);
        } catch (NoSuchMethodException var2) {
            throw new Error("Could not create new dimension", var2);
        } catch (InvocationTargetException var3) {
            throw new Error("Could not create new dimension", var3);
        } catch (InstantiationException var4) {
            throw new Error("Could not create new dimension", var4);
        } catch (IllegalAccessException var5) {
            throw new Error("Could not create new dimension", var5);
        }
    }

    // a
    public static Dimension fromId(int id) {
        Dimension[] dimensions = values();
        int numDimensions = dimensions.length;

        for (int i = 0; i < numDimensions; i++) {
            Dimension dimension = dimensions[i];
            if(dimension.getId() == id) {
                return dimension;
            }
        }

        throw new IllegalArgumentException("Invalid dimension id " + id);
    }
}
