package com.bytedance.im.core.internal.utils;

import com.bytedance.covode.number.Covode;
import com.google.gson.b;
import com.google.gson.c;

public final class a implements b {
    static {
        Covode.recordClassIndex(23118);
    }

    @Override // com.google.gson.b
    public final boolean shouldSkipClass(Class<?> cls) {
        return false;
    }

    @Override // com.google.gson.b
    public final boolean shouldSkipField(c cVar) {
        if (cVar.f54666a.getAnnotation(g.class) != null) {
            return true;
        }
        return false;
    }
}
