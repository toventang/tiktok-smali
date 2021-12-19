package com.bytedance.android.livesdk.util.rxutils;

import androidx.fragment.app.Fragment;
import com.bytedance.android.livesdk.util.rxutils.b.b;
import com.bytedance.android.livesdk.util.rxutils.b.c;
import com.bytedance.covode.number.Covode;
import f.a.d.f;
import f.a.d.g;
import f.a.e.j.h;
import f.a.y;

public final class i {

    /* renamed from: a  reason: collision with root package name */
    public static f<Throwable> f22196a = j.f22199a;

    /* renamed from: b  reason: collision with root package name */
    public static f<Object> f22197b = k.f22200a;

    /* renamed from: c  reason: collision with root package name */
    public static final Object f22198c = new Object();

    static {
        Covode.recordClassIndex(13105);
    }

    public static h a(long j2) {
        return new h(j2);
    }

    public static <T> y<T, T> a(Fragment fragment, b bVar) {
        return c.a(fragment.getChildFragmentManager()).a(bVar);
    }

    public static <T, R> R a(g<T, R> gVar, T t) {
        try {
            return gVar.apply(t);
        } catch (Throwable th) {
            throw h.a(th);
        }
    }

    public static <T1, T2, T3, T4, R> R a(f.a.d.i<T1, T2, T3, T4, R> iVar, T4 t4) {
        try {
            return iVar.a(t4);
        } catch (Throwable th) {
            throw h.a(th);
        }
    }

    public static <T, U, R> R a(f.a.d.c<T, U, R> cVar, T t, U u) {
        try {
            return cVar.a(t, u);
        } catch (Throwable th) {
            throw h.a(th);
        }
    }

    public static <T1, T2, T3, R> R a(f.a.d.h<T1, T2, T3, R> hVar, T1 t1, T2 t2, T3 t3) {
        try {
            return hVar.a(t1, t2, t3);
        } catch (Throwable th) {
            throw h.a(th);
        }
    }
}
