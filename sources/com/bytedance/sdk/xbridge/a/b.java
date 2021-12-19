package com.bytedance.sdk.xbridge.a;

import com.bytedance.covode.number.Covode;
import com.bytedance.sdk.xbridge.a.c;
import com.bytedance.sdk.xbridge.registry.core.b;
import com.bytedance.sdk.xbridge.registry.core_api.a.d;
import h.f.b.l;
import java.util.concurrent.ConcurrentHashMap;

public final class b implements d {

    /* renamed from: a  reason: collision with root package name */
    public static final ConcurrentHashMap<String, c> f43911a = new ConcurrentHashMap<>();

    /* renamed from: b  reason: collision with root package name */
    public static final b f43912b = new b();

    private b() {
    }

    static {
        Covode.recordClassIndex(26830);
    }

    public static c.a a(String str, String str2) {
        l.c(str, "");
        l.c(str2, "");
        c cVar = f43911a.get(str);
        if (cVar != null) {
            return cVar.a(str2);
        }
        return null;
    }

    @Override // com.bytedance.sdk.xbridge.registry.core_api.a.d
    public final void a(String str, String str2, b.a aVar) {
        l.c(str, "");
        l.c(str2, "");
        l.c(aVar, "");
        ConcurrentHashMap<String, c> concurrentHashMap = f43911a;
        c cVar = concurrentHashMap.get(str2);
        if (cVar == null) {
            cVar = new c();
            concurrentHashMap.put(str2, cVar);
        }
        String value = aVar.getValue();
        l.c(str, "");
        cVar.f43915a.put(str, c.b.a(value));
    }
}
