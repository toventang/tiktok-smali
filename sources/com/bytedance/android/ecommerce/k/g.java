package com.bytedance.android.ecommerce.k;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.bytedance.android.ecommerce.k.h;
import com.bytedance.common.utility.collection.d;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.sysoptimizer.ReceiverRegisterCrashOptimizer;
import java.util.Iterator;

public final class g {

    /* renamed from: f  reason: collision with root package name */
    private static g f7134f;

    /* renamed from: a  reason: collision with root package name */
    final Context f7135a;

    /* renamed from: b  reason: collision with root package name */
    boolean f7136b;

    /* renamed from: c  reason: collision with root package name */
    BroadcastReceiver f7137c;

    /* renamed from: d  reason: collision with root package name */
    h.a f7138d = h.a.MOBILE;

    /* renamed from: e  reason: collision with root package name */
    public d<a> f7139e = new d<>();

    public interface a {
        static {
            Covode.recordClassIndex(3436);
        }

        void a(h.a aVar);
    }

    static {
        Covode.recordClassIndex(3434);
    }

    public static synchronized g a(Context context) {
        g gVar;
        synchronized (g.class) {
            MethodCollector.i(6113);
            if (f7134f == null) {
                f7134f = new g(context);
            }
            gVar = f7134f;
            MethodCollector.o(6113);
        }
        return gVar;
    }

    private g(Context context) {
        Context applicationContext = context.getApplicationContext();
        if (com.ss.android.ugc.aweme.lancet.a.a.f107168c && applicationContext == null) {
            applicationContext = com.ss.android.ugc.aweme.lancet.a.a.f107166a;
        }
        this.f7135a = applicationContext;
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
        AnonymousClass1 r0 = new BroadcastReceiver() {
            /* class com.bytedance.android.ecommerce.k.g.AnonymousClass1 */

            static {
                Covode.recordClassIndex(3435);
            }

            public final void onReceive(Context context, Intent intent) {
                if (intent.getAction().equals("android.net.conn.CONNECTIVITY_CHANGE")) {
                    try {
                        g gVar = g.this;
                        gVar.f7138d = h.b(gVar.f7135a);
                        g gVar2 = g.this;
                        h.a aVar = gVar2.f7138d;
                        if (gVar2.f7139e != null) {
                            Iterator<a> it = gVar2.f7139e.iterator();
                            while (it.hasNext()) {
                                a next = it.next();
                                if (next != null) {
                                    next.a(aVar);
                                }
                            }
                        }
                    } catch (Exception unused) {
                    }
                }
            }
        };
        this.f7137c = r0;
        try {
            b(applicationContext, r0, intentFilter);
            this.f7136b = true;
        } catch (Throwable unused) {
            this.f7136b = false;
        }
        this.f7138d = h.b(this.f7135a);
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
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.ecommerce.k.g.b(android.content.Context, android.content.BroadcastReceiver, android.content.IntentFilter):android.content.Intent");
    }
}
