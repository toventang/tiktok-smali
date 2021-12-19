package com.bytedance.android.livesdk.utils.b;

import com.bytedance.covode.number.Covode;
import f.a.d.g;
import f.a.e.e.b.x;
import f.a.h;
import org.a.b;

public final class a<T> {

    /* renamed from: a  reason: collision with root package name */
    private h<T> f22248a;

    static {
        Covode.recordClassIndex(13141);
    }

    private a(h<T> hVar) {
        this.f22248a = hVar;
    }

    public static <T> a<T> a(h<T> hVar) {
        return new a<>(hVar);
    }

    public final h<T> a(g<? super h<Throwable>, ? extends b<?>> gVar) {
        f.a.e.b.b.a((Object) gVar, "handler is null");
        return f.a.h.a.a(new x(this.f22248a, gVar));
    }
}
