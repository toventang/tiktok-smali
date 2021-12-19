package com.bytedance.tux.b.a;

import com.bytedance.covode.number.Covode;
import h.f.b.l;
import java.util.LinkedHashMap;
import java.util.Map;

public abstract class b<T> {
    static {
        Covode.recordClassIndex(27311);
    }

    /* access modifiers changed from: protected */
    public abstract boolean a(T t, int i2, Object obj);

    public Map<Integer, Object> a(T t, Map<Integer, ? extends Object> map) {
        l.c(map, "");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<Integer, ? extends Object> entry : map.entrySet()) {
            if (!a(t, entry.getKey().intValue(), entry.getValue())) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        return linkedHashMap;
    }
}
