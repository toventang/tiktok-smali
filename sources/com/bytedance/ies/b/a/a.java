package com.bytedance.ies.b.a;

import android.content.ClipboardManager;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.d;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.frameworks.baselib.network.http.b.c;
import com.bytedance.platform.godzilla.b.b.b;
import com.ss.android.ugc.aweme.lancet.i;
import java.io.IOException;
import java.lang.reflect.Field;
import java.net.SocketException;
import java.net.SocketTimeoutException;
import java.util.HashMap;
import java.util.Map;
import javax.net.ssl.SSLPeerUnverifiedException;
import org.apache.http.conn.ConnectTimeoutException;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static Map<String, Map<String, Integer>> f31922a = new HashMap();

    static {
        Covode.recordClassIndex(18669);
    }

    private static NetworkInfo a(ConnectivityManager connectivityManager) {
        try {
            return connectivityManager.getActiveNetworkInfo();
        } catch (Exception e2) {
            com.ss.android.ugc.aweme.framework.a.a.a((Throwable) e2);
            return com.ss.android.ugc.aweme.net.e.a.a();
        }
    }

    public static boolean a(Context context) {
        try {
            NetworkInfo a2 = a((ConnectivityManager) a(context, "connectivity"));
            if (a2 == null || !a2.isAvailable()) {
                return false;
            }
            return true;
        } catch (Exception e2) {
            e2.printStackTrace();
            return false;
        }
    }

    public static int a(Context context, Throwable th) {
        int i2;
        if (th instanceof ConnectTimeoutException) {
            i2 = 13;
        } else if (th instanceof SocketTimeoutException) {
            i2 = 14;
        } else {
            if (!(th instanceof SocketException)) {
                if (th instanceof SSLPeerUnverifiedException) {
                    i2 = 21;
                } else if (th instanceof c) {
                    if (((c) th).getStatusCode() == 503) {
                        i2 = 19;
                    } else {
                        i2 = 16;
                    }
                } else if (!(th instanceof IOException)) {
                    i2 = 18;
                }
            }
            i2 = 15;
        }
        if (context == null) {
            return i2;
        }
        if ((i2 == 15 || i2 == 14) && !a(context)) {
            return 12;
        }
        return i2;
    }

    private static Object a(Context context, String str) {
        Object obj;
        MethodCollector.i(4597);
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
                            d.a(e2, "ClipboardManager Handler Reflect Fail");
                        }
                    }
                    i.f107219a = false;
                } finally {
                    MethodCollector.o(4597);
                }
            }
        } else {
            obj = context.getSystemService(str);
        }
        return obj;
    }

    /* JADX WARNING: Removed duplicated region for block: B:104:0x016c A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:105:0x016f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int a(java.lang.Throwable r8, java.lang.String[] r9) {
        /*
        // Method dump skipped, instructions count: 452
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ies.b.a.a.a(java.lang.Throwable, java.lang.String[]):int");
    }
}
