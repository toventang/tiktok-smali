package com.google.ar.core;

import com.bytedance.covode.number.Covode;
import java.util.LinkedHashMap;
import java.util.Map;

/* access modifiers changed from: package-private */
public final class ab extends LinkedHashMap<Long, AugmentedFace> {
    static {
        Covode.recordClassIndex(33052);
    }

    ab() {
        super(1, 0.75f, true);
    }

    /* access modifiers changed from: protected */
    @Override // java.util.LinkedHashMap
    public final boolean removeEldestEntry(Map.Entry<Long, AugmentedFace> entry) {
        if (size() > 10) {
            return true;
        }
        return false;
    }
}
