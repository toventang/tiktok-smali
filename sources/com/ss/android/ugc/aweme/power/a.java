package com.ss.android.ugc.aweme.power;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.ugc.appcontext.d;
import com.bytedance.sysoptimizer.ReceiverRegisterCrashOptimizer;

public class a {

    /* renamed from: c  reason: collision with root package name */
    private static a f115701c;

    /* renamed from: a  reason: collision with root package name */
    float f115702a;

    /* renamed from: b  reason: collision with root package name */
    boolean f115703b;

    static {
        Covode.recordClassIndex(74650);
    }

    public static a a() {
        MethodCollector.i(7090);
        if (f115701c == null) {
            synchronized (a.class) {
                try {
                    if (f115701c == null) {
                        f115701c = new a(d.a());
                    }
                } catch (Throwable th) {
                    MethodCollector.o(7090);
                    throw th;
                }
            }
        }
        a aVar = f115701c;
        MethodCollector.o(7090);
        return aVar;
    }

    /* renamed from: com.ss.android.ugc.aweme.power.a$a  reason: collision with other inner class name */
    public class C2954a extends BroadcastReceiver {
        static {
            Covode.recordClassIndex(74651);
        }

        public C2954a() {
        }

        public final void onReceive(Context context, Intent intent) {
            a aVar = a.this;
            aVar.a(intent);
            if (d.a().f115709a) {
                if (aVar.f115703b || aVar.f115702a > 21.0f) {
                    d.a().c();
                }
            } else if (aVar.f115702a < 20.0f && !aVar.f115703b) {
                d.a().b();
            }
        }
    }

    private a(Context context) {
        try {
            Intent b2 = b(context, new C2954a(), new IntentFilter("android.intent.action.BATTERY_CHANGED"));
            if (b2 != null) {
                a(b2);
            }
        } catch (Throwable unused) {
        }
    }

    /* access modifiers changed from: package-private */
    public final void a(Intent intent) {
        boolean z;
        this.f115702a = (((float) intent.getIntExtra("level", -1)) / ((float) intent.getIntExtra("scale", -1))) * 100.0f;
        int intExtra = intent.getIntExtra("status", -1);
        if (intExtra == 2 || intExtra == 5) {
            z = true;
        } else {
            z = false;
        }
        this.f115703b = z;
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
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.power.a.b(android.content.Context, android.content.BroadcastReceiver, android.content.IntentFilter):android.content.Intent");
    }
}
