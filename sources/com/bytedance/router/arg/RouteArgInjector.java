package com.bytedance.router.arg;

import androidx.lifecycle.m;
import com.bytedance.covode.number.Covode;
import h.f.a.a;
import h.f.b.l;
import h.z;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public final class RouteArgInjector {
    public static final RouteArgInjector INSTANCE = new RouteArgInjector();
    private static final ConcurrentHashMap<WeakReference<m>, List<a<z>>> map = new ConcurrentHashMap<>();

    private RouteArgInjector() {
    }

    static {
        Covode.recordClassIndex(26167);
    }

    public final void inject(m mVar) {
        l.c(mVar, "");
        ConcurrentHashMap<WeakReference<m>, List<a<z>>> concurrentHashMap = map;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<WeakReference<m>, List<a<z>>> entry : concurrentHashMap.entrySet()) {
            if (entry.getKey().get() == mVar) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        for (Map.Entry entry2 : linkedHashMap.entrySet()) {
            for (a aVar : (Iterable) entry2.getValue()) {
                aVar.invoke();
            }
        }
    }

    public final void register(m mVar, a<z> aVar) {
        l.c(aVar, "");
        if (mVar != null) {
            ConcurrentHashMap<WeakReference<m>, List<a<z>>> concurrentHashMap = map;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry<WeakReference<m>, List<a<z>>> entry : concurrentHashMap.entrySet()) {
                if (entry.getKey().get() == mVar) {
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                }
            }
            if (linkedHashMap.isEmpty()) {
                ConcurrentHashMap<WeakReference<m>, List<a<z>>> concurrentHashMap2 = map;
                WeakReference<m> weakReference = new WeakReference<>(mVar);
                ArrayList arrayList = new ArrayList();
                arrayList.add(aVar);
                concurrentHashMap2.put(weakReference, arrayList);
                mVar.getLifecycle().a(new RouteArgInjector$register$$inlined$let$lambda$1(mVar, aVar));
                return;
            }
            for (Map.Entry entry2 : linkedHashMap.entrySet()) {
                List list = (List) entry2.getValue();
                if (list != null) {
                    list.add(aVar);
                }
            }
        }
    }
}
