package com.ss.android.ugc.aweme.bh;

import android.util.Pair;
import com.bytedance.covode.number.Covode;
import com.google.android.gms.common.ConnectionResult;
import java.lang.reflect.Method;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static String f68681a;

    /* renamed from: com.ss.android.ugc.aweme.bh.a$a  reason: collision with other inner class name */
    public interface AbstractC1550a {

        /* renamed from: a  reason: collision with root package name */
        public static final String[] f68682a = null;

        static {
            Covode.recordClassIndex(42262);
        }
    }

    static {
        Covode.recordClassIndex(42260);
    }

    public static class b implements Runnable {

        /* renamed from: c  reason: collision with root package name */
        public static Method f68683c;

        /* renamed from: a  reason: collision with root package name */
        public final Object f68684a;

        /* renamed from: b  reason: collision with root package name */
        public final ConnectionResult f68685b;

        static {
            Covode.recordClassIndex(42263);
        }

        public final void run() {
            try {
                Method method = f68683c;
                if (method != null) {
                    Object obj = this.f68684a;
                    Object[] objArr = {this.f68685b};
                    Pair<Boolean, Object> a2 = com.bytedance.helios.sdk.a.a(method, new Object[]{obj, objArr}, 110000, "java.lang.Object", true, "com_ss_android_ugc_aweme_lacent_BaseGmsANRBoost$CustomRunnable_java_lang_reflect_Method_invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;");
                    if (((Boolean) a2.first).booleanValue()) {
                        Object obj2 = a2.second;
                        return;
                    }
                    com.bytedance.helios.sdk.a.a(method.invoke(obj, objArr), method, new Object[]{obj, objArr}, "com_ss_android_ugc_aweme_lacent_BaseGmsANRBoost$CustomRunnable_java_lang_reflect_Method_invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;");
                }
            } catch (Throwable unused) {
            }
        }

        public b(Object obj, ConnectionResult connectionResult) {
            this.f68684a = obj;
            this.f68685b = connectionResult;
            try {
                if (f68683c == null) {
                    Method declaredMethod = Class.forName("com.google.android.gms.common.internal.c$d").getDeclaredMethod("b", ConnectionResult.class);
                    f68683c = declaredMethod;
                    declaredMethod.setAccessible(true);
                }
            } catch (Throwable unused) {
                f68683c = null;
            }
        }
    }
}
