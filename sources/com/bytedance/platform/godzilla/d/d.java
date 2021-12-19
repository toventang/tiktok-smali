package com.bytedance.platform.godzilla.d;

import android.util.Pair;
import com.bytedance.covode.number.Covode;
import com.bytedance.helios.sdk.a;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    private static Map<String, Method> f41987a = new HashMap();

    /* renamed from: b  reason: collision with root package name */
    private static final HashMap<Class<?>, Class<?>> f41988b;

    static {
        Covode.recordClassIndex(25659);
        HashMap<Class<?>, Class<?>> hashMap = new HashMap<>();
        f41988b = hashMap;
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
        Object[] b2 = b.b(objArr);
        return a(cls, str, b2, b.a(b2));
    }

    /* JADX INFO: finally extract failed */
    /* JADX WARNING: Removed duplicated region for block: B:102:0x00be A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0097  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x00bd  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x010b A[LOOP:1: B:19:0x006e->B:73:0x010b, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x0104 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.reflect.Method a(java.lang.Class<?> r13, java.lang.String r14, java.lang.Class... r15) {
        /*
        // Method dump skipped, instructions count: 306
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.platform.godzilla.d.d.a(java.lang.Class, java.lang.String, java.lang.Class[]):java.lang.reflect.Method");
    }

    private static Object a(Class cls, String str, Object[] objArr, Class<?>[] clsArr) {
        if (clsArr == null || clsArr.length == 0) {
            clsArr = b.f41984b;
        }
        Object[] b2 = b.b(objArr);
        Method a2 = a((Class<?>) cls, str, (Class[]) clsArr);
        if (a2 == null) {
            return null;
        }
        Pair<Boolean, Object> a3 = a.a(a2, new Object[]{null, b2}, 110000, "java.lang.Object", true, "com_bytedance_platform_godzilla_utils_MethodUtils_java_lang_reflect_Method_invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;");
        if (((Boolean) a3.first).booleanValue()) {
            return a3.second;
        }
        Object invoke = a2.invoke(null, b2);
        a.a(invoke, a2, new Object[]{null, b2}, "com_bytedance_platform_godzilla_utils_MethodUtils_java_lang_reflect_Method_invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;");
        return invoke;
    }
}
