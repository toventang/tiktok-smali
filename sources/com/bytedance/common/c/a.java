package com.bytedance.common.c;

import android.os.Build;
import android.util.Pair;
import android.webkit.WebSettings;
import android.webkit.WebView;
import com.bytedance.covode.number.Covode;
import java.lang.reflect.Method;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static Method f26742a;

    /* renamed from: b  reason: collision with root package name */
    public static Method f26743b;

    /* renamed from: c  reason: collision with root package name */
    static boolean f26744c;

    static {
        Covode.recordClassIndex(15769);
    }

    public static Object a(Method method, Object obj) {
        Pair<Boolean, Object> a2 = com.bytedance.helios.sdk.a.a(method, new Object[]{obj, null}, 110000, "java.lang.Object", true, "com_bytedance_common_util_HoneyCombV11Compat_java_lang_reflect_Method_invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;");
        if (((Boolean) a2.first).booleanValue()) {
            return a2.second;
        }
        Object invoke = method.invoke(obj, null);
        com.bytedance.helios.sdk.a.a(invoke, method, new Object[]{obj, null}, "com_bytedance_common_util_HoneyCombV11Compat_java_lang_reflect_Method_invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;");
        return invoke;
    }

    public static void a() {
        if (!f26744c) {
            f26744c = true;
            try {
                f26742a = WebView.class.getMethod("onPause", null);
                f26743b = WebView.class.getMethod("onResume", null);
            } catch (Exception unused) {
            }
        }
    }

    public static void a(WebSettings webSettings) {
        int i2 = Build.VERSION.SDK_INT;
        webSettings.setDisplayZoomControls(false);
    }
}
