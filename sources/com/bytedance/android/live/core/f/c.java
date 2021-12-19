package com.bytedance.android.live.core.f;

import android.content.ClipboardManager;
import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.StatFs;
import android.util.DisplayMetrics;
import android.view.WindowManager;
import com.bytedance.android.live.core.f.b.e;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.d;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.platform.godzilla.b.b.b;
import com.ss.android.ugc.aweme.lancet.i;
import java.io.File;
import java.io.FileFilter;
import java.lang.reflect.Field;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    private static final FileFilter f9059a = new FileFilter() {
        /* class com.bytedance.android.live.core.f.c.AnonymousClass1 */

        static {
            Covode.recordClassIndex(4634);
        }

        public final boolean accept(File file) {
            String name = file.getName();
            if (!name.startsWith("cpu")) {
                return false;
            }
            for (int i2 = 3; i2 < name.length(); i2++) {
                if (!Character.isDigit(name.charAt(i2))) {
                    return false;
                }
            }
            return true;
        }
    };

    static {
        Covode.recordClassIndex(4633);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:?, code lost:
        r3.close();
     */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0032 A[SYNTHETIC, Splitter:B:15:0x0032] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x003c  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0045  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String a() {
        /*
            java.lang.String r6 = ""
            r5 = 10842(0x2a5a, float:1.5193E-41)
            com.bytedance.frameworks.apm.trace.MethodCollector.i(r5)
            r4 = 0
            java.io.BufferedReader r3 = new java.io.BufferedReader     // Catch:{ IOException -> 0x003a, all -> 0x002f }
            java.io.FileReader r2 = new java.io.FileReader     // Catch:{ IOException -> 0x003a, all -> 0x002f }
            java.io.File r1 = new java.io.File     // Catch:{ IOException -> 0x003a, all -> 0x002f }
            java.lang.String r0 = "/proc/cpuinfo"
            r1.<init>(r0)     // Catch:{ IOException -> 0x003a, all -> 0x002f }
            r2.<init>(r1)     // Catch:{ IOException -> 0x003a, all -> 0x002f }
            r3.<init>(r2)     // Catch:{ IOException -> 0x003a, all -> 0x002f }
        L_0x0019:
            java.lang.String r1 = r3.readLine()     // Catch:{ IOException -> 0x0039, all -> 0x002c }
            if (r1 == 0) goto L_0x0028
            java.lang.String r0 = "Hardware"
            boolean r0 = r1.startsWith(r0)     // Catch:{ IOException -> 0x0039, all -> 0x002c }
            if (r0 == 0) goto L_0x0019
            r6 = r1
        L_0x0028:
            r3.close()     // Catch:{ IOException -> 0x003f }
            goto L_0x003f
        L_0x002c:
            r0 = move-exception
            r4 = r3
            goto L_0x0030
        L_0x002f:
            r0 = move-exception
        L_0x0030:
            if (r4 == 0) goto L_0x0035
            r4.close()     // Catch:{ IOException -> 0x0035 }
        L_0x0035:
            com.bytedance.frameworks.apm.trace.MethodCollector.o(r5)
            throw r0
        L_0x0039:
            r4 = r3
        L_0x003a:
            if (r4 == 0) goto L_0x003f
            r4.close()
        L_0x003f:
            int r0 = r6.length()
            if (r0 <= 0) goto L_0x0056
            java.lang.String r0 = ":"
            java.lang.String[] r2 = r6.split(r0)
            int r1 = r2.length
            r0 = 2
            if (r1 != r0) goto L_0x0056
            r0 = 1
            r0 = r2[r0]
            java.lang.String r6 = r0.trim()
        L_0x0056:
            com.bytedance.frameworks.apm.trace.MethodCollector.o(r5)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.core.f.c.a():java.lang.String");
    }

    public static long a(String str) {
        try {
            StatFs statFs = new StatFs(str);
            int i2 = Build.VERSION.SDK_INT;
            return statFs.getBlockSizeLong() * statFs.getAvailableBlocksLong();
        } catch (Exception | IllegalArgumentException unused) {
            return -1;
        }
    }

    public static e a(Context context) {
        e eVar = new e((char) 0);
        DisplayMetrics displayMetrics = new DisplayMetrics();
        WindowManager windowManager = (WindowManager) a(context, "window");
        if (windowManager != null) {
            windowManager.getDefaultDisplay().getMetrics(displayMetrics);
            eVar.f9056a = displayMetrics.densityDpi;
            eVar.f9057b = displayMetrics.widthPixels;
            eVar.f9058c = displayMetrics.heightPixels;
        }
        return eVar;
    }

    private static Object a(Context context, String str) {
        Object obj;
        MethodCollector.i(10687);
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
                    MethodCollector.o(10687);
                }
            }
        } else {
            obj = context.getSystemService(str);
        }
        return obj;
    }
}
