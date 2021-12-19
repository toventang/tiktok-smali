package com.ss.b;

import android.content.ClipboardManager;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.BatteryManager;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import com.bytedance.c.a.a.a.b;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.d;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.ugc.appcontext.g;
import com.bytedance.sysoptimizer.ReceiverRegisterCrashOptimizer;
import com.ss.android.ugc.aweme.lancet.i;
import com.ss.android.ugc.aweme.lancet.receiver.ReceiverRegisterLancetHelper;
import com.ss.android.ugc.aweme.lancet.receiver.a;
import java.lang.reflect.Field;

public class c {

    /* renamed from: a  reason: collision with root package name */
    private static BatteryManager f151632a;

    /* renamed from: b  reason: collision with root package name */
    private static IntentFilter f151633b = new IntentFilter("android.intent.action.BATTERY_CHANGED");

    static {
        Covode.recordClassIndex(100627);
    }

    public static long d(Context context) {
        return a(context).getLongProperty(4);
    }

    public static float b(Context context) {
        return ((float) b(context, new IntentFilter("android.intent.action.BATTERY_CHANGED")).getIntExtra("voltage", -1)) / 1000.0f;
    }

    public static BatteryManager a(Context context) {
        MethodCollector.i(5003);
        if (f151632a == null) {
            synchronized (c.class) {
                try {
                    if (f151632a == null) {
                        if (Build.VERSION.SDK_INT < 21) {
                            return null;
                        }
                        f151632a = (BatteryManager) a(context, "batterymanager");
                    }
                } finally {
                    MethodCollector.o(5003);
                }
            }
        }
        BatteryManager batteryManager = f151632a;
        MethodCollector.o(5003);
        return batteryManager;
    }

    public static float c(Context context) {
        float longProperty = (float) a(context).getLongProperty(2);
        if (longProperty < -1.0E7f || longProperty > 1.0E7f) {
            return -1.0f;
        }
        if (d.b() || d.c()) {
            if (longProperty < -10000.0f) {
                longProperty /= 1000.0f;
            }
            return -longProperty;
        } else if (!d.a()) {
            return longProperty / 1000.0f;
        } else {
            if (longProperty > 10000.0f) {
                return longProperty / 1000.0f;
            }
            return longProperty;
        }
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
        a.a(g.a());
        try {
            return a(context, intentFilter);
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

    private static Object a(Context context, String str) {
        Object obj;
        MethodCollector.i(5126);
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
                    MethodCollector.o(5126);
                }
            }
        } else {
            obj = context.getSystemService(str);
        }
        return obj;
    }
}
