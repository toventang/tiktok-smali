package ms.bd.o;

import android.app.Activity;
import android.os.Build;
import android.util.ArrayMap;
import android.util.Pair;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.helios.sdk.a;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public final class c0 {
    static {
        Covode.recordClassIndex(105892);
    }

    public static byte[] a(String str) {
        int length = str.length();
        byte[] bArr = new byte[(length / 2)];
        for (int i2 = 0; i2 < length; i2 += 2) {
            bArr[i2 / 2] = (byte) (Character.digit(str.charAt(i2 + 1), 16) + (Character.digit(str.charAt(i2), 16) << 4));
        }
        return bArr;
    }

    public static Activity a() {
        Object obj;
        MethodCollector.i(10778);
        try {
            Class<?> cls = Class.forName((String) h.a(16777217, 0, 0, "3fe245", new byte[]{35, 106, 18, 84, 4, 43, 52, 9, 53, 114, 50, 42, 55, 69, 31, 43, 38, 78, 32, 123, 22, 108, 4, 67, 10, 38}));
            Method method = cls.getMethod((String) h.a(16777217, 0, 0, "16f8f9", new byte[]{35, 33, 7, 94, 92, 32, 38, 54, 52, 124, 41, 34, 28, 88, 64, 26, 58, 5, 50, 105, 36}), new Class[0]);
            Object[] objArr = new Object[0];
            Pair<Boolean, Object> a2 = a.a(method, new Object[]{null, objArr}, 110000, "java.lang.Object", true, "ms_bd_o_c0_java_lang_reflect_Method_invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;");
            if (((Boolean) a2.first).booleanValue()) {
                obj = a2.second;
            } else {
                obj = method.invoke(null, objArr);
                a.a(obj, method, new Object[]{null, objArr}, "ms_bd_o_c0_java_lang_reflect_Method_invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;");
            }
            Field declaredField = cls.getDeclaredField((String) h.a(16777217, 0, 0, "302ee4", new byte[]{47, 19, 66, 5, 83, 53, 57, 5, 106, 48, 49}));
            declaredField.setAccessible(true);
            int i2 = Build.VERSION.SDK_INT;
            ArrayMap arrayMap = (ArrayMap) declaredField.get(obj);
            if (arrayMap.size() <= 0) {
                MethodCollector.o(10778);
                return null;
            }
            for (Object obj2 : arrayMap.values()) {
                Class<?> cls2 = obj2.getClass();
                Field declaredField2 = cls2.getDeclaredField((String) h.a(16777217, 0, 0, "efbd31", new byte[]{100, 101, 4, 3, 9, 34}));
                declaredField2.setAccessible(true);
                if (!declaredField2.getBoolean(obj2)) {
                    Field declaredField3 = cls2.getDeclaredField((String) h.a(16777217, 0, 0, "1cb97d", new byte[]{33, 98, 5, 68, 30, 122, 38, 91}));
                    declaredField3.setAccessible(true);
                    Activity activity = (Activity) declaredField3.get(obj2);
                    MethodCollector.o(10778);
                    return activity;
                }
            }
            MethodCollector.o(10778);
            return null;
        } catch (Exception unused) {
            h.a(16777217, 0, 0, "a89902", new byte[]{113, 51, 117, 74});
        }
    }
}
