package com.bytedance.disk.core;

import android.content.Context;
import android.os.ConditionVariable;
import com.bytedance.covode.number.Covode;
import com.bytedance.disk.d.a;
import com.bytedance.disk.e.b;
import com.bytedance.disk.e.c;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.util.concurrent.atomic.AtomicBoolean;

public class DiskMigrateServerImpl implements b {

    /* renamed from: a  reason: collision with root package name */
    private static boolean f28540a;

    /* renamed from: b  reason: collision with root package name */
    private static volatile DiskMigrateServerImpl f28541b;

    /* renamed from: c  reason: collision with root package name */
    private Context f28542c;

    /* renamed from: d  reason: collision with root package name */
    private volatile a f28543d;

    /* renamed from: e  reason: collision with root package name */
    private AtomicBoolean f28544e = new AtomicBoolean(false);

    /* renamed from: f  reason: collision with root package name */
    private ConditionVariable f28545f = new ConditionVariable(false);

    /* renamed from: g  reason: collision with root package name */
    private int f28546g = -1;

    /* renamed from: h  reason: collision with root package name */
    private int f28547h = -1;

    /* renamed from: i  reason: collision with root package name */
    private c f28548i = null;

    static {
        Covode.recordClassIndex(16778);
    }

    public static DiskMigrateServerImpl getInstance() {
        if (f28541b == null && f28540a) {
            com.bytedance.disk.h.a.a("DMSI", "DiskMigrateServerImpl not inited!", null, new Object[0]);
        }
        return f28541b;
    }

    public void start() {
        MethodCollector.i(1980);
        if (!this.f28544e.get()) {
            synchronized (this) {
                try {
                    Context context = this.f28542c;
                    int i2 = this.f28546g;
                    int i3 = this.f28547h;
                    c cVar = this.f28548i;
                    if (a.f28556a == null) {
                        synchronized (a.class) {
                            try {
                                if (a.f28556a == null) {
                                    a.f28556a = new a(context, i2, i3, cVar);
                                }
                            } catch (Throwable th) {
                                MethodCollector.o(1980);
                                throw th;
                            }
                        }
                    }
                    if (a.f28556a == null) {
                        com.bytedance.disk.h.a.a("MigManager", "MigrationManager must be init before getInstance!", null, new Object[0]);
                    }
                    this.f28543d = a.f28556a;
                    this.f28544e.set(true);
                    this.f28545f.open();
                } finally {
                    MethodCollector.o(1980);
                }
            }
            return;
        }
        MethodCollector.o(1980);
    }

    private DiskMigrateServerImpl(Context context) {
        this.f28542c = context;
        com.bytedance.disk.e.b.a.a(context);
    }

    @Override // com.bytedance.disk.e.b
    public final String a(String str) {
        if (this.f28543d != null) {
            return this.f28543d.a(str, 2);
        }
        return str;
    }

    public static void init(Context context) {
        MethodCollector.i(1976);
        if (f28541b == null) {
            synchronized (DiskMigrateServerImpl.class) {
                try {
                    if (f28541b == null) {
                        f28541b = new DiskMigrateServerImpl(context);
                    }
                } finally {
                    MethodCollector.o(1976);
                }
            }
            return;
        }
        MethodCollector.o(1976);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0021, code lost:
        if (r11 > 5000) goto L_0x000b;
     */
    @Override // com.bytedance.disk.e.b
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(long r11) {
        /*
            r10 = this;
            r1 = 5000(0x1388, double:2.4703E-320)
            r3 = 0
            int r0 = (r11 > r3 ? 1 : (r11 == r3 ? 0 : -1))
            if (r0 > 0) goto L_0x001f
            r11 = 5000(0x1388, double:2.4703E-320)
        L_0x000a:
            r1 = r11
        L_0x000b:
            long r8 = java.lang.System.currentTimeMillis()
            android.os.ConditionVariable r0 = r10.f28545f
            r0.block(r1)
            com.bytedance.disk.d.a r0 = r10.f28543d
            r6 = 0
            r7 = 0
            java.lang.String r5 = "DMSI"
            if (r0 == 0) goto L_0x002f
            com.bytedance.disk.d.a r0 = r10.f28543d
            goto L_0x0024
        L_0x001f:
            int r0 = (r11 > r1 ? 1 : (r11 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x000a
            goto L_0x000b
        L_0x0024:
            com.bytedance.disk.a.a r0 = r0.f28557b     // Catch:{ Exception -> 0x002a }
            r0.a(r1)     // Catch:{ Exception -> 0x002a }
            goto L_0x0036
        L_0x002a:
            r0 = move-exception
            com.bytedance.disk.d.a.a(r0)
            goto L_0x0036
        L_0x002f:
            java.lang.Object[] r1 = new java.lang.Object[r7]
            java.lang.String r0 = "waitForServiceReady error!"
            com.bytedance.disk.h.a.a(r5, r0, r6, r1)
        L_0x0036:
            long r3 = java.lang.System.currentTimeMillis()
            long r3 = r3 - r8
            r1 = 2000(0x7d0, double:9.88E-321)
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 < 0) goto L_0x0048
            java.lang.Object[] r1 = new java.lang.Object[r7]
            java.lang.String r0 = "waitForServiceReady wait too long time"
            com.bytedance.disk.h.a.a(r5, r0, r6, r1)
        L_0x0048:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.disk.core.DiskMigrateServerImpl.a(long):void");
    }

    @Override // com.bytedance.disk.e.b
    public final int a(String str, String str2) {
        if (this.f28543d != null) {
            return this.f28543d.a(str, str2);
        }
        return -1;
    }

    public void config(int i2, int i3, c cVar) {
        MethodCollector.i(1977);
        synchronized (this) {
            try {
                if (this.f28544e.get()) {
                    if (f28540a) {
                        com.bytedance.disk.h.a.a("DMSI", "service has start! please call this method before start", new Object[0]);
                    }
                    return;
                }
                this.f28546g = i2;
                this.f28547h = i3;
                this.f28548i = cVar;
                com.bytedance.disk.h.a.f28615a = cVar;
                MethodCollector.o(1977);
            } finally {
                MethodCollector.o(1977);
            }
        }
    }
}
