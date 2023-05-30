package com.masterquentus.hexcraft.entity.variant;

import java.util.Arrays;
import java.util.Comparator;

public enum MermaidVariant {
    DEFAULT(0),
    GREEN(1),
    RED(2);

    private static final MermaidVariant[] BY_ID = Arrays.stream(values()).sorted(Comparator.
            comparingInt(MermaidVariant::getId)).toArray(MermaidVariant[]::new);
    private final int id;

    MermaidVariant(int id) {
        this.id = id;
    }

    public int getId() {
        return this.id;
    }

    public static MermaidVariant byId(int id) {
        return BY_ID[id % BY_ID.length];
    }
}