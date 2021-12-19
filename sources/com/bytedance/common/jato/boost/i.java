package com.bytedance.common.jato.boost;

import android.content.Context;
import android.util.Pair;
import com.bytedance.android.livesdk.livesetting.pullstream.LiveNetAdaptiveHurryTimeSetting;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.helios.sdk.a;
import java.lang.reflect.Method;
import java.util.concurrent.CopyOnWriteArrayList;

public final class i implements e {

    /* renamed from: a  reason: collision with root package name */
    public static Object f26822a;

    /* renamed from: b  reason: collision with root package name */
    public static Method f26823b;

    /* renamed from: c  reason: collision with root package name */
    public static Method f26824c;

    /* renamed from: d  reason: collision with root package name */
    public static volatile boolean f26825d;

    /* renamed from: e  reason: collision with root package name */
    private static int[] f26826e = {1082146816, 4095, 1082147072, 4095, 1082130432, 4095, 1082130688, 4095, 1077936128, 1};

    /* renamed from: f  reason: collision with root package name */
    private static int[] f26827f = {1115701248, 1, 1115734016, LiveNetAdaptiveHurryTimeSetting.DEFAULT};

    /* renamed from: g  reason: collision with root package name */
    private static int[] f26828g = {1077936128, 1};

    /* renamed from: h  reason: collision with root package name */
    private static int[] f26829h = {1119944704, 1};

    /* renamed from: i  reason: collision with root package name */
    private static CopyOnWriteArrayList<Integer> f26830i = new CopyOnWriteArrayList<>();

    private static Object a(Method method, Object obj, Object[] objArr) {
        Pair<Boolean, Object> a2 = a.a(method, new Object[]{obj, objArr}, 110000, "java.lang.Object", true, "com_bytedance_common_jato_boost_QcmCpuBoost_java_lang_reflect_Method_invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;");
        if (((Boolean) a2.first).booleanValue()) {
            return a2.second;
        }
        Object invoke = method.invoke(obj, objArr);
        a.a(invoke, method, new Object[]{obj, objArr}, "com_bytedance_common_jato_boost_QcmCpuBoost_java_lang_reflect_Method_invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;");
        return invoke;
    }

    static {
        Covode.recordClassIndex(15824);
    }

    @Override // com.bytedance.common.jato.boost.e
    public final void a() {
        if (!(f26824c == null || !f26825d || f26822a == null)) {
            for (int i2 = 0; i2 < f26830i.size(); i2++) {
                try {
                    a(f26824c, f26822a, new Object[]{f26830i.get(i2)});
                } catch (Throwable th) {
                    b.a("cpuboost release fail", th);
                    return;
                }
            }
        }
    }

    @Override // com.bytedance.common.jato.boost.e
    public final boolean b(long j2) {
        return a(j2, f26827f);
    }

    @Override // com.bytedance.common.jato.boost.e
    public final void a(final Context context) {
        b.f26789b.execute(new Runnable() {
            /* class com.bytedance.common.jato.boost.i.AnonymousClass1 */

            static {
                Covode.recordClassIndex(15825);
            }

            public final void run() {
                MethodCollector.i(1228);
                synchronized (b.class) {
                    try {
                        if (!i.f26825d) {
                            if (i.f26822a == null || i.f26823b == null) {
                                try {
                                    Class<?> a2 = com.bytedance.common.jato.c.a.a("android.util.BoostFramework");
                                    try {
                                        i.f26822a = com.bytedance.common.jato.c.a.a(a2, Context.class).newInstance(context);
                                    } catch (Throwable unused) {
                                        i.f26822a = com.bytedance.common.jato.c.a.a(a2, new Class[0]).newInstance(new Object[0]);
                                    }
                                    i.f26823b = com.bytedance.common.jato.c.a.a(a2, "perfLockAcquire", Integer.TYPE, int[].class);
                                    i.f26825d = true;
                                    i.f26824c = com.bytedance.common.jato.c.a.a(a2, "perfLockReleaseHandler", Integer.TYPE);
                                } catch (Throwable th) {
                                    b.a("cpuboost init fail", th);
                                }
                                MethodCollector.o(1228);
                                return;
                            }
                            MethodCollector.o(1228);
                        }
                    } finally {
                        MethodCollector.o(1228);
                    }
                }
            }
        });
    }

    @Override // com.bytedance.common.jato.boost.e
    public final boolean a(long j2) {
        a(j2, f26828g);
        return a(j2, f26826e);
    }

    private static boolean a(long j2, int[] iArr) {
        if (j2 <= 0 || !f26825d) {
            return false;
        }
        try {
            if (!(f26822a == null || f26823b == null)) {
                int intValue = ((Integer) a(f26823b, f26822a, new Object[]{Integer.valueOf((int) j2), iArr})).intValue();
                if (intValue != 0) {
                    f26830i.add(Integer.valueOf(intValue));
                }
            }
            return true;
        } catch (Throwable th) {
            b.a("cpuboost boost fail", th);
            return false;
        }
    }
}
