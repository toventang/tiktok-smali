package com.bytedance.ies.bullet.c.c.a;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.bullet.c.c.a.q;
import h.f.a.b;
import h.f.a.m;
import h.f.b.l;
import h.z;
import java.util.List;
import java.util.Map;

public interface n extends com.bytedance.ies.bullet.c.e.a {
    static {
        Covode.recordClassIndex(18752);
    }

    void a(n nVar, boolean z);

    void a(m<? super List<? extends n>, ? super q, z> mVar);

    void a(List<String> list, Object obj, q.a aVar, b<? super Throwable, z> bVar);

    String b();

    Map<String, n> c();

    Map<String, q> d();

    public static final class a extends Exception {
        static {
            Covode.recordClassIndex(18753);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(String str) {
            super(str + " not found");
            l.c(str, "");
        }
    }
}
