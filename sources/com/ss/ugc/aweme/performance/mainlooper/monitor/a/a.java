package com.ss.ugc.aweme.performance.mainlooper.monitor.a;

import android.app.Activity;
import android.view.View;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.ugc.aweme.performance.core.monitor.b.b;
import com.ss.ugc.aweme.performance.mainlooper.monitor.work.a;
import h.f.b.l;
import java.util.Iterator;

public final class a implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public String f153387a;

    /* renamed from: b  reason: collision with root package name */
    public String f153388b;

    static {
        Covode.recordClassIndex(101827);
    }

    public /* synthetic */ a() {
        this("");
    }

    public final void run() {
        MethodCollector.i(9487);
        com.ss.ugc.aweme.performance.mainlooper.monitor.work.a a2 = a.C4081a.a();
        String str = this.f153388b;
        l.c(str, "");
        b bVar = a2.f153371a.get(str);
        if (bVar == null) {
            com.ss.ugc.aweme.performance.mainlooper.a.a.f153384a.a(this);
            MethodCollector.o(9487);
            return;
        }
        StringBuilder sb = new StringBuilder();
        if (a.C4081a.a().f153374d) {
            Activity activity = com.ss.ugc.aweme.performance.core.monitor.c.a.f153364a.get();
            if (activity != null) {
                StringBuilder append = sb.append("\nlayer info : \n");
                View decorView = activity.getWindow().getDecorView();
                l.a((Object) decorView, "");
                l.c(decorView, "");
                append.append((String) null).append("\n");
            }
            synchronized (com.ss.android.ugc.aweme.performance.a.a.f114769b) {
                try {
                    Iterator<T> it = com.ss.android.ugc.aweme.performance.a.a.f114768a.iterator();
                    while (it.hasNext()) {
                        sb.append("draw leak stack：\n").append((String) it.next()).append("\n");
                    }
                    com.ss.android.ugc.aweme.performance.a.a.f114768a.clear();
                } catch (Throwable th) {
                    MethodCollector.o(9487);
                    throw th;
                }
            }
            String sb2 = sb.toString();
            l.a((Object) sb2, "");
            bVar.f153357i = sb2;
        }
        com.ss.ugc.aweme.performance.mainlooper.a.a.f153384a.a(this);
        MethodCollector.o(9487);
    }

    private a(String str) {
        l.c(str, "");
        this.f153388b = str;
        this.f153387a = "";
    }
}
