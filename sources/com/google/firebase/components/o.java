package com.google.firebase.components;

import com.bytedance.covode.number.Covode;
import java.util.Arrays;
import java.util.List;

public final class o extends p {
    private final List<b<?>> componentsInCycle;

    static {
        Covode.recordClassIndex(33735);
    }

    public final List<b<?>> getComponentsInCycle() {
        return this.componentsInCycle;
    }

    public o(List<b<?>> list) {
        super("Dependency cycle detected: " + Arrays.toString(list.toArray()));
        this.componentsInCycle = list;
    }
}
