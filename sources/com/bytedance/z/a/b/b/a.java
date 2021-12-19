package com.bytedance.z.a.b.b;

import android.content.ClipboardManager;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.BatteryManager;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.PowerManager;
import android.os.SystemClock;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.d;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.ugc.appcontext.g;
import com.bytedance.sysoptimizer.ReceiverRegisterCrashOptimizer;
import com.bytedance.z.a.a.c;
import com.bytedance.z.a.b.b;
import com.ss.android.ugc.aweme.lancet.i;
import com.ss.android.ugc.aweme.lancet.receiver.ReceiverRegisterLancetHelper;
import java.lang.reflect.Field;

public final class a extends b {

    /* renamed from: c  reason: collision with root package name */
    public PowerManager f46263c = ((PowerManager) a(this.f46261a, "power"));

    /* renamed from: d  reason: collision with root package name */
    public boolean f46264d;

    /* renamed from: e  reason: collision with root package name */
    public int f46265e;

    /* renamed from: f  reason: collision with root package name */
    public float f46266f;

    /* renamed from: g  reason: collision with root package name */
    private BatteryManager f46267g = ((BatteryManager) a(this.f46261a, "batterymanager"));

    /* renamed from: h  reason: collision with root package name */
    private int f46268h = -1;

    /* renamed from: i  reason: collision with root package name */
    private long f46269i;

    static {
        Covode.recordClassIndex(28255);
    }

    public final void b() {
        boolean z;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j2 = this.f46269i;
        if (j2 == 0 || elapsedRealtime - j2 >= 5000) {
            this.f46269i = elapsedRealtime;
            Intent b2 = b(this.f46261a, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
            int intExtra = b2.getIntExtra("status", -1);
            this.f46268h = intExtra;
            if (intExtra == 2 || (intExtra == 5 && Build.VERSION.SDK_INT >= 23 && this.f46267g.isCharging())) {
                z = true;
            } else {
                z = false;
            }
            this.f46264d = z;
            this.f46265e = b2.getIntExtra("level", 0);
            int intExtra2 = b2.getIntExtra("temperature", 0);
            if (intExtra2 > 0) {
                this.f46266f = ((float) intExtra2) / 10.0f;
            }
        }
    }

    public a(Context context, c cVar) {
        super(context, cVar);
    }

    private static Intent a(Context context, IntentFilter intentFilter) {
        try {
            return context.registerReceiver(null, intentFilter);
        } catch (Exception e2) {
            if (ReceiverRegisterCrashOptimizer.fixedOpen()) {
                return ReceiverRegisterCrashOptimizer.registerReceiver(null, intentFilter);
            }
            throw e2;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v2, resolved type: java.lang.IllegalArgumentException */
    /* JADX WARN: Multi-variable type inference failed */
    private static Intent b(Context context, IntentFilter intentFilter) {
        SecurityException securityException;
        com.ss.android.ugc.aweme.lancet.receiver.a.a(g.a());
        try {
            return a(context, intentFilter);
        } catch (Exception unused) {
            try {
                return ReceiverRegisterLancetHelper.registerReceiver(null, intentFilter);
            } catch (SecurityException e2) {
                securityException = e2;
                com.bytedance.c.a.a.a.b.a(securityException, "Register Receiver Exception");
                return null;
            } catch (IllegalArgumentException e3) {
                String message = e3.getMessage();
                securityException = e3;
                if (message != null) {
                    boolean contains = e3.getMessage().contains("regist too many Broadcast Receivers");
                    securityException = e3;
                    if (contains) {
                        throw e3;
                    }
                }
                com.bytedance.c.a.a.a.b.a(securityException, "Register Receiver Exception");
                return null;
            }
        }
    }

    private static Object a(Context context, String str) {
        Object obj;
        MethodCollector.i(4519);
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
                    MethodCollector.o(4519);
                }
            }
        } else {
            obj = context.getSystemService(str);
        }
        return obj;
    }
}
