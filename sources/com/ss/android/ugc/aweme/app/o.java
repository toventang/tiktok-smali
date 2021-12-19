package com.ss.android.ugc.aweme.app;

import android.app.Application;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.ugc.appcontext.g;
import com.ss.android.ugc.aweme.h;
import com.ss.android.ugc.aweme.i.a;
import com.ss.android.ugc.aweme.i.b;
import com.ss.android.ugc.aweme.lego.d;
import com.ss.android.ugc.aweme.utils.permission.c;

public class o {

    /* renamed from: b  reason: collision with root package name */
    private static o f66860b;

    /* renamed from: a  reason: collision with root package name */
    public h f66861a;

    static {
        Covode.recordClassIndex(41170);
    }

    public static o a() {
        MethodCollector.i(3468);
        if (f66860b == null) {
            synchronized (o.class) {
                try {
                    if (f66860b == null) {
                        f66860b = new o();
                    }
                } catch (Throwable th) {
                    MethodCollector.o(3468);
                    throw th;
                }
            }
        }
        o oVar = f66860b;
        MethodCollector.o(3468);
        return oVar;
    }

    private o() {
        Application a2 = g.a();
        if (a2 != null) {
            this.f66861a = new h(a2);
            com.ss.android.ugc.aweme.cw.g.b().execute(new b(a.c()));
            if (!d.d()) {
                a.c().a(c.c());
            }
            a.c().a(com.ss.android.ugc.aweme.main.d.b.f109235b);
            this.f66861a.f99091d = a.c();
            this.f66861a.f99092e = com.ss.android.ugc.aweme.splash.a.f134677a;
        }
    }
}
