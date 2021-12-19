package com.ss.android.ugc.aweme.dmt_integration.typeadapter;

import com.bytedance.covode.number.Covode;
import com.google.gson.i;
import com.google.gson.o;
import com.google.gson.r;
import h.f.b.l;

public final class a {
    static {
        Covode.recordClassIndex(51717);
    }

    public static final void b(o oVar, String str) {
        l.d(oVar, "");
        l.d(str, "");
        com.google.gson.l c2 = oVar.c(str);
        if (c2 != null && !(c2 instanceof r)) {
            oVar.a(str);
            oVar.a(str, c2.j().c("path"));
        }
    }

    public static final void a(o oVar, String str) {
        l.d(oVar, "");
        l.d(str, "");
        i e2 = oVar.e(str);
        if (e2 != null) {
            if (e2.a() > 0) {
                com.google.gson.l a2 = e2.a(0);
                l.b(a2, "");
                if (!(a2 instanceof r)) {
                    i iVar = new i();
                    int a3 = e2.a();
                    for (int i2 = 0; i2 < a3; i2++) {
                        com.google.gson.l a4 = e2.a(i2);
                        l.b(a4, "");
                        com.google.gson.l c2 = a4.j().c("path");
                        l.b(c2, "");
                        iVar.a(c2.c());
                    }
                    oVar.a(str);
                    oVar.a(str, iVar);
                }
            }
        }
    }

    public static final void b(o oVar, String str, String str2) {
        l.d(oVar, "");
        l.d(str, "");
        l.d(str2, "");
        com.google.gson.l c2 = oVar.c(str2);
        if (c2 != null) {
            oVar.a(str);
            oVar.a(str2);
            oVar.a(str, c2.j().c("path"));
        }
    }

    public static final void a(o oVar, String str, String str2) {
        l.d(oVar, "");
        l.d(str, "");
        l.d(str2, "");
        i e2 = oVar.e(str2);
        if (e2 != null) {
            if (e2.a() > 0) {
                com.google.gson.l a2 = e2.a(0);
                l.b(a2, "");
                if (!(a2 instanceof r)) {
                    i iVar = new i();
                    int a3 = e2.a();
                    for (int i2 = 0; i2 < a3; i2++) {
                        com.google.gson.l a4 = e2.a(i2);
                        l.b(a4, "");
                        com.google.gson.l c2 = a4.j().c("path");
                        l.b(c2, "");
                        iVar.a(c2.c());
                    }
                    oVar.a(str);
                    oVar.a(str2);
                    oVar.a(str, iVar);
                }
            }
        }
    }
}
