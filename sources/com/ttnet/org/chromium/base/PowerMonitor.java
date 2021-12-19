package com.ttnet.org.chromium.base;

import android.app.Application;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.sysoptimizer.ReceiverRegisterCrashOptimizer;
import com.ttnet.org.chromium.base.d;

public class PowerMonitor implements d.a {

    /* renamed from: a  reason: collision with root package name */
    public static String f155180a;

    /* renamed from: b  reason: collision with root package name */
    public static String f155181b;

    /* renamed from: c  reason: collision with root package name */
    public static String f155182c;

    /* renamed from: d  reason: collision with root package name */
    public static String f155183d;

    /* renamed from: e  reason: collision with root package name */
    public static long f155184e;

    /* renamed from: f  reason: collision with root package name */
    public static long f155185f;

    /* renamed from: g  reason: collision with root package name */
    public static boolean f155186g;

    /* renamed from: h  reason: collision with root package name */
    static final /* synthetic */ boolean f155187h = true;

    /* renamed from: i  reason: collision with root package name */
    private static final String f155188i = PowerMonitor.class.getSimpleName();

    /* renamed from: j  reason: collision with root package name */
    private static d f155189j = new d();

    /* renamed from: k  reason: collision with root package name */
    private static String f155190k;

    /* renamed from: l  reason: collision with root package name */
    private static PowerMonitor f155191l;
    private static a n;

    /* renamed from: m  reason: collision with root package name */
    private boolean f155192m;

    private static native void nativeOnBatteryChargingChanged();

    private static native void nativeOnInstantResume();

    private static native void nativeOnInstantSuspend();

    public static native void nativeOnResume();

    public static native void nativeOnSuspend();

    private PowerMonitor() {
    }

    private static boolean isBatteryPower() {
        if (f155191l == null) {
            e();
        }
        return f155191l.f155192m;
    }

    @Override // com.ttnet.org.chromium.base.d.a
    public final void c() {
        MethodCollector.i(13602);
        nativeOnInstantResume();
        MethodCollector.o(13602);
    }

    @Override // com.ttnet.org.chromium.base.d.a
    public final void d() {
        MethodCollector.i(13603);
        nativeOnInstantSuspend();
        MethodCollector.o(13603);
    }

    static {
        Covode.recordClassIndex(103273);
    }

    @Override // com.ttnet.org.chromium.base.d.a
    public final void a() {
        MethodCollector.i(13535);
        Context context = c.f155223a;
        if (j.a(context)) {
            Intent intent = new Intent();
            intent.setAction(f155180a);
            if (!TextUtils.isEmpty(f155190k)) {
                intent.setPackage(f155190k);
            }
            context.sendBroadcast(intent);
        }
        nativeOnResume();
        MethodCollector.o(13535);
    }

    @Override // com.ttnet.org.chromium.base.d.a
    public final void b() {
        MethodCollector.i(13601);
        Context context = c.f155223a;
        if (j.a(context)) {
            Intent intent = new Intent();
            intent.setAction(f155181b);
            if (!TextUtils.isEmpty(f155190k)) {
                intent.setPackage(f155190k);
            }
            context.sendBroadcast(intent);
        }
        nativeOnSuspend();
        MethodCollector.o(13601);
    }

    public static void e() {
        if (f155191l == null) {
            Context context = c.f155223a;
            f155191l = new PowerMonitor();
            Intent b2 = b(context, null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
            if (b2 != null) {
                a(b2);
            }
            f155190k = context.getPackageName();
            f155181b = f155190k + ".cronet.APP_BACKGROUND";
            f155180a = f155190k + ".cronet.APP_FOREGROUND";
            f155183d = f155190k + ".wschannel.APP_BACKGROUND";
            f155182c = f155190k + ".wschannel.APP_FOREGROUND";
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.ACTION_POWER_CONNECTED");
            intentFilter.addAction("android.intent.action.ACTION_POWER_DISCONNECTED");
            b(context, new BroadcastReceiver() {
                /* class com.ttnet.org.chromium.base.PowerMonitor.AnonymousClass1 */

                static {
                    Covode.recordClassIndex(103274);
                }

                public final void onReceive(Context context, Intent intent) {
                    PowerMonitor.a(intent);
                }
            }, intentFilter);
            if (!j.a(context) && !f155186g) {
                n = new a();
                IntentFilter intentFilter2 = new IntentFilter();
                intentFilter2.addAction(f155181b);
                intentFilter2.addAction(f155180a);
                intentFilter2.addAction(f155183d);
                intentFilter2.addAction(f155182c);
                b(context, n, intentFilter2);
            } else if (context instanceof Application) {
                f155189j.f155228b = f155191l;
                ((Application) context).registerActivityLifecycleCallbacks(f155189j);
            }
        }
    }

    public static void a(Intent intent) {
        MethodCollector.i(13682);
        if (f155187h || f155191l != null) {
            int intExtra = intent.getIntExtra("plugged", -1);
            PowerMonitor powerMonitor = f155191l;
            boolean z = true;
            if (intExtra == 2 || intExtra == 1) {
                z = false;
            }
            powerMonitor.f155192m = z;
            nativeOnBatteryChargingChanged();
            MethodCollector.o(13682);
            return;
        }
        AssertionError assertionError = new AssertionError();
        MethodCollector.o(13682);
        throw assertionError;
    }

    public static class a extends BroadcastReceiver {
        static {
            Covode.recordClassIndex(103275);
        }

        public final void onReceive(Context context, Intent intent) {
            MethodCollector.i(13215);
            long currentTimeMillis = System.currentTimeMillis();
            String action = intent.getAction();
            if (action.equals(PowerMonitor.f155180a) || action.equals(PowerMonitor.f155182c)) {
                PowerMonitor.f155184e = currentTimeMillis;
                if (currentTimeMillis - PowerMonitor.f155184e > 10000) {
                    PowerMonitor.nativeOnResume();
                }
                MethodCollector.o(13215);
                return;
            }
            if (action.equals(PowerMonitor.f155181b) || action.equals(PowerMonitor.f155183d)) {
                PowerMonitor.f155185f = currentTimeMillis;
                if (currentTimeMillis - PowerMonitor.f155185f > 10000) {
                    PowerMonitor.nativeOnSuspend();
                }
            }
            MethodCollector.o(13215);
        }
    }

    private static Intent a(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
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
    private static android.content.Intent b(android.content.Context r1, android.content.BroadcastReceiver r2, android.content.IntentFilter r3) {
        /*
            android.app.Application r0 = com.bytedance.ies.ugc.appcontext.g.a()
            com.ss.android.ugc.aweme.lancet.receiver.a.a(r0)
            android.content.Intent r0 = a(r1, r2, r3)     // Catch:{ Exception -> 0x000c }
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
        throw new UnsupportedOperationException("Method not decompiled: com.ttnet.org.chromium.base.PowerMonitor.b(android.content.Context, android.content.BroadcastReceiver, android.content.IntentFilter):android.content.Intent");
    }
}
