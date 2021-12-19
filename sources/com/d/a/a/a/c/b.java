package com.d.a.a.a.c;

import android.app.KeyguardManager;
import android.content.BroadcastReceiver;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.d;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.sysoptimizer.ReceiverRegisterCrashOptimizer;
import com.d.a.a.a.b.l;
import com.ss.android.ugc.aweme.lancet.i;
import java.lang.reflect.Field;
import java.util.Collections;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static b f46370a = new b();

    /* renamed from: b  reason: collision with root package name */
    public Context f46371b;

    /* renamed from: c  reason: collision with root package name */
    public BroadcastReceiver f46372c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f46373d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f46374e;

    /* renamed from: f  reason: collision with root package name */
    public a f46375f;

    public interface a {
        static {
            Covode.recordClassIndex(28314);
        }

        void a(boolean z);
    }

    static {
        Covode.recordClassIndex(28312);
    }

    private b() {
    }

    public final boolean b() {
        return !this.f46374e;
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
        throw new UnsupportedOperationException("Method not decompiled: com.d.a.a.a.c.b.b(android.content.Context, android.content.BroadcastReceiver, android.content.IntentFilter):android.content.Intent");
    }

    public final void a() {
        this.f46372c = new BroadcastReceiver() {
            /* class com.d.a.a.a.c.b.AnonymousClass1 */

            static {
                Covode.recordClassIndex(28313);
            }

            public final void onReceive(Context context, Intent intent) {
                KeyguardManager keyguardManager;
                if (intent != null) {
                    if ("android.intent.action.SCREEN_OFF".equals(intent.getAction())) {
                        b.a(b.this, true);
                    } else if ("android.intent.action.USER_PRESENT".equals(intent.getAction())) {
                        b.a(b.this, false);
                    } else if ("android.intent.action.SCREEN_ON".equals(intent.getAction()) && (keyguardManager = (KeyguardManager) a(context, "keyguard")) != null && !keyguardManager.inKeyguardRestrictedInputMode()) {
                        b.a(b.this, false);
                    }
                }
            }

            private static Object a(Context context, String str) {
                Object obj;
                MethodCollector.i(6235);
                if (Build.VERSION.SDK_INT > 27 || !"clipboard".equals(str)) {
                    if (!i.f107220b && "connectivity".equals(str)) {
                        try {
                            new com.bytedance.platform.godzilla.b.b.b().a();
                            i.f107220b = true;
                            obj = context.getSystemService(str);
                        } catch (Throwable unused) {
                        }
                    }
                    obj = context.getSystemService(str);
                } else if (i.f107219a) {
                    synchronized (ClipboardManager.class) {
                        try {
                            obj = context.getSystemService(str);
                            if (Thread.currentThread() != Looper.getMainLooper().getThread()) {
                                try {
                                    Field declaredField = ClipboardManager.class.getDeclaredField("mHandler");
                                    declaredField.setAccessible(true);
                                    declaredField.set(obj, new i.a((Handler) declaredField.get(obj)));
                                } catch (Exception e2) {
                                    d.a(e2, "ClipboardManager Handler Reflect Fail");
                                }
                            }
                            i.f107219a = false;
                        } finally {
                            MethodCollector.o(6235);
                        }
                    }
                } else {
                    obj = context.getSystemService(str);
                }
                return obj;
            }
        };
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.SCREEN_OFF");
        intentFilter.addAction("android.intent.action.SCREEN_ON");
        intentFilter.addAction("android.intent.action.USER_PRESENT");
        b(this.f46371b, this.f46372c, intentFilter);
        this.f46373d = true;
        c();
    }

    private void c() {
        String str;
        boolean z = !this.f46374e;
        for (l lVar : Collections.unmodifiableCollection(a.f46367a.f46368b)) {
            com.d.a.a.a.g.a aVar = lVar.f46358c;
            if (aVar.f46402a.get() != null) {
                if (z) {
                    str = "foregrounded";
                } else {
                    str = "backgrounded";
                }
                e.f46383a.a(aVar.c(), "setState", str);
            }
        }
    }

    static /* synthetic */ void a(b bVar, boolean z) {
        if (bVar.f46374e != z) {
            bVar.f46374e = z;
            if (bVar.f46373d) {
                bVar.c();
                a aVar = bVar.f46375f;
                if (aVar != null) {
                    aVar.a(bVar.b());
                }
            }
        }
    }
}
