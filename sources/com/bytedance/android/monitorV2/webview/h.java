package com.bytedance.android.monitorV2.webview;

import android.util.Pair;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import com.bytedance.android.monitorV2.HybridMultiMonitor;
import com.bytedance.android.monitorV2.webview.d;
import com.bytedance.covode.number.Covode;
import com.bytedance.helios.sdk.a;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public final class h implements InvocationHandler {

    /* renamed from: a  reason: collision with root package name */
    Class<?> f24215a;

    /* renamed from: b  reason: collision with root package name */
    Object f24216b;

    static {
        Covode.recordClassIndex(14249);
    }

    private static Object a(Method method, Object obj, Object[] objArr) {
        Pair<Boolean, Object> a2 = a.a(method, new Object[]{obj, objArr}, 110000, "java.lang.Object", true, "com_bytedance_android_monitorV2_webview_TTWebViewClientDelegateHandler_java_lang_reflect_Method_invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;");
        if (((Boolean) a2.first).booleanValue()) {
            return a2.second;
        }
        Object invoke = method.invoke(obj, objArr);
        a.a(invoke, method, new Object[]{obj, objArr}, "com_bytedance_android_monitorV2_webview_TTWebViewClientDelegateHandler_java_lang_reflect_Method_invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;");
        return invoke;
    }

    @Override // java.lang.reflect.InvocationHandler
    public final Object invoke(Object obj, Method method, Object[] objArr) {
        d.a w;
        if (!((n) n.f24264a).c()) {
            return a(method, this.f24216b, objArr);
        }
        if ("onPageStarted".equals(method.getName())) {
            ((n) n.f24264a).d((WebView) objArr[0], (String) objArr[1]);
            return a(method, this.f24216b, objArr);
        } else if ("onPageFinished".equals(method.getName())) {
            ((n) n.f24264a).f((WebView) objArr[0], (String) objArr[1]);
            return a(method, this.f24216b, objArr);
        } else if ("onReceivedError".equals(method.getName()) && objArr.length == 3) {
            ((n) n.f24264a).b((WebView) objArr[0], (WebResourceRequest) objArr[1], (WebResourceError) objArr[2]);
            return a(method, this.f24216b, objArr);
        } else if ("onReceivedError".equals(method.getName()) && objArr.length == 4) {
            ((n) n.f24264a).b((WebView) objArr[0], ((Integer) objArr[1]).intValue(), (String) objArr[2], (String) objArr[3]);
            return a(method, this.f24216b, objArr);
        } else if ("onReceivedHttpError".equals(method.getName()) && objArr.length == 3) {
            ((n) n.f24264a).b((WebView) objArr[0], (WebResourceRequest) objArr[1], (WebResourceResponse) objArr[2]);
            return a(method, this.f24216b, objArr);
        } else if (!"onRenderProcessGone".equals(method.getName()) || objArr.length != 2) {
            return a(method, this.f24216b, objArr);
        } else {
            n nVar = (n) n.f24264a;
            WebView webView = (WebView) objArr[0];
            RenderProcessGoneDetail renderProcessGoneDetail = (RenderProcessGoneDetail) objArr[1];
            try {
                if (nVar.b()) {
                    if (webView != null) {
                        if (renderProcessGoneDetail != null) {
                            if (nVar.g(webView) && (w = nVar.w(webView)) != null) {
                                if (n.a(w.f24200j)) {
                                    if (nVar.s(webView) != null) {
                                        e eVar = w.f24192b;
                                        if (eVar != null) {
                                            eVar.a(webView, renderProcessGoneDetail);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            } catch (Exception unused) {
                HybridMultiMonitor.getInstance().getExceptionHandler();
            }
            return a(method, this.f24216b, objArr);
        }
    }
}
