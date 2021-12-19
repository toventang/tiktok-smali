package com.bytedance.android.livesdk.util.rxutils.autodispose.b;

import com.bytedance.android.livesdk.util.rxutils.autodispose.aa;
import com.bytedance.android.livesdk.util.rxutils.autodispose.q;
import com.bytedance.covode.number.Covode;
import f.a.d.k;
import f.a.e.b.b;
import f.a.e.e.a.d;
import f.a.e.e.e.bi;
import f.a.f;
import f.a.h.a;
import f.a.t;
import java.util.Comparator;

public final class e {

    /* renamed from: a  reason: collision with root package name */
    private static final Comparator<Comparable<Object>> f22143a = h.f22147a;

    static {
        Covode.recordClassIndex(13053);
    }

    public static <E> f a(d<E> dVar) {
        k gVar;
        E d2 = dVar.d();
        a<E> b2 = dVar.b();
        if (d2 != null) {
            try {
                E apply = b2.apply(d2);
                t<E> a2 = dVar.a();
                Comparator<Comparable<Object>> comparator = null;
                if (apply instanceof Comparable) {
                    comparator = f22143a;
                }
                if (comparator != null) {
                    gVar = new f(comparator, apply);
                } else {
                    gVar = new g(apply);
                }
                t<E> f2 = a2.f();
                b.a((Object) gVar, "predicate is null");
                return a.a(new bi(f2, gVar)).d();
            } catch (Exception e2) {
                if (!(e2 instanceof b)) {
                    return f.a.b.a(e2);
                }
                f.a.d.f<? super aa> fVar = q.f22168a;
                if (fVar != null) {
                    try {
                        fVar.accept((b) e2);
                        return a.a(d.f157241a);
                    } catch (Exception e3) {
                        return f.a.b.a(e3);
                    }
                } else {
                    throw e2;
                }
            }
        } else {
            throw new c();
        }
    }
}
