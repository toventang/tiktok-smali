package com.ss.android.ugc.aweme.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.o;
import h.f.b.l;
import java.util.Iterator;

public final class f {

    /* renamed from: a  reason: collision with root package name */
    public static final f f110761a;

    /* renamed from: b  reason: collision with root package name */
    private static String f110762b;

    private f() {
    }

    static {
        Covode.recordClassIndex(71090);
        f fVar = new f();
        f110761a = fVar;
        f110762b = fVar.getClass().getSimpleName();
    }

    public static e a(o oVar, d dVar) {
        l.d(oVar, "");
        l.d(dVar, "");
        try {
            if (oVar.b("hex")) {
                com.google.gson.l c2 = oVar.c("key");
                l.b(c2, "");
                e eVar = new e(c2.c());
                com.google.gson.l c3 = oVar.c("hex");
                l.b(c3, "");
                eVar.f110758a = c3.c();
                return eVar;
            } else if (oVar.b("thumbnail")) {
                com.google.gson.l c4 = oVar.c("key");
                l.b(c4, "");
                e eVar2 = new e(c4.c());
                com.google.gson.l c5 = oVar.j().c("thumbnail");
                l.b(c5, "");
                eVar2.f110759b = c5.c();
                return eVar2;
            } else {
                if (oVar.j().b("gradient")) {
                    com.google.gson.l c6 = oVar.j().c("key");
                    l.b(c6, "");
                    String c7 = c6.c();
                    l.b(c7, "");
                    i iVar = new i(c7);
                    com.google.gson.l c8 = oVar.c("gradient");
                    l.b(c8, "");
                    com.google.gson.l c9 = c8.j().c("direction");
                    l.b(c9, "");
                    iVar.f110768d = c9.g();
                    com.google.gson.l c10 = oVar.c("gradient");
                    l.b(c10, "");
                    com.google.gson.l c11 = c10.j().c("colors");
                    l.b(c11, "");
                    Iterator<com.google.gson.l> it = c11.k().iterator();
                    while (it.hasNext()) {
                        com.google.gson.l next = it.next();
                        e eVar3 = new e(null);
                        l.b(next, "");
                        com.google.gson.l c12 = next.j().c("hex");
                        l.b(c12, "");
                        eVar3.f110758a = c12.c();
                        iVar.f110769e.add(eVar3);
                    }
                    return iVar;
                }
                return null;
            }
        } catch (Exception e2) {
            e2.getMessage();
        }
    }
}
