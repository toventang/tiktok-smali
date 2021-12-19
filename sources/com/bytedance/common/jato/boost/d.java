package com.bytedance.common.jato.boost;

import android.content.Context;
import android.os.Build;
import android.util.Pair;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.helios.sdk.a;
import java.lang.reflect.Method;

public final class d implements e {

    /* renamed from: a  reason: collision with root package name */
    public static Class f26797a;

    /* renamed from: b  reason: collision with root package name */
    public static Method f26798b;

    /* renamed from: c  reason: collision with root package name */
    public static Object f26799c;

    /* renamed from: d  reason: collision with root package name */
    public static volatile boolean f26800d;

    static {
        Covode.recordClassIndex(15812);
    }

    private static Object a(Method method, Object obj, Object[] objArr) {
        Pair<Boolean, Object> a2 = a.a(method, new Object[]{obj, objArr}, 110000, "java.lang.Object", true, "com_bytedance_common_jato_boost_HisiCpuBoost_java_lang_reflect_Method_invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;");
        if (((Boolean) a2.first).booleanValue()) {
            return a2.second;
        }
        Object invoke = method.invoke(obj, objArr);
        a.a(invoke, method, new Object[]{obj, objArr}, "com_bytedance_common_jato_boost_HisiCpuBoost_java_lang_reflect_Method_invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;");
        return invoke;
    }

    @Override // com.bytedance.common.jato.boost.e
    public final void a() {
    }

    @Override // com.bytedance.common.jato.boost.e
    public final boolean b(long j2) {
        return false;
    }

    @Override // com.bytedance.common.jato.boost.e
    public final void a(Context context) {
        b.f26789b.execute(new Runnable() {
            /* class com.bytedance.common.jato.boost.d.AnonymousClass1 */

            static {
                Covode.recordClassIndex(15813);
            }

            private static Object a(Method method, Object obj, Object[] objArr) {
                Pair<Boolean, Object> a2 = a.a(method, new Object[]{obj, objArr}, 110000, "java.lang.Object", true, "com_bytedance_common_jato_boost_HisiCpuBoost$1_java_lang_reflect_Method_invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;");
                if (((Boolean) a2.first).booleanValue()) {
                    return a2.second;
                }
                Object invoke = method.invoke(obj, objArr);
                a.a(invoke, method, new Object[]{obj, objArr}, "com_bytedance_common_jato_boost_HisiCpuBoost$1_java_lang_reflect_Method_invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;");
                return invoke;
            }

            public final void run() {
                boolean z;
                boolean z2;
                boolean z3;
                MethodCollector.i(2859);
                synchronized (b.class) {
                    try {
                        if (!d.f26800d) {
                            try {
                                if (Build.VERSION.SDK_INT == 29) {
                                    Class<?> a2 = com.bytedance.common.jato.c.a.a("android.scrollerboostmanager.ScrollerBoostManager");
                                    d.f26799c = a(com.bytedance.common.jato.c.a.a(a2, "getInstance", (Class<?>[]) null), a2, null);
                                    d.f26798b = com.bytedance.common.jato.c.a.a(a2, "listFling", Integer.TYPE);
                                    a2.getDeclaredMethod("init", null).invoke(d.f26799c, null);
                                    d.f26800d = true;
                                } else {
                                    if (Build.VERSION.SDK_INT == 28) {
                                        z = true;
                                    } else {
                                        z = false;
                                    }
                                    if (Build.VERSION.SDK_INT == 27) {
                                        z2 = true;
                                    } else {
                                        z2 = false;
                                    }
                                    boolean z4 = z | z2;
                                    if (Build.VERSION.SDK_INT == 26) {
                                        z3 = true;
                                    } else {
                                        z3 = false;
                                    }
                                    if (z4 || z3) {
                                        Class<?> a3 = com.bytedance.common.jato.c.a.a("android.iawareperf.UniPerf");
                                        d.f26797a = a3;
                                        d.f26798b = com.bytedance.common.jato.c.a.a(a3, "uniPerfEvent", Integer.TYPE, String.class, int[].class);
                                        d.f26799c = a(com.bytedance.common.jato.c.a.a(d.f26797a, "getInstance", new Class[0]), null, new Object[0]);
                                        d.f26800d = true;
                                    }
                                }
                            } catch (Throwable th) {
                                b.a("cpuboost init fail", th);
                            }
                            MethodCollector.o(2859);
                        }
                    } finally {
                        MethodCollector.o(2859);
                    }
                }
            }
        });
    }

    @Override // com.bytedance.common.jato.boost.e
    public final boolean a(long j2) {
        boolean z;
        boolean z2;
        boolean z3;
        if (j2 <= 0 || !f26800d) {
            return false;
        }
        try {
            if (Build.VERSION.SDK_INT == 29) {
                a(f26798b, f26799c, new Object[]{Integer.valueOf((int) j2)});
            } else {
                if (Build.VERSION.SDK_INT == 28) {
                    z = true;
                } else {
                    z = false;
                }
                if (Build.VERSION.SDK_INT == 27) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                boolean z4 = z | z2;
                if (Build.VERSION.SDK_INT == 26) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (z4 || z3) {
                    ((Integer) a(f26798b, f26799c, new Object[]{4099, "canBoost=true|screenOn=1", new int[0]})).intValue();
                }
            }
            return true;
        } catch (Throwable th) {
            b.a("cpuboost boost fail", th);
            return false;
        }
    }
}
