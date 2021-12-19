package com.bytedance.lynx.hybrid.j;

import com.bytedance.covode.number.Covode;
import h.f.b.l;
import h.q;
import h.r;
import h.z;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    public static a f41011a;

    /* renamed from: b  reason: collision with root package name */
    public static final c f41012b = new c();

    private c() {
    }

    static {
        Covode.recordClassIndex(25123);
    }

    public static void a(String str, b bVar, String str2) {
        int i2;
        l.c(str, "");
        l.c(bVar, "");
        l.c(str2, "");
        try {
            a aVar = f41011a;
            if (aVar == null) {
                int i3 = d.f41013a[bVar.ordinal()];
                i2 = 0;
            } else {
                aVar.a(str, bVar, e.f41014a + '_' + str2);
                i2 = z.f158842a;
            }
            q.m223constructorimpl(i2);
        } catch (Throwable th) {
            q.m223constructorimpl(r.a(th));
        }
    }

    private static void a(Throwable th, String str, String str2) {
        int i2;
        l.c(th, "");
        l.c(str, "");
        l.c(str2, "");
        try {
            a aVar = f41011a;
            if (aVar == null) {
                th.getMessage();
                i2 = 0;
            } else {
                aVar.a(th, str, e.f41014a + '_' + str2);
                i2 = z.f158842a;
            }
            q.m223constructorimpl(i2);
        } catch (Throwable th2) {
            q.m223constructorimpl(r.a(th2));
        }
    }

    public static /* synthetic */ void a(String str, b bVar, String str2, int i2) {
        if ((i2 & 2) != 0) {
            bVar = b.I;
        }
        if ((i2 & 4) != 0) {
            str2 = "";
        }
        a(str, bVar, str2);
    }

    public static /* synthetic */ void a(Throwable th, String str, String str2, int i2) {
        if ((i2 & 2) != 0) {
            str = "";
        }
        if ((i2 & 4) != 0) {
            str2 = e.f41014a;
        }
        a(th, str, str2);
    }
}
