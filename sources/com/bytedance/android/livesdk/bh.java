package com.bytedance.android.livesdk;

import com.bytedance.android.livesdkapi.depend.d.n;
import com.bytedance.common.utility.collection.b;
import com.bytedance.common.utility.m;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class bh implements n {

    /* renamed from: a  reason: collision with root package name */
    private static volatile bh f14209a;

    /* renamed from: b  reason: collision with root package name */
    private final Map<String, a> f14210b;

    interface a {
        static {
            Covode.recordClassIndex(7873);
        }

        String a();

        boolean a(Map<String, String> map);
    }

    static {
        Covode.recordClassIndex(7872);
    }

    private bh() {
        HashMap hashMap = new HashMap();
        this.f14210b = hashMap;
        at atVar = new at();
        hashMap.put(atVar.a(), atVar);
    }

    public static bh a() {
        MethodCollector.i(1305);
        if (f14209a == null) {
            synchronized (bh.class) {
                try {
                    if (f14209a == null) {
                        f14209a = new bh();
                    }
                } catch (Throwable th) {
                    MethodCollector.o(1305);
                    throw th;
                }
            }
        }
        bh bhVar = f14209a;
        MethodCollector.o(1305);
        return bhVar;
    }

    @Override // com.bytedance.android.livesdkapi.depend.d.n
    public final boolean a(Map<String, String> map) {
        Set<String> keySet = this.f14210b.keySet();
        if (b.a((Collection) keySet)) {
            return false;
        }
        String remove = map.remove("intercept");
        if (m.a(remove) || !keySet.contains(remove) || this.f14210b.get(remove) == null) {
            return false;
        }
        return this.f14210b.get(remove).a(map);
    }
}
