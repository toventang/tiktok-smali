package com.bytedance.ies.android.base.runtime;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.android.base.runtime.a.c;
import com.bytedance.ies.android.base.runtime.depend.IAdThirdTrackerDepend;
import com.bytedance.ies.android.base.runtime.depend.IAppLogDepend;
import com.bytedance.ies.android.base.runtime.depend.IHostContextDepend;
import com.bytedance.ies.android.base.runtime.depend.IHostRouterDepend;
import com.bytedance.ies.android.base.runtime.depend.IHostStyleUIDepend;
import com.bytedance.ies.android.base.runtime.depend.IMonitorDepend;
import com.bytedance.ies.android.base.runtime.depend.IPermissionDepend;
import com.bytedance.ies.android.base.runtime.depend.IPointDepend;
import com.bytedance.ies.android.base.runtime.depend.IThreadPoolExecutorDepend;
import com.bytedance.ies.android.base.runtime.depend.IUserDepend;
import h.f.b.l;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static IAppLogDepend f31872a;

    /* renamed from: b  reason: collision with root package name */
    public static IMonitorDepend f31873b;

    /* renamed from: c  reason: collision with root package name */
    public static IHostContextDepend f31874c;

    /* renamed from: d  reason: collision with root package name */
    public static IThreadPoolExecutorDepend f31875d;

    /* renamed from: e  reason: collision with root package name */
    public static final a f31876e = new a();

    /* renamed from: f  reason: collision with root package name */
    private static IHostStyleUIDepend f31877f;

    /* renamed from: g  reason: collision with root package name */
    private static IAdThirdTrackerDepend f31878g;

    /* renamed from: h  reason: collision with root package name */
    private static IHostRouterDepend f31879h;

    /* renamed from: i  reason: collision with root package name */
    private static IPermissionDepend f31880i;

    /* renamed from: j  reason: collision with root package name */
    private static IPointDepend f31881j;

    /* renamed from: k  reason: collision with root package name */
    private static IUserDepend f31882k;

    /* renamed from: l  reason: collision with root package name */
    private static volatile boolean f31883l;

    private a() {
    }

    static {
        Covode.recordClassIndex(18640);
    }

    public final synchronized void a(b bVar) {
        MethodCollector.i(1229);
        l.c(bVar, "");
        if (f31883l) {
            MethodCollector.o(1229);
            return;
        }
        f31872a = bVar.f31904b;
        f31873b = bVar.f31905c;
        f31874c = bVar.f31903a;
        f31877f = bVar.f31908f;
        f31875d = bVar.f31906d;
        f31878g = bVar.f31909g;
        f31879h = bVar.f31910h;
        f31880i = bVar.f31911i;
        f31881j = bVar.f31912j;
        f31882k = bVar.f31913k;
        c.f31884l = bVar.f31907e;
        f31883l = true;
        MethodCollector.o(1229);
    }
}
