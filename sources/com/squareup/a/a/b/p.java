package com.squareup.a.a.b;

import android.util.Pair;
import com.bytedance.covode.number.Covode;
import com.bytedance.helios.sdk.a;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public final class p extends Exception {

    /* renamed from: a  reason: collision with root package name */
    private static final Method f57703a;
    private IOException lastException;

    public final IOException getLastConnectException() {
        return this.lastException;
    }

    static {
        Method method;
        Covode.recordClassIndex(35959);
        try {
            method = Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class);
        } catch (Exception unused) {
            method = null;
        }
        f57703a = method;
    }

    public p(IOException iOException) {
        super(iOException);
        this.lastException = iOException;
    }

    public final void addConnectException(IOException iOException) {
        IOException iOException2 = this.lastException;
        Method method = f57703a;
        if (method != null) {
            try {
                Object[] objArr = {iOException2};
                Pair<Boolean, Object> a2 = a.a(method, new Object[]{iOException, objArr}, 110000, "java.lang.Object", true, "com_squareup_okhttp_internal_http_RouteException_java_lang_reflect_Method_invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;");
                if (((Boolean) a2.first).booleanValue()) {
                    Object obj = a2.second;
                } else {
                    a.a(method.invoke(iOException, objArr), method, new Object[]{iOException, objArr}, "com_squareup_okhttp_internal_http_RouteException_java_lang_reflect_Method_invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;");
                }
            } catch (IllegalAccessException | InvocationTargetException unused) {
            }
        }
        this.lastException = iOException;
    }
}
