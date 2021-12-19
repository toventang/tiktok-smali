package com.google.ar.core;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.ServiceConnection;
import android.content.pm.PackageInstaller;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.sysoptimizer.ReceiverRegisterCrashOptimizer;
import com.google.a.b.a.a.a.a;
import com.google.a.b.a.a.a.b;
import com.google.ar.core.ArCoreApk;
import com.google.ar.core.exceptions.FatalException;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.Queue;

/* access modifiers changed from: package-private */
public final class ak {

    /* renamed from: a  reason: collision with root package name */
    b f53414a;

    /* renamed from: b  reason: collision with root package name */
    BroadcastReceiver f53415b;

    /* renamed from: c  reason: collision with root package name */
    Context f53416c;

    /* renamed from: d  reason: collision with root package name */
    PackageInstaller f53417d;

    /* renamed from: e  reason: collision with root package name */
    PackageInstaller.SessionCallback f53418e;

    /* renamed from: f  reason: collision with root package name */
    private final Queue f53419f;

    /* renamed from: g  reason: collision with root package name */
    private Context f53420g;

    /* renamed from: h  reason: collision with root package name */
    private final ServiceConnection f53421h;

    /* renamed from: i  reason: collision with root package name */
    private volatile int f53422i;

    static {
        Covode.recordClassIndex(33061);
    }

    ak() {
    }

    static /* synthetic */ Bundle c() {
        Bundle bundle = new Bundle();
        bundle.putCharSequence("package.name", "com.google.ar.core");
        return bundle;
    }

    /* access modifiers changed from: package-private */
    public final synchronized void b() {
        MethodCollector.i(12137);
        this.f53422i = 1;
        this.f53414a = null;
        MethodCollector.o(12137);
    }

    public final synchronized void a() {
        MethodCollector.i(11990);
        int i2 = this.f53422i;
        int i3 = i2 - 1;
        if (i2 != 0) {
            if (i3 == 1 || i3 == 2) {
                this.f53420g.unbindService(this.f53421h);
                this.f53420g = null;
                this.f53422i = 1;
            }
            BroadcastReceiver broadcastReceiver = this.f53415b;
            if (broadcastReceiver != null) {
                this.f53416c.unregisterReceiver(broadcastReceiver);
            }
            PackageInstaller.SessionCallback sessionCallback = this.f53418e;
            if (sessionCallback != null) {
                this.f53417d.unregisterSessionCallback(sessionCallback);
                this.f53418e = null;
                MethodCollector.o(11990);
                return;
            }
            MethodCollector.o(11990);
            return;
        }
        MethodCollector.o(11990);
        throw null;
    }

    ak(byte b2) {
        this();
        this.f53419f = new ArrayDeque();
        this.f53422i = 1;
        this.f53421h = new al(this);
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0036  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0039  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void a(android.content.Context r6) {
        /*
            r5 = this;
            monitor-enter(r5)
            r4 = 11988(0x2ed4, float:1.6799E-41)
            com.bytedance.frameworks.apm.trace.MethodCollector.i(r4)     // Catch:{ all -> 0x0048 }
            r5.f53420g = r6     // Catch:{ all -> 0x0048 }
            android.content.Intent r1 = new android.content.Intent     // Catch:{ all -> 0x0048 }
            java.lang.String r0 = "com.google.android.play.core.install.BIND_INSTALL_SERVICE"
            r1.<init>(r0)     // Catch:{ all -> 0x0048 }
            java.lang.String r0 = "com.android.vending"
            android.content.Intent r3 = r1.setPackage(r0)     // Catch:{ all -> 0x0048 }
            android.content.ServiceConnection r2 = r5.f53421h     // Catch:{ all -> 0x0048 }
            r1 = 1
            if (r6 == 0) goto L_0x0030
            boolean r0 = r6 instanceof android.content.Context     // Catch:{ all -> 0x0048 }
            if (r0 == 0) goto L_0x0030
            boolean r0 = com.ss.android.ugc.aweme.push.downgrade.d.a(r6, r3)     // Catch:{ all -> 0x0048 }
            if (r0 == 0) goto L_0x002b
        L_0x0024:
            r0 = 2
            r5.f53422i = r0     // Catch:{ all -> 0x0048 }
            com.bytedance.frameworks.apm.trace.MethodCollector.o(r4)     // Catch:{ all -> 0x0048 }
            goto L_0x0037
        L_0x002b:
            boolean r0 = r6.bindService(r3, r2, r1)     // Catch:{ all -> 0x0048 }
            goto L_0x0034
        L_0x0030:
            boolean r0 = r6.bindService(r3, r2, r1)     // Catch:{ all -> 0x0048 }
        L_0x0034:
            if (r0 == 0) goto L_0x0039
            goto L_0x0024
        L_0x0037:
            monitor-exit(r5)
            return
        L_0x0039:
            r5.f53422i = r1
            r0 = 0
            r5.f53420g = r0
            android.content.ServiceConnection r0 = r5.f53421h
            r6.unbindService(r0)
            com.bytedance.frameworks.apm.trace.MethodCollector.o(r4)
            monitor-exit(r5)
            return
        L_0x0048:
            r0 = move-exception
            monitor-exit(r5)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ar.core.ak.a(android.content.Context):void");
    }

    /* access modifiers changed from: package-private */
    public final synchronized void a(IBinder iBinder) {
        b bVar;
        MethodCollector.i(12136);
        if (iBinder == null) {
            bVar = null;
        } else {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.play.core.install.protocol.IInstallService");
            if (queryLocalInterface instanceof b) {
                bVar = (b) queryLocalInterface;
            } else {
                bVar = new a(iBinder);
            }
        }
        this.f53414a = bVar;
        this.f53422i = 3;
        for (Runnable runnable : this.f53419f) {
            runnable.run();
        }
        MethodCollector.o(12136);
    }

    /* access modifiers changed from: package-private */
    public final synchronized void a(Runnable runnable) {
        MethodCollector.i(12280);
        int i2 = this.f53422i;
        int i3 = i2 - 1;
        if (i2 == 0) {
            MethodCollector.o(12280);
            throw null;
        } else if (i3 == 0) {
            f fVar = new f();
            MethodCollector.o(12280);
            throw fVar;
        } else if (i3 == 1) {
            this.f53419f.offer(runnable);
            MethodCollector.o(12280);
        } else if (i3 != 2) {
            MethodCollector.o(12280);
        } else {
            runnable.run();
            MethodCollector.o(12280);
        }
    }

    private static void a(Activity activity, Intent intent) {
        com.ss.android.ugc.tiktok.security.a.a.a(intent, activity);
        activity.startActivity(intent);
    }

    public final synchronized void a(Context context, x xVar) {
        MethodCollector.i(11991);
        try {
            a(new an(this, context, xVar));
            MethodCollector.o(11991);
        } catch (f unused) {
            xVar.a(ArCoreApk.Availability.UNKNOWN_ERROR);
            MethodCollector.o(11991);
        }
    }

    static void a(Activity activity, ai aiVar) {
        boolean z;
        try {
            Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("market://details?id=com.google.ar.core"));
            z zVar = z.f53484a;
            Iterator<ResolveInfo> it = activity.getPackageManager().queryIntentActivities(intent, 65536).iterator();
            while (true) {
                if (!it.hasNext()) {
                    z = false;
                    break;
                }
                ResolveInfo next = it.next();
                if (next.activityInfo != null && next.activityInfo.name.equals("com.sec.android.app.samsungapps.MainForChina")) {
                    z = true;
                    break;
                }
            }
            zVar.f53486c = !z;
            a(activity, intent);
        } catch (ActivityNotFoundException e2) {
            aiVar.a(new FatalException("Failed to launch installer.", e2));
        }
    }

    private static Intent b(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
        try {
            return context.registerReceiver(broadcastReceiver, intentFilter);
        } catch (Exception e2) {
            if (ReceiverRegisterCrashOptimizer.fixedOpen()) {
                return ReceiverRegisterCrashOptimizer.registerReceiver(broadcastReceiver, intentFilter);
            }
            throw e2;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v3, resolved type: java.lang.IllegalArgumentException */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0018, code lost:
        r0 = r2.getMessage().contains("regist too many Broadcast Receivers");
        r2 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0022, code lost:
        if (r0 != false) goto L_0x0025;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0025, code lost:
        throw r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0026, code lost:
        r2 = move-exception;
        r2 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0027, code lost:
        com.bytedance.c.a.a.a.b.a(r2, "Register Receiver Exception");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x002d, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0010, code lost:
        return com.ss.android.ugc.aweme.lancet.receiver.ReceiverRegisterLancetHelper.registerReceiver(r2, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0011, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0012, code lost:
        r0 = r2.getMessage();
        r2 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0016, code lost:
        if (r0 != null) goto L_0x0018;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:4:0x000c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.content.Intent a(android.content.Context r1, android.content.BroadcastReceiver r2, android.content.IntentFilter r3) {
        /*
            android.app.Application r0 = com.bytedance.ies.ugc.appcontext.g.a()
            com.ss.android.ugc.aweme.lancet.receiver.a.a(r0)
            android.content.Intent r0 = b(r1, r2, r3)     // Catch:{ Exception -> 0x000c }
            return r0
        L_0x000c:
            android.content.Intent r0 = com.ss.android.ugc.aweme.lancet.receiver.ReceiverRegisterLancetHelper.registerReceiver(r2, r3)     // Catch:{ SecurityException -> 0x0026, IllegalArgumentException -> 0x0011 }
            return r0
        L_0x0011:
            r2 = move-exception
            java.lang.String r0 = r2.getMessage()
            if (r0 == 0) goto L_0x0027
            java.lang.String r1 = r2.getMessage()
            java.lang.String r0 = "regist too many Broadcast Receivers"
            boolean r0 = r1.contains(r0)
            if (r0 != 0) goto L_0x0025
            goto L_0x0027
        L_0x0025:
            throw r2
        L_0x0026:
            r2 = move-exception
        L_0x0027:
            java.lang.String r0 = "Register Receiver Exception"
            com.bytedance.c.a.a.a.b.a(r2, r0)
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ar.core.ak.a(android.content.Context, android.content.BroadcastReceiver, android.content.IntentFilter):android.content.Intent");
    }
}
