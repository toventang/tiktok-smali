package com.ss.ugc.effectplatform.util;

import android.content.ClipboardManager;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.c;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.platform.godzilla.b.b.b;
import com.ss.android.ugc.aweme.framework.a.a;
import com.ss.android.ugc.aweme.lancet.i;
import h.f.b.l;
import h.w;
import java.lang.reflect.Field;

public final class o {

    /* renamed from: a  reason: collision with root package name */
    public static final o f153987a = new o();

    private o() {
    }

    static {
        Covode.recordClassIndex(102684);
    }

    private static NetworkInfo a(ConnectivityManager connectivityManager) {
        try {
            return connectivityManager.getActiveNetworkInfo();
        } catch (Exception e2) {
            a.a((Throwable) e2);
            return com.ss.android.ugc.aweme.net.e.a.a();
        }
    }

    public static boolean a(Object obj) {
        if (obj != null && (obj instanceof Context)) {
            return a((Context) obj);
        }
        return false;
    }

    private static boolean a(Context context) {
        try {
            Object a2 = a(context, "connectivity");
            if (a2 != null) {
                ConnectivityManager connectivityManager = (ConnectivityManager) a2;
                if (connectivityManager == null) {
                    return false;
                }
                NetworkInfo a3 = a(connectivityManager);
                l.a((Object) a3, "");
                return a3.isConnected();
            }
            throw new w("null cannot be cast to non-null type");
        } catch (Exception unused) {
            return false;
        }
    }

    private static Object a(Context context, String str) {
        Object obj;
        MethodCollector.i(7958);
        if (Build.VERSION.SDK_INT > 27 || !"clipboard".equals(str)) {
            if (!i.f107220b && "connectivity".equals(str)) {
                try {
                    new b().a();
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
                            c.a(e2, "ClipboardManager Handler Reflect Fail");
                        }
                    }
                    i.f107219a = false;
                } finally {
                    MethodCollector.o(7958);
                }
            }
        } else {
            obj = context.getSystemService(str);
        }
        return obj;
    }
}
