package com.bytedance.ies.ugc.statisticlogger.config;

import android.app.Application;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.ugc.appcontext.d;
import com.bytedance.ies.ugc.statisticlogger.g;
import com.ss.android.common.applog.AppLog;
import com.ss.android.common.util.f;
import com.ss.android.i.a;
import com.ss.android.i.c;
import com.ss.android.i.d;
import com.ss.android.i.e;
import com.ss.android.ugc.aweme.lego.ab;
import com.ss.android.ugc.aweme.lego.ad;
import com.ss.android.ugc.aweme.lego.ae;
import com.ss.android.ugc.aweme.lego.p;
import com.ss.android.ugc.aweme.lego.w;
import com.ss.android.ugc.aweme.lego.x;
import h.f.b.l;
import java.util.LinkedList;
import java.util.List;

public final class LazyLoadLegoTask implements w {

    /* renamed from: a  reason: collision with root package name */
    public final Application f35333a;

    static {
        Covode.recordClassIndex(21153);
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final int bK_() {
        return 1048575;
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final ad f() {
        return x.a(this);
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final String g() {
        return "task_";
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final boolean i() {
        return true;
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final List j() {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.lego.w
    public final ae b() {
        return ae.BACKGROUND;
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final ab k() {
        return ab.DEFAULT;
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final String h() {
        return getClass().getSimpleName();
    }

    public LazyLoadLegoTask(Application application) {
        l.d(application, "");
        this.f35333a = application;
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final void a(Context context) {
        LinkedList linkedList;
        MethodCollector.i(7533);
        l.d(context, "");
        a.b bVar = new a.b();
        String str = d.o;
        String str2 = d.p;
        bVar.f59553a = str;
        bVar.f59554b = str2;
        bVar.f59556d = d.s;
        bVar.f59555c = a.EnumC1297a.RELEASE;
        bVar.f59557e = AppLog.getServerDeviceId();
        bVar.f59559g = d.f();
        bVar.f59560h = (int) d.e();
        bVar.f59561i = d.n;
        a aVar = new a();
        if (!TextUtils.isEmpty(bVar.f59553a)) {
            aVar.f59542a = bVar.f59553a;
        }
        if (!TextUtils.isEmpty(bVar.f59554b)) {
            aVar.f59543b = bVar.f59554b;
        }
        if (bVar.f59555c != null) {
            aVar.f59544c = bVar.f59555c;
        }
        if (!TextUtils.isEmpty(bVar.f59556d)) {
            aVar.f59545d = bVar.f59556d;
        }
        if (!TextUtils.isEmpty(bVar.f59557e)) {
            aVar.f59546e = bVar.f59557e;
        }
        if (!TextUtils.isEmpty(bVar.f59558f)) {
            aVar.f59551j = bVar.f59558f;
        }
        if (!TextUtils.isEmpty(bVar.f59559g)) {
            aVar.f59547f = bVar.f59559g;
        }
        if (bVar.f59560h != 0) {
            aVar.f59548g = bVar.f59560h;
        }
        aVar.f59550i = bVar.f59562j;
        aVar.f59549h = bVar.f59561i;
        l.b(aVar, "");
        Application application = this.f35333a;
        boolean a2 = f.a(context);
        com.ss.android.i.d dVar = d.a.f59589a;
        dVar.f59585f = application;
        dVar.f59586g = aVar;
        com.ss.android.i.a.a aVar2 = new com.ss.android.i.a.a();
        String a3 = aVar2.a();
        if (!TextUtils.isEmpty(a3) && a2) {
            if (!(dVar.f59585f == null || dVar.f59586g == null)) {
                aVar2.a(dVar.f59585f, dVar.f59586g);
            }
            dVar.f59581a.put(a3, aVar2);
        }
        if (com.bytedance.ies.ugc.statisticlogger.b.a.b()) {
            dVar.f59583c.set(true);
            if (dVar.f59582b.get() && !dVar.f59584e.isEmpty()) {
                synchronized (dVar.f59584e) {
                    try {
                        linkedList = new LinkedList(dVar.f59584e);
                        dVar.f59584e.clear();
                        com.ss.android.i.d.f59580d.clear();
                    } catch (Throwable th) {
                        MethodCollector.o(7533);
                        throw th;
                    }
                }
                long j2 = 0;
                while (!linkedList.isEmpty()) {
                    j2 += 100;
                    c cVar = (c) linkedList.poll();
                    if (com.bytedance.ies.ugc.statisticlogger.b.a.c()) {
                        p.f107614a.postDelayed(new e(dVar, cVar), j2);
                    } else {
                        dVar.a(cVar);
                    }
                }
            }
            p.f107614a.postDelayed(new Runnable() {
                /* class com.ss.android.i.d.AnonymousClass1 */

                static {
                    Covode.recordClassIndex(36780);
                }

                public final void run() {
                    d.this.f59582b.set(true);
                    d.this.a();
                }
            }, 5000);
        } else {
            dVar.f59582b.set(true);
            dVar.a();
        }
        com.bytedance.ies.ugc.statisticlogger.f.f35349a = true;
        new Handler(Looper.getMainLooper()).postAtFrontOfQueue(g.f35351a);
        MethodCollector.o(7533);
    }
}
