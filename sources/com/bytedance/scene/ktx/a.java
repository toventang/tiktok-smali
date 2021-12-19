package com.bytedance.scene.ktx;

import com.bytedance.covode.number.Covode;
import com.bytedance.scene.group.b;
import com.bytedance.scene.j;
import h.f.b.l;

public final class a {
    static {
        Covode.recordClassIndex(26328);
    }

    public static final void b(b bVar, String str) {
        l.c(bVar, "");
        l.c(str, "");
        j a2 = bVar.a(str);
        if (a2 != null) {
            bVar.d(a2);
        }
    }

    public static final void a(b bVar, String str) {
        l.c(bVar, "");
        l.c(str, "");
        j a2 = bVar.a(str);
        if (a2 != null) {
            bVar.e(a2);
        }
    }

    public static final void a(b bVar, int i2, j jVar, String str) {
        l.c(bVar, "");
        l.c(jVar, "");
        l.c(str, "");
        bVar.ci_();
        bVar.a(i2, jVar, str);
        bVar.d(jVar);
        bVar.C();
    }
}
