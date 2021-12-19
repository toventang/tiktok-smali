package com.bytedance.nita.f;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.nita.api.b;
import com.bytedance.nita.api.c;
import com.bytedance.nita.c.a;
import h.f.b.l;
import h.w;
import java.util.concurrent.ConcurrentHashMap;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    public static final ConcurrentHashMap<String, c> f41669a = new ConcurrentHashMap<>();

    /* renamed from: b  reason: collision with root package name */
    public static final d f41670b = new d();

    private d() {
    }

    static {
        Covode.recordClassIndex(25499);
    }

    public final void a(c cVar) {
        MethodCollector.i(7800);
        l.c(cVar, "");
        synchronized (this) {
            try {
                f41669a.put(cVar.a(), cVar);
            } finally {
                MethodCollector.o(7800);
            }
        }
    }

    public static <T> T a(String str, int i2, Context context) {
        l.c(str, "");
        l.c(context, "");
        long currentTimeMillis = System.currentTimeMillis();
        T t = (T) a.f41627f.b(str, i2, context);
        c cVar = f41669a.get(str);
        if (cVar != null) {
            boolean z = true;
            if (t != null) {
                a(cVar, t, context, true);
                b bVar = com.bytedance.nita.a.f41605b;
                if (bVar != null) {
                    bVar.a(System.currentTimeMillis() - currentTimeMillis, cVar, true);
                }
                return t;
            }
            T t2 = (T) a.f41627f.b(str, i2, context);
            if (t2 == null) {
                long currentTimeMillis2 = System.currentTimeMillis();
                l.c(cVar, "");
                l.c(context, "");
                t2 = (T) cVar.b().a(context, cVar.b(context), i2);
                b bVar2 = com.bytedance.nita.a.f41605b;
                if (bVar2 != null) {
                    bVar2.a(System.currentTimeMillis() - currentTimeMillis2, cVar);
                }
                z = false;
            } else {
                a(cVar, t2, context, true);
            }
            b bVar3 = com.bytedance.nita.a.f41605b;
            if (bVar3 != null) {
                bVar3.a(System.currentTimeMillis() - currentTimeMillis, cVar, z);
            }
            if (t2 == null) {
                l.a();
            }
            return t2;
        }
        throw new com.bytedance.nita.b.c(str);
    }

    private static void a(c cVar, View view, Context context, boolean z) {
        if (view != null) {
            if (!(context instanceof Activity)) {
                view.getClass().getSimpleName();
            } else if (view.getContext() instanceof com.bytedance.nita.a.a) {
                Context context2 = view.getContext();
                if (context2 != null) {
                    ((com.bytedance.nita.a.a) context2).a(context);
                    Activity activity = (Activity) context;
                    com.bytedance.nita.e.b.a(view, activity);
                    if (cVar != null) {
                        cVar.a(view, activity);
                        return;
                    }
                    return;
                }
                throw new w("null cannot be cast to non-null type");
            }
        }
    }
}
