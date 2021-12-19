package com.bytedance.common.wschannel.channel.a.a.a;

import android.content.ClipboardManager;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.d;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.platform.godzilla.b.b.b;
import com.ss.android.ugc.aweme.lancet.i;
import java.lang.reflect.Field;
import okhttp3.Response;

public class a implements b {

    /* renamed from: a  reason: collision with root package name */
    private final Context f27048a;

    /* renamed from: b  reason: collision with root package name */
    private int f27049b;

    static {
        Covode.recordClassIndex(15970);
    }

    @Override // com.bytedance.common.wschannel.channel.a.a.a.b
    public void c() {
        this.f27049b = 0;
    }

    @Override // com.bytedance.common.wschannel.channel.a.a.a.b
    public final long b() {
        return (long) ((Math.random() * 4500.0d) + 500.0d);
    }

    public long a() {
        if (!a(this.f27048a)) {
            return -1;
        }
        int i2 = this.f27049b + 1;
        this.f27049b = i2;
        double min = (double) Math.min(((long) (1 << i2)) * 5000, 120000L);
        Double.isNaN(min);
        return (long) (min + (Math.random() * 10.0d * 1000.0d));
    }

    a(Context context) {
        this.f27048a = context;
    }

    private static NetworkInfo a(ConnectivityManager connectivityManager) {
        try {
            return connectivityManager.getActiveNetworkInfo();
        } catch (Exception e2) {
            com.ss.android.ugc.aweme.framework.a.a.a((Throwable) e2);
            return com.ss.android.ugc.aweme.net.e.a.a();
        }
    }

    private static boolean a(Context context) {
        try {
            NetworkInfo a2 = a((ConnectivityManager) a(context, "connectivity"));
            if (a2 == null || !a2.isAvailable()) {
                return false;
            }
            return true;
        } catch (Exception unused) {
        }
    }

    @Override // com.bytedance.common.wschannel.channel.a.a.a.b
    public final long a(Response response) {
        String header;
        long a2 = a();
        if (a2 == -1) {
            return -1;
        }
        if (response == null) {
            return a2;
        }
        try {
            if (response.isSuccessful()) {
                return a2;
            }
            int code = response.code();
            if (!(code == 414 || code == 511 || code == 512) || (header = response.header("Handshake-Options")) == null) {
                return a2;
            }
            String[] split = header.split(";");
            for (String str : split) {
                if (!TextUtils.isEmpty(str)) {
                    String[] split2 = str.split("=");
                    if ("reconnect-interval".equals(split2[0])) {
                        try {
                            a2 = Long.parseLong(split2[1]);
                            return a2 * 1000;
                        } catch (NumberFormatException unused) {
                            continue;
                        }
                    } else {
                        continue;
                    }
                }
            }
            return a2;
        } catch (Exception e2) {
            e2.printStackTrace();
            return a2;
        }
    }

    private static Object a(Context context, String str) {
        Object obj;
        MethodCollector.i(9214);
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
                    MethodCollector.o(9214);
                }
            }
        } else {
            obj = context.getSystemService(str);
        }
        return obj;
    }
}
