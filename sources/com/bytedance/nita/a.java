package com.bytedance.nita;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.nita.api.b;
import com.bytedance.nita.api.c;
import com.bytedance.nita.d.e;
import com.bytedance.nita.f.d;
import h.f.b.l;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static Context f41604a;

    /* renamed from: b  reason: collision with root package name */
    public static b f41605b;

    /* renamed from: c  reason: collision with root package name */
    public static final a f41606c = new a();

    private a() {
    }

    static {
        Covode.recordClassIndex(25454);
    }

    public static Context a() {
        Context context = f41604a;
        if (context == null) {
            l.a("context");
        }
        return context;
    }

    public final a a(c cVar) {
        l.c(cVar, "");
        d.f41670b.a(cVar);
        return this;
    }

    public final a a(String str, int i2, Context context) {
        l.c(str, "");
        l.c(str, "");
        c cVar = d.f41669a.get(str);
        if (cVar != null) {
            if (context == null) {
                if (cVar.e() != 0) {
                    context = new com.bytedance.nita.a.a(a(), cVar.e());
                } else {
                    context = new com.bytedance.nita.a.a(a());
                }
            }
            l.c(cVar, "");
            com.bytedance.nita.d.d dVar = e.f41646a.get(cVar.c());
            if (dVar == null) {
                l.a();
            }
            dVar.a(cVar, context, i2);
            return this;
        }
        throw new com.bytedance.nita.b.c(str);
    }
}
