package com.bytedance.disk.e.b;

import android.util.Pair;
import com.bytedance.covode.number.Covode;
import java.lang.reflect.Method;

public final class c {
    static {
        Covode.recordClassIndex(16790);
    }

    public static class a<T> {

        /* renamed from: a  reason: collision with root package name */
        Method f28578a;

        static {
            Covode.recordClassIndex(16791);
        }

        public final T a(Object obj, Object[] objArr) {
            try {
                Method method = this.f28578a;
                Pair<Boolean, Object> a2 = com.bytedance.helios.sdk.a.a(method, new Object[]{obj, objArr}, 110000, "java.lang.Object", true, "com_bytedance_disk_migrateapi_utils_RefUtils$MethodRef_java_lang_reflect_Method_invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;");
                if (((Boolean) a2.first).booleanValue()) {
                    return (T) a2.second;
                }
                T t = (T) method.invoke(obj, objArr);
                com.bytedance.helios.sdk.a.a(t, method, new Object[]{obj, objArr}, "com_bytedance_disk_migrateapi_utils_RefUtils$MethodRef_java_lang_reflect_Method_invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;");
                return t;
            } catch (Exception unused) {
                return null;
            }
        }

        public a(String str, String str2, Class[] clsArr) {
            try {
                this.f28578a = c.a(Class.forName(str), str2, clsArr);
            } catch (Exception unused) {
            }
            Method method = this.f28578a;
            if (method != null) {
                method.setAccessible(true);
            }
        }
    }

    public static Method a(Class cls, String str, Class[] clsArr) {
        if (!(cls == null || str == null)) {
            try {
                return cls.getDeclaredMethod(str, clsArr);
            } catch (NoSuchMethodException unused) {
            }
        }
        return null;
    }
}
