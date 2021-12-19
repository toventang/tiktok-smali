package com.ss.android.ugc.aweme.feed.p.a;

import com.bytedance.covode.number.Covode;
import h.f.a.a;
import h.f.b.l;

public final class c {
    static {
        Covode.recordClassIndex(59582);
    }

    public static final <T> T a(b bVar, a<? extends T> aVar) {
        l.d(aVar, "");
        if (bVar != null) {
            try {
                bVar.a();
            } catch (Throwable th) {
                if (th instanceof d) {
                    throw th.getRealThrowable();
                }
                throw th;
            }
        }
        T t = (T) aVar.invoke();
        if (bVar != null) {
            bVar.b();
        }
        return t;
    }
}
