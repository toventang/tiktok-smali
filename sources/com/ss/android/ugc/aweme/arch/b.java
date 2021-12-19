package com.ss.android.ugc.aweme.arch;

import com.bytedance.covode.number.Covode;
import java.util.HashMap;

public final class b<K, V> {

    /* renamed from: a  reason: collision with root package name */
    private HashMap<K, V> f66989a = new HashMap<>();

    static {
        Covode.recordClassIndex(41289);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [T, java.lang.Object] */
    public final <T> T a(K k2) {
        V v = this.f66989a.get(k2);
        if (v != 0) {
            return v;
        }
        return null;
    }

    public final b<K, V> a(K k2, V v) {
        this.f66989a.put(k2, v);
        return this;
    }
}
