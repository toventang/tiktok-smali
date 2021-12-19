package com.bytedance.ies.powerlist;

import android.app.Application;
import android.widget.Space;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.aweme.services.PowerContextImpl;
import h.f.b.l;
import h.f.b.m;
import h.h;
import h.i;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    public static Space f34260a;

    /* renamed from: b  reason: collision with root package name */
    public static final c f34261b = new c();

    /* renamed from: c  reason: collision with root package name */
    private static Application f34262c;

    /* renamed from: d  reason: collision with root package name */
    private static boolean f34263d;

    /* renamed from: e  reason: collision with root package name */
    private static final h f34264e = i.a((h.f.a.a) a.f34265a);

    public static com.bytedance.ies.powerlist.optimize.a.a a() {
        return (com.bytedance.ies.powerlist.optimize.a.a) f34264e.getValue();
    }

    private c() {
    }

    static final class a extends m implements h.f.a.a<com.bytedance.ies.powerlist.optimize.a.a> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f34265a = new a();

        static {
            Covode.recordClassIndex(20474);
        }

        a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ com.bytedance.ies.powerlist.optimize.a.a invoke() {
            return new com.bytedance.ies.powerlist.optimize.a.a();
        }
    }

    static {
        Covode.recordClassIndex(20473);
    }

    public final Application b() {
        MethodCollector.i(671);
        Application application = f34262c;
        if (application == null) {
            l.a("app");
        }
        if (application == null && !f34263d) {
            synchronized (this) {
                try {
                    if (!f34263d) {
                        IPowerContext createIPowerContextbyMonsterPlugin = PowerContextImpl.createIPowerContextbyMonsterPlugin(false);
                        l.a((Object) createIPowerContextbyMonsterPlugin, "");
                        Application application2 = createIPowerContextbyMonsterPlugin.getApplication();
                        if (application2 != null) {
                            a(application2);
                        }
                        f34263d = true;
                    }
                } catch (Throwable th) {
                    MethodCollector.o(671);
                    throw th;
                }
            }
        }
        Application application3 = f34262c;
        if (application3 == null) {
            l.a("app");
        }
        MethodCollector.o(671);
        return application3;
    }

    public static void a(Application application) {
        MethodCollector.i(664);
        l.c(application, "");
        f34260a = new Space(application);
        f34262c = application;
        MethodCollector.o(664);
    }
}
