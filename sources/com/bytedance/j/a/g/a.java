package com.bytedance.j.a.g;

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
import java.lang.reflect.Method;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static int f39052a = -1;

    /* renamed from: b  reason: collision with root package name */
    public static int f39053b = -1;

    /* renamed from: c  reason: collision with root package name */
    public static final a f39054c = new a();

    /* renamed from: d  reason: collision with root package name */
    private static int f39055d = -1;

    /* renamed from: e  reason: collision with root package name */
    private static int f39056e = -1;

    private a() {
    }

    static {
        Covode.recordClassIndex(23910);
    }

    public static boolean a() {
        int i2 = f39055d;
        boolean z = false;
        if (i2 == -1) {
            try {
                Class<?> cls = Class.forName("android.util.FtFeature");
                l.a((Object) cls, "");
                Method declaredMethod = cls.getDeclaredMethod("isFeatureSupport", Integer.TYPE);
                l.a((Object) declaredMethod, "");
                Object invoke = declaredMethod.invoke(cls, 32);
                if (invoke != null) {
                    z = ((Boolean) invoke).booleanValue();
                    int i3 = z ? 1 : 0;
                    int i4 = z ? 1 : 0;
                    int i5 = z ? 1 : 0;
                    f39055d = i3;
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

    public static boolean b(Context context) {
        l.c(context, "");
        int i2 = f39056e;
        boolean z = false;
        if (i2 == -1) {
            try {
                Class<?> loadClass = context.getClassLoader().loadClass("com.huawei.android.util.HwNotchSizeUtil");
                Method method = loadClass.getMethod("hasNotchInScreen", new Class[0]);
                l.a((Object) method, "");
                Object invoke = method.invoke(loadClass, new Object[0]);
                if (invoke != null) {
                    z = ((Boolean) invoke).booleanValue();
                    int i3 = z ? 1 : 0;
                    int i4 = z ? 1 : 0;
                    int i5 = z ? 1 : 0;
                    f39056e = i3;
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

    public static int[] c(Context context) {
        int[] iArr = {0, 0};
        if (context == null) {
            return iArr;
        }
        try {
            Class<?> loadClass = context.getClassLoader().loadClass("com.huawei.android.util.HwNotchSizeUtil");
            Method method = loadClass.getMethod("getNotchSize", new Class[0]);
            l.a((Object) method, "");
            Object invoke = method.invoke(loadClass, new Object[0]);
            if (invoke != null) {
                return (int[]) invoke;
            }
            throw new w("null cannot be cast to non-null type");
        } catch (Exception unused) {
            return iArr;
        }
    }

    public static boolean a(Context context) {
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
        MethodCollector.i(3324);
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
                    MethodCollector.o(3324);
                }
            }
        } else {
            obj = context.getSystemService(str);
        }
        return obj;
    }
}
