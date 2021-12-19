package com.ss.avframework.livestreamv2.tinyjson;

import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class ReflectProperty {
    private final ReflectType reflectType;
    private final Serialized serialized;

    static {
        Covode.recordClassIndex(100476);
    }

    public final ReflectType getReflectType() {
        return this.reflectType;
    }

    public final Serialized getSerialized() {
        return this.serialized;
    }

    public ReflectProperty(Serialized serialized2, ReflectType reflectType2) {
        l.c(reflectType2, "");
        this.serialized = serialized2;
        this.reflectType = reflectType2;
    }
}
