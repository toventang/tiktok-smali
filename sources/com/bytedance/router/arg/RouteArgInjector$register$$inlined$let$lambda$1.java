package com.bytedance.router.arg;

import androidx.lifecycle.i;
import androidx.lifecycle.m;
import androidx.lifecycle.v;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.au;
import h.a.n;
import h.f.a.a;
import java.lang.ref.WeakReference;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public final class RouteArgInjector$register$$inlined$let$lambda$1 implements au {
    final /* synthetic */ a $onInjected$inlined;
    final /* synthetic */ m $owner$inlined;

    static {
        Covode.recordClassIndex(26168);
    }

    @Override // androidx.lifecycle.k
    public final void onStateChanged(m mVar, i.a aVar) {
        if (aVar == i.a.ON_DESTROY) {
            onDestroy();
        }
    }

    @v(a = i.a.ON_DESTROY)
    public final void onDestroy() {
        RouteArgInjector routeArgInjector = RouteArgInjector.INSTANCE;
        ConcurrentHashMap concurrentHashMap = RouteArgInjector.map;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : concurrentHashMap.entrySet()) {
            if (((WeakReference) entry.getKey()).get() == this.$owner$inlined) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        RouteArgInjector routeArgInjector2 = RouteArgInjector.INSTANCE;
        ConcurrentHashMap concurrentHashMap2 = RouteArgInjector.map;
        n.b((Collection) concurrentHashMap2.keySet(), (Iterable) linkedHashMap.keySet());
    }

    RouteArgInjector$register$$inlined$let$lambda$1(m mVar, a aVar) {
        this.$owner$inlined = mVar;
        this.$onInjected$inlined = aVar;
    }
}
