package com.ss.android.ugc.aweme.shortvideo.s;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.sysoptimizer.ReceiverRegisterCrashOptimizer;
import com.ss.android.ugc.aweme.lancet.a.a;
import java.util.ArrayList;

public class b extends BroadcastReceiver {

    /* renamed from: a  reason: collision with root package name */
    private static final String f130190a = b.class.getSimpleName();

    /* renamed from: b  reason: collision with root package name */
    private static boolean f130191b = false;

    /* renamed from: c  reason: collision with root package name */
    private static int f130192c;

    /* renamed from: d  reason: collision with root package name */
    private static ArrayList<a> f130193d = new ArrayList<>();

    /* renamed from: e  reason: collision with root package name */
    private static BroadcastReceiver f130194e;

    static {
        Covode.recordClassIndex(85401);
    }

    private static BroadcastReceiver a() {
        MethodCollector.i(7338);
        if (f130194e == null) {
            synchronized (b.class) {
                try {
                    if (f130194e == null) {
                        f130194e = new b();
                    }
                } catch (Throwable th) {
                    MethodCollector.o(7338);
                    throw th;
                }
            }
        }
        BroadcastReceiver broadcastReceiver = f130194e;
        MethodCollector.o(7338);
        return broadcastReceiver;
    }

    public static void b(Context context) {
        if (f130194e != null) {
            try {
                c(context).unregisterReceiver(f130194e);
            } catch (Exception unused) {
            }
        }
    }

    private static Context c(Context context) {
        Context applicationContext = context.getApplicationContext();
        if (a.f107168c && applicationContext == null) {
            return a.f107166a;
        }
        return applicationContext;
    }

    public static void b(a aVar) {
        ArrayList<a> arrayList = f130193d;
        if (arrayList != null && arrayList.contains(aVar)) {
            f130193d.remove(aVar);
        }
    }

    public static void a(Context context) {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("com.ss.ugc.aweme.CONNECTIVITY_CHANGE");
        intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
        b(c(context), a(), intentFilter);
    }

    public static void a(a aVar) {
        if (f130193d == null) {
            f130193d = new ArrayList<>();
        }
        if (!f130193d.contains(aVar)) {
            f130193d.add(aVar);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0093, code lost:
        if (r0 == 1) goto L_0x0072;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onReceive(android.content.Context r5, android.content.Intent r6) {
        /*
        // Method dump skipped, instructions count: 151
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.shortvideo.s.b.onReceive(android.content.Context, android.content.Intent):void");
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
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.shortvideo.s.b.b(android.content.Context, android.content.BroadcastReceiver, android.content.IntentFilter):android.content.Intent");
    }
}
