package com.bytedance.nita.e;

import android.util.Pair;
import com.bytedance.covode.number.Covode;
import com.bytedance.helios.sdk.a;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    private static Method f41662a;

    static {
        Covode.recordClassIndex(25493);
    }

    public static <T> T a(Object obj, String str) {
        Object invoke;
        try {
            if (f41662a == null) {
                f41662a = Class.class.getDeclaredMethod("getDeclaredField", String.class);
            }
            Method method = f41662a;
            Class<?> cls = obj.getClass();
            Object[] objArr = {str};
            Pair<Boolean, Object> a2 = a.a(method, new Object[]{cls, objArr}, 110000, "java.lang.Object", true, "com_bytedance_nita_utils_ReflectUtils_java_lang_reflect_Method_invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;");
            if (((Boolean) a2.first).booleanValue()) {
                invoke = a2.second;
            } else {
                invoke = method.invoke(cls, objArr);
                a.a(invoke, method, new Object[]{cls, objArr}, "com_bytedance_nita_utils_ReflectUtils_java_lang_reflect_Method_invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;");
            }
            Field field = (Field) invoke;
            field.setAccessible(true);
            return (T) field.get(obj);
        } catch (Exception e2) {
            e2.printStackTrace();
            return null;
        }
    }
}
