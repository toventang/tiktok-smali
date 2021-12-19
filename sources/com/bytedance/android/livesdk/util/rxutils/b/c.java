package com.bytedance.android.livesdk.util.rxutils.b;

import androidx.fragment.app.i;
import androidx.fragment.app.n;
import com.bytedance.android.livesdk.util.rxutils.b.a.b;
import com.bytedance.covode.number.Covode;
import f.a.t;
import f.a.y;
import java.util.Objects;

public final class c<V> {

    /* renamed from: a  reason: collision with root package name */
    private final t<V> f22188a;

    static {
        Covode.recordClassIndex(13097);
    }

    private c(t<V> tVar) {
        this.f22188a = tVar;
    }

    private static <T> c<T> a(t<T> tVar) {
        return new c<>(tVar);
    }

    public final <T> y<T, T> a(V v) {
        a(v, "event == null");
        return new b(this.f22188a, v);
    }

    public static c<b> a(i iVar) {
        a aVar = (a) iVar.a("_LIFECYCLE_BINDING_FRAGMENT_");
        if (aVar == null) {
            aVar = new a();
            n a2 = iVar.a();
            a2.a(aVar, "_LIFECYCLE_BINDING_FRAGMENT_");
            a2.c();
        } else if (aVar.isDetached()) {
            n a3 = iVar.a();
            a3.e(aVar);
            a3.c();
        }
        return a((t) aVar.f22183a);
    }

    private static <T> T a(T t, String str) {
        Objects.requireNonNull(t, str);
        return t;
    }
}
