package com.google.android.gms.common.util;

import android.content.ClipboardManager;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import com.bytedance.c.a.a.a.b;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.d;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.ugc.appcontext.g;
import com.bytedance.sysoptimizer.ReceiverRegisterCrashOptimizer;
import com.ss.android.ugc.aweme.lancet.a.a;
import com.ss.android.ugc.aweme.lancet.i;
import com.ss.android.ugc.aweme.lancet.receiver.ReceiverRegisterLancetHelper;
import java.lang.reflect.Field;

public final class p {

    /* renamed from: a  reason: collision with root package name */
    public static final IntentFilter f50524a = new IntentFilter("android.intent.action.BATTERY_CHANGED");

    /* renamed from: b  reason: collision with root package name */
    private static long f50525b;

    /* renamed from: c  reason: collision with root package name */
    private static float f50526c = Float.NaN;

    static {
        Covode.recordClassIndex(31478);
    }

    public static Context a(Context context) {
        Context applicationContext = context.getApplicationContext();
        if (a.f107168c && applicationContext == null) {
            return a.f107166a;
        }
        return applicationContext;
    }

    public static synchronized float b(Context context) {
        synchronized (p.class) {
            MethodCollector.i(9815);
            if (SystemClock.elapsedRealtime() - f50525b >= 60000 || Float.isNaN(f50526c)) {
                Intent a2 = a(a(context), f50524a);
                if (a2 != null) {
                    f50526c = ((float) a2.getIntExtra("level", -1)) / ((float) a2.getIntExtra("scale", -1));
                }
                f50525b = SystemClock.elapsedRealtime();
                float f2 = f50526c;
                MethodCollector.o(9815);
                return f2;
            }
            float f3 = f50526c;
            MethodCollector.o(9815);
            return f3;
        }
    }

    private static Intent b(Context context, IntentFilter intentFilter) {
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
    public static Intent a(Context context, IntentFilter intentFilter) {
        SecurityException securityException;
        com.ss.android.ugc.aweme.lancet.receiver.a.a(g.a());
        try {
            return b(context, intentFilter);
        } catch (Exception unused) {
            try {
                return ReceiverRegisterLancetHelper.registerReceiver(null, intentFilter);
            } catch (SecurityException e2) {
                securityException = e2;
                b.a(securityException, "Register Receiver Exception");
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
                b.a(securityException, "Register Receiver Exception");
                return null;
            }
        }
    }

    public static Object a(Context context, String str) {
        Object obj;
        MethodCollector.i(9643);
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
                    MethodCollector.o(9643);
                }
            }
        } else {
            obj = context.getSystemService(str);
        }
        return obj;
    }
}
