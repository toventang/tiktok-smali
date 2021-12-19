package com.bytedance.platform.a.a;

import android.util.Pair;
import com.bytedance.covode.number.Covode;
import com.bytedance.helios.sdk.a;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

public final class h {

    /* renamed from: a  reason: collision with root package name */
    private static Map<String, Method> f41812a = new HashMap();

    /* renamed from: b  reason: collision with root package name */
    private static final HashMap<Class<?>, Class<?>> f41813b;

    static {
        Covode.recordClassIndex(25567);
        HashMap<Class<?>, Class<?>> hashMap = new HashMap<>();
        f41813b = hashMap;
        hashMap.put(Boolean.TYPE, Boolean.class);
        hashMap.put(Byte.TYPE, Byte.class);
        hashMap.put(Character.TYPE, Character.class);
        hashMap.put(Short.TYPE, Short.class);
        hashMap.put(Integer.TYPE, Integer.class);
        hashMap.put(Long.TYPE, Long.class);
        hashMap.put(Double.TYPE, Double.class);
        hashMap.put(Float.TYPE, Float.class);
        hashMap.put(Void.TYPE, Void.class);
    }

    public static Object a(Class cls, String str, Object... objArr) {
        Object[] b2 = e.b(objArr);
        return a(cls, str, b2, e.a(b2));
    }

    /* JADX INFO: finally extract failed */
    /* JADX WARNING: Removed duplicated region for block: B:100:0x00b8 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00b7  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.reflect.Method a(java.lang.Class<?> r13, java.lang.String r14, java.lang.Class... r15) {
        /*
        // Method dump skipped, instructions count: 300
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.platform.a.a.h.a(java.lang.Class, java.lang.String, java.lang.Class[]):java.lang.reflect.Method");
    }

    private static Object a(Class cls, String str, Object[] objArr, Class<?>[] clsArr) {
        if (clsArr == null || clsArr.length == 0) {
            clsArr = e.f41807b;
        }
        Object[] b2 = e.b(objArr);
        Method a2 = a((Class<?>) cls, str, (Class[]) clsArr);
        if (a2 == null) {
            return null;
        }
        Pair<Boolean, Object> a3 = a.a(a2, new Object[]{null, b2}, 110000, "java.lang.Object", true, "com_bytedance_platform_horae_common_MethodUtils_java_lang_reflect_Method_invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;");
        if (((Boolean) a3.first).booleanValue()) {
            return a3.second;
        }
        Object invoke = a2.invoke(null, b2);
        a.a(invoke, a2, new Object[]{null, b2}, "com_bytedance_platform_horae_common_MethodUtils_java_lang_reflect_Method_invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;");
        return invoke;
    }
}
