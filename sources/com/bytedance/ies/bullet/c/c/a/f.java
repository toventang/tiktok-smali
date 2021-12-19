package com.bytedance.ies.bullet.c.c.a;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.bullet.c.c.a.r;
import h.f.b.l;

public final class f {
    static {
        Covode.recordClassIndex(18729);
    }

    public static final class a implements r.a<OUTPUT> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ r.a f32008a;

        static {
            Covode.recordClassIndex(18730);
        }

        a(r.a aVar) {
            this.f32008a = aVar;
        }
    }

    public static final <INPUT, OUTPUT> void a(r<INPUT, OUTPUT> rVar, Object obj, r.a<?> aVar) {
        l.c(rVar, "");
        l.c(obj, "");
        l.c(aVar, "");
        if (aVar != null) {
            new a(aVar);
        }
    }
}
