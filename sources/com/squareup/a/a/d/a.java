package com.squareup.a.a.d;

import android.util.Pair;
import com.bytedance.covode.number.Covode;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.security.cert.TrustAnchor;
import java.security.cert.X509Certificate;
import javax.net.ssl.X509TrustManager;

public final class a implements f {

    /* renamed from: a  reason: collision with root package name */
    private final X509TrustManager f57740a;

    /* renamed from: b  reason: collision with root package name */
    private final Method f57741b;

    static {
        Covode.recordClassIndex(35968);
    }

    public static f a(X509TrustManager x509TrustManager) {
        try {
            Method declaredMethod = x509TrustManager.getClass().getDeclaredMethod("findTrustAnchorByIssuerAndSignature", X509Certificate.class);
            declaredMethod.setAccessible(true);
            return new a(x509TrustManager, declaredMethod);
        } catch (NoSuchMethodException unused) {
            return null;
        }
    }

    @Override // com.squareup.a.a.d.f
    public final X509Certificate a(X509Certificate x509Certificate) {
        Object invoke;
        try {
            Method method = this.f57741b;
            X509TrustManager x509TrustManager = this.f57740a;
            Object[] objArr = {x509Certificate};
            Pair<Boolean, Object> a2 = com.bytedance.helios.sdk.a.a(method, new Object[]{x509TrustManager, objArr}, 110000, "java.lang.Object", true, "com_squareup_okhttp_internal_tls_AndroidTrustRootIndex_java_lang_reflect_Method_invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;");
            if (((Boolean) a2.first).booleanValue()) {
                invoke = a2.second;
            } else {
                invoke = method.invoke(x509TrustManager, objArr);
                com.bytedance.helios.sdk.a.a(invoke, method, new Object[]{x509TrustManager, objArr}, "com_squareup_okhttp_internal_tls_AndroidTrustRootIndex_java_lang_reflect_Method_invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;");
            }
            TrustAnchor trustAnchor = (TrustAnchor) invoke;
            if (trustAnchor != null) {
                return trustAnchor.getTrustedCert();
            }
        } catch (IllegalAccessException unused) {
            throw new AssertionError();
        } catch (InvocationTargetException unused2) {
        }
        return null;
    }

    private a(X509TrustManager x509TrustManager, Method method) {
        this.f57741b = method;
        this.f57740a = x509TrustManager;
    }
}
