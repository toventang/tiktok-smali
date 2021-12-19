package com.twitter.sdk.android.core;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.ugc.appcontext.d;
import com.ss.android.common.applog.AppLog;
import com.ss.android.ugc.aweme.share.t;
import com.ss.android.ugc.aweme.share.u;
import com.twitter.sdk.android.core.internal.a;
import com.twitter.sdk.android.core.internal.g;
import com.twitter.sdk.android.core.internal.i;
import com.twitter.sdk.android.core.internal.l;
import com.twitter.sdk.android.core.o;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public final class k {

    /* renamed from: a  reason: collision with root package name */
    static final f f156137a = new c();

    /* renamed from: b  reason: collision with root package name */
    static volatile k f156138b;

    /* renamed from: c  reason: collision with root package name */
    final Context f156139c;

    /* renamed from: d  reason: collision with root package name */
    public final l f156140d;

    /* renamed from: e  reason: collision with root package name */
    public final ExecutorService f156141e;

    /* renamed from: f  reason: collision with root package name */
    public final TwitterAuthConfig f156142f;

    /* renamed from: g  reason: collision with root package name */
    public final a f156143g;

    /* renamed from: h  reason: collision with root package name */
    private final f f156144h;

    /* renamed from: i  reason: collision with root package name */
    private final boolean f156145i;

    static {
        Covode.recordClassIndex(103708);
    }

    public static boolean b() {
        if (f156138b == null) {
            return false;
        }
        return f156138b.f156145i;
    }

    public static f c() {
        if (f156138b == null) {
            return f156137a;
        }
        return f156138b.f156144h;
    }

    public static k a() {
        try {
            t tVar = new t("YYWjeT5eJGnfiErKfxYxYAXHq", "w981H5bEdxghiDenDVAu2dTutdsQsh71LU0w4sLmVO8UMdbe6Q", "be57ee08-231d-4622-9cad-4e0792363934", "musically", AppLog.getInstallId());
            Context a2 = d.a();
            h.f.b.l.d(a2, "");
            h.f.b.l.d(tVar, "");
            u.f124371a = tVar;
            o.a aVar = new o.a(a2);
            aVar.f156168a = new TwitterAuthConfig(tVar.f124366a, tVar.f124367b);
            a(aVar.a());
            if (f156138b != null) {
                return f156138b;
            }
            throw new IllegalStateException("Must initialize Twitter before using getInstance()");
        } catch (Exception unused) {
        }
    }

    public static synchronized k a(o oVar) {
        synchronized (k.class) {
            MethodCollector.i(13972);
            if (f156138b == null) {
                k kVar = new k(oVar);
                f156138b = kVar;
                MethodCollector.o(13972);
                return kVar;
            }
            k kVar2 = f156138b;
            MethodCollector.o(13972);
            return kVar2;
        }
    }

    private k(o oVar) {
        Context context = oVar.f156163a;
        this.f156139c = context;
        this.f156140d = new l(context);
        this.f156143g = new a(context);
        if (oVar.f156165c == null) {
            this.f156142f = new TwitterAuthConfig(g.a(context, "com.twitter.sdk.android.CONSUMER_KEY", ""), g.a(context, "com.twitter.sdk.android.CONSUMER_SECRET", ""));
        } else {
            this.f156142f = oVar.f156165c;
        }
        if (oVar.f156166d == null) {
            ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(i.f155966a, i.f155967b, 1, TimeUnit.SECONDS, new LinkedBlockingQueue(), i.a("twitter-worker"));
            i.a("twitter-worker", threadPoolExecutor);
            this.f156141e = threadPoolExecutor;
        } else {
            this.f156141e = oVar.f156166d;
        }
        if (oVar.f156164b == null) {
            this.f156144h = f156137a;
        } else {
            this.f156144h = oVar.f156164b;
        }
        if (oVar.f156167e == null) {
            this.f156145i = false;
        } else {
            this.f156145i = oVar.f156167e.booleanValue();
        }
    }
}
