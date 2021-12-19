package com.ss.android.ugc.aweme.lancet.a;

import android.content.Context;
import android.content.res.AssetManager;
import android.util.Pair;
import com.bytedance.covode.number.Covode;
import com.bytedance.helios.sdk.a;
import java.lang.reflect.Method;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    private static Class<?> f107169a;

    /* renamed from: b  reason: collision with root package name */
    private static boolean f107170b;

    /* renamed from: c  reason: collision with root package name */
    private static Method f107171c;

    /* renamed from: d  reason: collision with root package name */
    private static boolean f107172d;

    /* renamed from: e  reason: collision with root package name */
    private static Method f107173e;

    /* renamed from: f  reason: collision with root package name */
    private static boolean f107174f;

    static {
        Covode.recordClassIndex(68558);
    }

    private static Object a(Method method, Object obj, Object[] objArr) {
        Pair<Boolean, Object> a2 = a.a(method, new Object[]{obj, objArr}, 110000, "java.lang.Object", true, "com_ss_android_ugc_aweme_lancet_launch_CookieManagerLancet_java_lang_reflect_Method_invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;");
        if (((Boolean) a2.first).booleanValue()) {
            return a2.second;
        }
        Object invoke = method.invoke(obj, objArr);
        a.a(invoke, method, new Object[]{obj, objArr}, "com_ss_android_ugc_aweme_lancet_launch_CookieManagerLancet_java_lang_reflect_Method_invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;");
        return invoke;
    }

    public static Context a() {
        if (!f107174f) {
            try {
                if (!f107170b) {
                    try {
                        f107169a = Class.forName("android.webkit.WebViewFactory");
                    } catch (ClassNotFoundException unused) {
                    }
                    f107170b = true;
                }
                Class<?> cls = f107169a;
                if (cls != null) {
                    Method declaredMethod = cls.getDeclaredMethod("getWebViewContextAndSetProvider", new Class[0]);
                    f107173e = declaredMethod;
                    declaredMethod.setAccessible(true);
                }
            } catch (NoSuchMethodException unused2) {
            }
            f107174f = true;
        }
        Method method = f107173e;
        if (method != null) {
            try {
                return (Context) a(method, null, new Object[0]);
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
        return null;
    }

    public static String[] a(AssetManager assetManager) {
        if (!f107172d) {
            try {
                Method declaredMethod = AssetManager.class.getDeclaredMethod("getApkPaths", new Class[0]);
                f107171c = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException unused) {
            }
            f107172d = true;
        }
        Method method = f107171c;
        if (method == null) {
            return null;
        }
        try {
            return (String[]) a(method, assetManager, new Object[0]);
        } catch (Exception e2) {
            e2.printStackTrace();
            return null;
        }
    }
}
