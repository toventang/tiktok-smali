package com.facebook.a;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.facebook.internal.ae;
import com.facebook.internal.b;
import com.facebook.m;
import java.util.HashMap;
import java.util.Set;

/* access modifiers changed from: package-private */
public final class d {

    /* renamed from: a  reason: collision with root package name */
    private final HashMap<a, o> f46692a = new HashMap<>();

    static {
        Covode.recordClassIndex(28455);
    }

    public final synchronized Set<a> a() {
        Set<a> keySet;
        MethodCollector.i(2184);
        keySet = this.f46692a.keySet();
        MethodCollector.o(2184);
        return keySet;
    }

    public final synchronized o a(a aVar) {
        o oVar;
        MethodCollector.i(2192);
        oVar = this.f46692a.get(aVar);
        MethodCollector.o(2192);
        return oVar;
    }

    private synchronized o b(a aVar) {
        o oVar;
        MethodCollector.i(2199);
        oVar = this.f46692a.get(aVar);
        if (oVar == null) {
            ae.a();
            Context context = m.f48921g;
            oVar = new o(b.a(context), h.a(context));
        }
        this.f46692a.put(aVar, oVar);
        MethodCollector.o(2199);
        return oVar;
    }

    public final synchronized void a(n nVar) {
        MethodCollector.i(2174);
        if (nVar == null) {
            MethodCollector.o(2174);
            return;
        }
        for (a aVar : nVar.a()) {
            o b2 = b(aVar);
            for (c cVar : nVar.a(aVar)) {
                b2.a(cVar);
            }
        }
        MethodCollector.o(2174);
    }
}
