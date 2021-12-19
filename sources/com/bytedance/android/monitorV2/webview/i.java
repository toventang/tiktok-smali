package com.bytedance.android.monitorV2.webview;

import android.util.Pair;
import android.webkit.WebView;
import com.bytedance.covode.number.Covode;
import com.bytedance.helios.sdk.a;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public final class i implements InvocationHandler {

    /* renamed from: a  reason: collision with root package name */
    Class<?> f24217a;

    /* renamed from: b  reason: collision with root package name */
    Object f24218b;

    static {
        Covode.recordClassIndex(14250);
    }

    private static Object a(Method method, Object obj, Object[] objArr) {
        Pair<Boolean, Object> a2 = a.a(method, new Object[]{obj, objArr}, 110000, "java.lang.Object", true, "com_bytedance_android_monitorV2_webview_TTWebViewDelegateHandler_java_lang_reflect_Method_invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;");
        if (((Boolean) a2.first).booleanValue()) {
            return a2.second;
        }
        Object invoke = method.invoke(obj, objArr);
        a.a(invoke, method, new Object[]{obj, objArr}, "com_bytedance_android_monitorV2_webview_TTWebViewDelegateHandler_java_lang_reflect_Method_invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;");
        return invoke;
    }

    @Override // java.lang.reflect.InvocationHandler
    public final Object invoke(Object obj, Method method, Object[] objArr) {
        if (!((n) n.f24264a).c()) {
            return a(method, this.f24218b, objArr);
        }
        if ("init".equals(method.getName())) {
            ((n) n.f24264a).k((WebView) objArr[0]);
            return a(method, this.f24218b, objArr);
        } else if ("loadUrl".equals(method.getName())) {
            ((n) n.f24264a).h((WebView) objArr[0], (String) objArr[1]);
            return a(method, this.f24218b, objArr);
        } else if ("goBack".equals(method.getName())) {
            ((n) n.f24264a).q((WebView) objArr[0]);
            return a(method, this.f24218b, objArr);
        } else if ("reload".equals(method.getName())) {
            ((n) n.f24264a).o((WebView) objArr[0]);
            return a(method, this.f24218b, objArr);
        } else if ("destroy".equals(method.getName())) {
            ((n) n.f24264a).m((WebView) objArr[0]);
            return a(method, this.f24218b, objArr);
        } else if (!"onAttachedToWindow".equals(method.getName())) {
            return a(method, this.f24218b, objArr);
        } else {
            ((n) n.f24264a).u((WebView) objArr[0]);
            return a(method, this.f24218b, objArr);
        }
    }
}
