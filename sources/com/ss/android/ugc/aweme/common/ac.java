package com.ss.android.ugc.aweme.common;

import com.bytedance.covode.number.Covode;
import f.a.v;
import h.f.b.l;

public final class ac {
    static {
        Covode.recordClassIndex(47140);
    }

    private static <T> void a(v<T> vVar) {
        l.d(vVar, "");
        if (!vVar.isDisposed()) {
            vVar.a();
        }
    }

    private static <T> void b(v<T> vVar, T t) {
        l.d(vVar, "");
        if (!vVar.isDisposed()) {
            vVar.a((Object) t);
        }
    }

    public static final <T> void a(v<T> vVar, T t) {
        l.d(vVar, "");
        b(vVar, t);
        a(vVar);
    }

    public static final <T> void a(v<T> vVar, Throwable th) {
        l.d(vVar, "");
        l.d(th, "");
        if (!vVar.isDisposed()) {
            vVar.a(th);
        }
    }
}
