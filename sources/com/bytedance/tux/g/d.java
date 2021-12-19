package com.bytedance.tux.g;

import android.app.Activity;
import com.bytedance.covode.number.Covode;
import h.f.b.l;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    public static final d f45076a = new d();

    /* renamed from: b  reason: collision with root package name */
    private static final Map<Integer, c> f45077b = new LinkedHashMap();

    /* renamed from: c  reason: collision with root package name */
    private static final Set<WeakReference<a>> f45078c = new LinkedHashSet();

    private d() {
    }

    static {
        Covode.recordClassIndex(27496);
    }

    public static void a(a aVar) {
        l.c(aVar, "");
        f45078c.add(new WeakReference<>(aVar));
        c a2 = aVar.a();
        f45077b.put(Integer.valueOf(a2.f45075i), a2);
    }

    public static void b(Activity activity) {
        l.c(activity, "");
        Iterator<T> it = f45078c.iterator();
        while (it.hasNext()) {
            a aVar = (a) it.next().get();
            if (aVar != null) {
                aVar.a().f45073g = false;
                aVar.dismiss();
            }
        }
        f45078c.clear();
    }

    public static void a(Activity activity) {
        l.c(activity, "");
        Iterator<Map.Entry<Integer, c>> it = f45077b.entrySet().iterator();
        while (it.hasNext()) {
            c value = it.next().getValue();
            long currentTimeMillis = System.currentTimeMillis();
            Long l2 = value.f45067a;
            if (l2 != null) {
                long longValue = l2.longValue();
                if (longValue > 0 && currentTimeMillis < longValue) {
                    c cVar = new c(value.f45067a, value.f45068b, value.f45069c, value.f45070d, longValue - currentTimeMillis, false, value.f45073g, value.f45074h, value.f45075i);
                    b bVar = new b(activity);
                    l.c(cVar, "");
                    bVar.f45063a = cVar;
                    bVar.b();
                }
            }
            it.remove();
        }
    }
}
