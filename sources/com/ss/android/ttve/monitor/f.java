package com.ss.android.ttve.monitor;

import android.content.Context;
import android.os.Build;
import android.util.DisplayMetrics;
import android.view.WindowManager;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.aweme.lancet.a.a;
import java.util.ArrayList;
import java.util.List;

public class f {

    /* renamed from: a  reason: collision with root package name */
    static boolean f61204a;

    /* renamed from: b  reason: collision with root package name */
    public static List<String> f61205b = new ArrayList<String>() {
        /* class com.ss.android.ttve.monitor.f.AnonymousClass1 */

        static {
            Covode.recordClassIndex(37686);
        }

        {
            add("os_sdk_int");
            add("external_storage");
            add("screen_height");
            add("screen_width");
            add("storage");
            add("memory");
            add("cpu_core");
            add("cpu_freq");
        }
    };

    /* renamed from: c  reason: collision with root package name */
    static String f61206c;

    /* renamed from: d  reason: collision with root package name */
    static String f61207d;

    /* renamed from: e  reason: collision with root package name */
    static String f61208e;

    /* renamed from: f  reason: collision with root package name */
    static String f61209f;

    /* renamed from: g  reason: collision with root package name */
    static String f61210g;

    /* renamed from: h  reason: collision with root package name */
    static String f61211h;

    /* renamed from: i  reason: collision with root package name */
    static String f61212i;

    /* renamed from: j  reason: collision with root package name */
    static String f61213j;

    /* renamed from: k  reason: collision with root package name */
    static String f61214k;

    /* renamed from: l  reason: collision with root package name */
    static String f61215l;

    /* renamed from: m  reason: collision with root package name */
    static String f61216m;
    static String n;
    static String o;
    static String p;
    private static boolean q;

    static {
        Covode.recordClassIndex(37685);
    }

    private static String a() {
        if (Build.VERSION.SDK_INT < 21) {
            return Build.CPU_ABI + "," + Build.CPU_ABI2;
        }
        StringBuilder sb = new StringBuilder();
        String[] strArr = Build.SUPPORTED_ABIS;
        if (strArr != null) {
            for (int i2 = 0; i2 < strArr.length; i2++) {
                sb.append(strArr[i2]);
                if (i2 != strArr.length - 1) {
                    sb.append(",");
                }
            }
        }
        return sb.toString();
    }

    public static void a(Context context) {
        int i2;
        MethodCollector.i(133);
        if (!q) {
            synchronized (f.class) {
                try {
                    if (!q) {
                        Context applicationContext = context.getApplicationContext();
                        if (a.f107168c) {
                            if (applicationContext == null) {
                                applicationContext = a.f107166a;
                            }
                        }
                        f61206c = Build.MODEL;
                        f61207d = d.a();
                        f61208e = d.b();
                        f61209f = String.valueOf(d.c());
                        f61210g = String.valueOf(d.d());
                        f61211h = "0";
                        f61212i = "0";
                        f61215l = String.valueOf(Build.VERSION.SDK_INT);
                        if (applicationContext == null) {
                            i2 = 0;
                        } else {
                            DisplayMetrics displayMetrics = new DisplayMetrics();
                            ((WindowManager) d.a(applicationContext, "window")).getDefaultDisplay().getMetrics(displayMetrics);
                            i2 = displayMetrics.widthPixels;
                        }
                        f61213j = String.valueOf(i2);
                        f61214k = String.valueOf(d.a(applicationContext));
                        f61216m = applicationContext.getPackageName();
                        n = a();
                        o = Build.BRAND;
                        q = true;
                    }
                } finally {
                    MethodCollector.o(133);
                }
            }
            return;
        }
        MethodCollector.o(133);
    }
}
