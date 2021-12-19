package com.ttnet.org.chromium.net;

import android.net.TrafficStats;
import android.util.Pair;
import com.bytedance.covode.number.Covode;
import com.bytedance.helios.sdk.a;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public final class y {

    /* renamed from: a  reason: collision with root package name */
    private static final Method f155888a;

    /* renamed from: b  reason: collision with root package name */
    private static final Method f155889b;

    private static Object a(Method method, Object[] objArr) {
        Pair<Boolean, Object> a2 = a.a(method, new Object[]{null, objArr}, 110000, "java.lang.Object", true, "com_ttnet_org_chromium_net_ThreadStatsUid_java_lang_reflect_Method_invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;");
        if (((Boolean) a2.first).booleanValue()) {
            return a2.second;
        }
        Object invoke = method.invoke(null, objArr);
        a.a(invoke, method, new Object[]{null, objArr}, "com_ttnet_org_chromium_net_ThreadStatsUid_java_lang_reflect_Method_invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;");
        return invoke;
    }

    public static void a() {
        try {
            a(f155889b, new Object[0]);
        } catch (IllegalAccessException e2) {
            throw new RuntimeException("TrafficStats.clearThreadStatsUid failed", e2);
        } catch (InvocationTargetException e3) {
            throw new RuntimeException("TrafficStats.clearThreadStatsUid failed", e3);
        }
    }

    static {
        Covode.recordClassIndex(103576);
        try {
            f155888a = TrafficStats.class.getMethod("setThreadStatsUid", Integer.TYPE);
            f155889b = TrafficStats.class.getMethod("clearThreadStatsUid", new Class[0]);
        } catch (NoSuchMethodException | SecurityException e2) {
            throw new RuntimeException("Unable to get TrafficStats methods", e2);
        }
    }

    public static void a(int i2) {
        try {
            a(f155888a, new Object[]{Integer.valueOf(i2)});
        } catch (IllegalAccessException e2) {
            throw new RuntimeException("TrafficStats.setThreadStatsUid failed", e2);
        } catch (InvocationTargetException e3) {
            throw new RuntimeException("TrafficStats.setThreadStatsUid failed", e3);
        }
    }
}
