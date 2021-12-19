package com.bytedance.sdk.bridge;

import com.bytedance.covode.number.Covode;
import java.util.Collection;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public final class h {

    /* renamed from: a  reason: collision with root package name */
    private final Map<String, d> f43876a = new ConcurrentHashMap();

    static {
        Covode.recordClassIndex(26820);
    }

    public final Collection<d> a() {
        return this.f43876a.values();
    }

    public final boolean a(String str) {
        return this.f43876a.containsKey(str);
    }

    public final void a(String str, d dVar) {
        try {
            this.f43876a.put(str, dVar);
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }
}
