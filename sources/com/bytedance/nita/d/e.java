package com.bytedance.nita.d;

import com.bytedance.covode.number.Covode;
import java.util.concurrent.ConcurrentHashMap;

public final class e {

    /* renamed from: a  reason: collision with root package name */
    public static final ConcurrentHashMap<com.bytedance.nita.api.e, d> f41646a = new ConcurrentHashMap<>();

    /* renamed from: b  reason: collision with root package name */
    public static final e f41647b = new e();

    private e() {
    }

    static {
        d bVar;
        Covode.recordClassIndex(25486);
        com.bytedance.nita.api.e[] values = com.bytedance.nita.api.e.values();
        for (com.bytedance.nita.api.e eVar : values) {
            ConcurrentHashMap<com.bytedance.nita.api.e, d> concurrentHashMap = f41646a;
            int i2 = f.f41648a[eVar.ordinal()];
            if (i2 == 1) {
                bVar = new b();
            } else if (i2 != 2) {
                bVar = new b();
            } else {
                bVar = new c();
            }
            concurrentHashMap.put(eVar, bVar);
        }
    }
}
