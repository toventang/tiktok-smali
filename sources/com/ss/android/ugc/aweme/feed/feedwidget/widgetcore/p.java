package com.ss.android.ugc.aweme.feed.feedwidget.widgetcore;

import android.os.Handler;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import h.f.b.l;

public final class p {

    /* renamed from: a  reason: collision with root package name */
    public static final p f93149a = new p();

    /* renamed from: b  reason: collision with root package name */
    private static Handler f93150b;

    /* renamed from: c  reason: collision with root package name */
    private static boolean f93151c;

    private p() {
    }

    static {
        Covode.recordClassIndex(59093);
    }

    public final synchronized void a() {
        MethodCollector.i(8658);
        if (!f93151c) {
            f93151c = true;
            f93150b = com.ss.android.ugc.aweme.lego.p.f107614a;
        }
        MethodCollector.o(8658);
    }

    public final p a(r rVar) {
        if (!f93151c) {
            a();
        }
        Handler handler = f93150b;
        if (handler == null) {
            l.a("mWorkHandler");
        }
        handler.post(rVar);
        return this;
    }

    public final p a(r rVar, long j2) {
        if (!f93151c) {
            a();
        }
        Handler handler = f93150b;
        if (handler == null) {
            l.a("mWorkHandler");
        }
        handler.postDelayed(rVar, j2);
        return this;
    }
}
