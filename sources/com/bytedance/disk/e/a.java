package com.bytedance.disk.e;

import android.content.Context;
import android.os.Build;
import com.bytedance.covode.number.Covode;
import com.bytedance.disk.e.b.c;
import com.bytedance.frameworks.apm.trace.MethodCollector;

public class a {

    /* renamed from: b  reason: collision with root package name */
    public static c f28569b;

    /* renamed from: c  reason: collision with root package name */
    public static final c.a<Void> f28570c = new c.a<>("com.bytedance.disk.core.DiskMigrateServerImpl", "config", new Class[]{Integer.TYPE, Integer.TYPE, c.class});

    /* renamed from: d  reason: collision with root package name */
    public static final c.a<Void> f28571d = new c.a<>("com.bytedance.disk.core.DiskMigrateServerImpl", "start", new Class[0]);

    /* renamed from: e  reason: collision with root package name */
    private static volatile a f28572e;

    /* renamed from: f  reason: collision with root package name */
    private static Context f28573f;

    /* renamed from: g  reason: collision with root package name */
    private static final c.a<Object> f28574g = new c.a<>("com.bytedance.disk.core.DiskMigrateServerImpl", "init", new Class[]{Context.class});

    /* renamed from: h  reason: collision with root package name */
    private static final c.a<b> f28575h = new c.a<>("com.bytedance.disk.core.DiskMigrateServerImpl", "getInstance", new Class[0]);

    /* renamed from: a  reason: collision with root package name */
    public b f28576a;

    private a() {
        int i2 = Build.VERSION.SDK_INT;
        c cVar = f28569b;
        if (cVar != null) {
            cVar.a(6, "DiskMigWrap", "<init> failed", new Exception());
        }
    }

    public static a a() {
        Context context;
        int i2 = Build.VERSION.SDK_INT;
        if (f28572e == null && (context = f28573f) != null) {
            a(context);
        }
        if (f28572e == null) {
            f28572e = new a();
        }
        return f28572e;
    }

    static {
        Covode.recordClassIndex(16785);
    }

    public final void a(long j2) {
        b bVar = this.f28576a;
        if (bVar != null) {
            bVar.a(j2);
        }
    }

    private a(Context context) {
        c cVar;
        com.bytedance.disk.e.b.a.a(context);
        f28574g.a(null, new Object[]{context});
        b a2 = f28575h.a(null, new Object[0]);
        this.f28576a = a2;
        if (a2 == null && (cVar = f28569b) != null) {
            cVar.a(6, "DiskMigWrap", "<init> failed", null);
        }
    }

    public static void a(Context context) {
        MethodCollector.i(11089);
        if (f28572e == null) {
            int i2 = Build.VERSION.SDK_INT;
            synchronized (a.class) {
                try {
                    if (f28572e == null) {
                        Context context2 = f28573f;
                        if (context2 != null) {
                            context = context2;
                        }
                        f28572e = new a(context);
                    }
                } finally {
                    MethodCollector.o(11089);
                }
            }
            return;
        }
        MethodCollector.o(11089);
    }

    public static void a(Context context, c cVar) {
        f28573f = context;
        f28569b = cVar;
    }
}
