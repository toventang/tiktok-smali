package com.ss.android.ugc.aweme.i18n.xbridge.d;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.bullet.c.c.i;
import com.bytedance.ies.bullet.c.e.a.b;
import com.bytedance.ies.xbridge.model.b.c;
import h.f.b.l;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    public static final d f100052a = new d();

    private d() {
    }

    static {
        Covode.recordClassIndex(63762);
    }

    public static final i a(c cVar) {
        return (i) a(cVar, i.class);
    }

    public static final <T> T a(c cVar, Class<T> cls) {
        T t;
        l.d(cls, "");
        if (cVar == null) {
            return null;
        }
        b bVar = (b) cVar.a(b.class);
        if (bVar != null && (t = (T) bVar.c(cls)) != null) {
            return t;
        }
        if (cVar != null) {
            return (T) cVar.a(cls);
        }
        return null;
    }
}
