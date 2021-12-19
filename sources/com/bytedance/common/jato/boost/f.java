package com.bytedance.common.jato.boost;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.util.Pair;
import com.bytedance.covode.number.Covode;
import com.bytedance.helios.sdk.a;
import java.lang.reflect.Method;

public final class f implements e {

    /* renamed from: a  reason: collision with root package name */
    public static boolean f26802a;

    /* renamed from: b  reason: collision with root package name */
    public static Object f26803b;

    /* renamed from: c  reason: collision with root package name */
    public static Method f26804c;

    /* renamed from: d  reason: collision with root package name */
    public static Method f26805d;

    /* renamed from: e  reason: collision with root package name */
    public static Method f26806e;

    /* renamed from: f  reason: collision with root package name */
    public static Method f26807f;

    static {
        Covode.recordClassIndex(15815);
    }

    private static Object a(Method method, Object obj, Object[] objArr) {
        Pair<Boolean, Object> a2 = a.a(method, new Object[]{obj, objArr}, 110000, "java.lang.Object", true, "com_bytedance_common_jato_boost_MtkCpuBoost_java_lang_reflect_Method_invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;");
        if (((Boolean) a2.first).booleanValue()) {
            return a2.second;
        }
        Object invoke = method.invoke(obj, objArr);
        a.a(invoke, method, new Object[]{obj, objArr}, "com_bytedance_common_jato_boost_MtkCpuBoost_java_lang_reflect_Method_invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;");
        return invoke;
    }

    @Override // com.bytedance.common.jato.boost.e
    public final void a() {
        try {
            a(f26807f, f26803b, new Object[0]);
        } catch (Throwable th) {
            b.a("cpuboost release fail", th);
        }
    }

    @Override // com.bytedance.common.jato.boost.e
    public final boolean b(long j2) {
        return a(j2, 8);
    }

    @Override // com.bytedance.common.jato.boost.e
    public final void a(final Context context) {
        b.f26789b.execute(new Runnable() {
            /* class com.bytedance.common.jato.boost.f.AnonymousClass1 */

            static {
                Covode.recordClassIndex(15816);
            }

            public final void run() {
                try {
                    Class<?> cls = Class.forName("com.mediatek.perfservice.PerfServiceWrapper");
                    try {
                        f.f26803b = cls.getConstructor(new Class[0]).newInstance(new Object[0]);
                    } catch (Throwable unused) {
                        f.f26803b = cls.getConstructor(Context.class).newInstance(context);
                    }
                    f.f26804c = cls.getDeclaredMethod("userRegScn", new Class[0]);
                    f.f26805d = cls.getDeclaredMethod("userRegScnConfig", Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE);
                    f.f26806e = cls.getDeclaredMethod("userEnable", Integer.TYPE);
                    f.f26807f = cls.getDeclaredMethod("userResetAll", new Class[0]);
                    f.f26802a = true;
                } catch (Throwable th) {
                    b.a("cpuboost init fail", th);
                }
            }
        });
    }

    @Override // com.bytedance.common.jato.boost.e
    public final boolean a(long j2) {
        if (a(j2, 23) || a(j2, 4)) {
            return true;
        }
        return false;
    }

    private boolean a(long j2, int i2) {
        boolean z = false;
        if (j2 <= 0 || !f26802a) {
            return false;
        }
        try {
            int intValue = ((Integer) a(f26804c, f26803b, new Object[0])).intValue();
            a(f26805d, f26803b, new Object[]{Integer.valueOf(intValue), Integer.valueOf(i2), 1000, 0, 0, 0});
            a(f26806e, f26803b, new Object[]{Integer.valueOf(intValue)});
            new Handler(Looper.getMainLooper()).postDelayed(new Runnable() {
                /* class com.bytedance.common.jato.boost.f.AnonymousClass2 */

                static {
                    Covode.recordClassIndex(15817);
                }

                public final void run() {
                    try {
                        Method method = f.f26807f;
                        Object obj = f.f26803b;
                        Object[] objArr = new Object[0];
                        Pair<Boolean, Object> a2 = a.a(method, new Object[]{obj, objArr}, 110000, "java.lang.Object", true, "com_bytedance_common_jato_boost_MtkCpuBoost$2_java_lang_reflect_Method_invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;");
                        if (((Boolean) a2.first).booleanValue()) {
                            Object obj2 = a2.second;
                            return;
                        }
                        a.a(method.invoke(obj, objArr), method, new Object[]{obj, objArr}, "com_bytedance_common_jato_boost_MtkCpuBoost$2_java_lang_reflect_Method_invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;");
                    } catch (Throwable th) {
                        b.a("cpuboost boost fail", th);
                    }
                }
            }, j2);
            z = true;
            return true;
        } catch (Throwable th) {
            b.a("cpuboost boost fail", th);
            return z;
        }
    }
}
