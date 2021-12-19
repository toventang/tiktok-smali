package com.bytedance.lynx.hybrid.i;

import android.content.ClipboardManager;
import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.WindowManager;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.c;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.platform.godzilla.b.b.b;
import com.ss.android.ugc.aweme.lancet.i;
import h.f.b.l;
import h.w;
import java.lang.reflect.Field;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final a f40985a = new a();

    /* renamed from: b  reason: collision with root package name */
    private static int f40986b = -1;

    /* renamed from: c  reason: collision with root package name */
    private static int f40987c = -1;

    /* renamed from: d  reason: collision with root package name */
    private static int f40988d = -1;

    /* renamed from: e  reason: collision with root package name */
    private static int f40989e = -1;

    private a() {
    }

    static {
        Covode.recordClassIndex(25116);
    }

    private static boolean a() {
        int i2 = f40986b;
        boolean z = false;
        if (i2 == -1) {
            try {
                Class<?> cls = Class.forName("android.util.FtFeature");
                Object invoke = cls.getDeclaredMethod("isFeatureSupport", Integer.TYPE).invoke(cls, 32);
                if (invoke != null) {
                    z = ((Boolean) invoke).booleanValue();
                    int i3 = z ? 1 : 0;
                    int i4 = z ? 1 : 0;
                    int i5 = z ? 1 : 0;
                    f40986b = i3;
                    return z;
                }
                throw new w("null cannot be cast to non-null type");
            } catch (Exception unused) {
            }
        } else if (i2 == 1) {
            return true;
        } else {
            return false;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:5:0x000f A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean a(android.content.Context r4) {
        /*
            boolean r0 = a()
            r3 = 1
            if (r0 != 0) goto L_0x000f
            int r2 = com.bytedance.lynx.hybrid.i.a.f40987c
            r0 = -1
            r1 = 0
            if (r2 == r0) goto L_0x0010
            if (r2 != r3) goto L_0x0019
        L_0x000f:
            return r3
        L_0x0010:
            boolean r0 = d(r4)
            com.bytedance.lynx.hybrid.i.a.f40987c = r0
            if (r0 == 0) goto L_0x0019
            goto L_0x000f
        L_0x0019:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.lynx.hybrid.i.a.a(android.content.Context):boolean");
    }

    public static int c(Context context) {
        l.c(context, "");
        int i2 = f40989e;
        if (i2 != -1) {
            return i2;
        }
        int i3 = e(context)[1];
        if (i3 <= 0) {
            i3 = (int) d.a(context, 28.0f);
        }
        f40989e = i3;
        return i3;
    }

    public static boolean b(Context context) {
        l.c(context, "");
        int i2 = f40988d;
        boolean z = false;
        if (i2 == -1) {
            try {
                Class<?> loadClass = context.getClassLoader().loadClass("com.huawei.android.util.HwNotchSizeUtil");
                Object invoke = loadClass.getMethod("hasNotchInScreen", new Class[0]).invoke(loadClass, new Object[0]);
                if (invoke != null) {
                    z = ((Boolean) invoke).booleanValue();
                    int i3 = z ? 1 : 0;
                    int i4 = z ? 1 : 0;
                    int i5 = z ? 1 : 0;
                    f40988d = i3;
                    return z;
                }
                throw new w("null cannot be cast to non-null type");
            } catch (Exception unused) {
            }
        } else if (i2 == 1) {
            return true;
        } else {
            return false;
        }
    }

    private static int[] e(Context context) {
        int[] iArr = {0, 0};
        if (context == null) {
            return iArr;
        }
        try {
            Class<?> loadClass = context.getClassLoader().loadClass("com.huawei.android.util.HwNotchSizeUtil");
            Object invoke = loadClass.getMethod("getNotchSize", new Class[0]).invoke(loadClass, new Object[0]);
            if (invoke != null) {
                return (int[]) invoke;
            }
            throw new w("null cannot be cast to non-null type");
        } catch (Exception unused) {
            return iArr;
        }
    }

    private static boolean d(Context context) {
        try {
            String str = Build.BRAND;
            l.a((Object) str, "");
            if (str != null) {
                String lowerCase = str.toLowerCase();
                l.a((Object) lowerCase, "");
                if (TextUtils.equals("oppo", lowerCase) && context != null && context.getPackageManager().hasSystemFeature("com.oppo.feature.screen.heteromorphism")) {
                    int i2 = Build.VERSION.SDK_INT;
                    if (context != null) {
                        int i3 = Build.VERSION.SDK_INT;
                        DisplayMetrics displayMetrics = new DisplayMetrics();
                        Object a2 = a(context, "window");
                        if (a2 != null) {
                            ((WindowManager) a2).getDefaultDisplay().getRealMetrics(displayMetrics);
                            if (displayMetrics.heightPixels >= 2280) {
                                return true;
                            }
                        } else {
                            throw new w("null cannot be cast to non-null type");
                        }
                    }
                    return false;
                }
                return false;
            }
            throw new w("null cannot be cast to non-null type");
        } catch (Throwable unused) {
        }
    }

    private static Object a(Context context, String str) {
        Object obj;
        MethodCollector.i(13060);
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
                    MethodCollector.o(13060);
                }
            }
        } else {
            obj = context.getSystemService(str);
        }
        return obj;
    }
}
