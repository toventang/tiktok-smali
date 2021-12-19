package com.bytedance.android.monitor.webview;

import android.util.Pair;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import com.bytedance.covode.number.Covode;
import com.bytedance.helios.sdk.a;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public final class k implements InvocationHandler {

    /* renamed from: a  reason: collision with root package name */
    Class<?> f23787a;

    /* renamed from: b  reason: collision with root package name */
    Object f23788b;

    static {
        Covode.recordClassIndex(14081);
    }

    private static Object a(Method method, Object obj, Object[] objArr) {
        Pair<Boolean, Object> a2 = a.a(method, new Object[]{obj, objArr}, 110000, "java.lang.Object", true, "com_bytedance_android_monitor_webview_TTWebViewClientDelegateHandler_java_lang_reflect_Method_invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;");
        if (((Boolean) a2.first).booleanValue()) {
            return a2.second;
        }
        Object invoke = method.invoke(obj, objArr);
        a.a(invoke, method, new Object[]{obj, objArr}, "com_bytedance_android_monitor_webview_TTWebViewClientDelegateHandler_java_lang_reflect_Method_invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;");
        return invoke;
    }

    @Override // java.lang.reflect.InvocationHandler
    public final Object invoke(Object obj, Method method, Object[] objArr) {
        if (!((i) i.f23764a).c()) {
            return a(method, this.f23788b, objArr);
        }
        if ("onPageStarted".equals(method.getName())) {
            ((i) i.f23764a).d((WebView) objArr[0], (String) objArr[1]);
            return a(method, this.f23788b, objArr);
        } else if ("onPageFinished".equals(method.getName())) {
            ((i) i.f23764a).f((WebView) objArr[0], (String) objArr[1]);
            return a(method, this.f23788b, objArr);
        } else if ("onReceivedError".equals(method.getName()) && objArr.length == 3) {
            ((i) i.f23764a).b((WebView) objArr[0], (WebResourceRequest) objArr[1], (WebResourceError) objArr[2]);
            return a(method, this.f23788b, objArr);
        } else if ("onReceivedError".equals(method.getName()) && objArr.length == 4) {
            ((i) i.f23764a).b((WebView) objArr[0], ((Integer) objArr[1]).intValue(), (String) objArr[2], (String) objArr[3]);
            return a(method, this.f23788b, objArr);
        } else if (!"onReceivedHttpError".equals(method.getName()) || objArr.length != 3) {
            return a(method, this.f23788b, objArr);
        } else {
            ((i) i.f23764a).b((WebView) objArr[0], (WebResourceRequest) objArr[1], (WebResourceResponse) objArr[2]);
            return a(method, this.f23788b, objArr);
        }
    }
}
