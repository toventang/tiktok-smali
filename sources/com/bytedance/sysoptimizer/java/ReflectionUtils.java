package com.bytedance.sysoptimizer.java;

import android.os.Build;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.sysoptimizer.SysOptimizer;
import java.lang.reflect.Field;
import java.util.Arrays;

public class ReflectionUtils {
    private static boolean sIsInit;

    static {
        Covode.recordClassIndex(27025);
    }

    private static native boolean changeTargetSuperClassToSpecificClassOnDalvik(Class<?> cls, Class<?> cls2, String str);

    public static int com_bytedance_sysoptimizer_java_ReflectionUtils_com_ss_android_ugc_aweme_lancet_LogLancet_d(String str, String str2) {
        return 0;
    }

    public static int com_bytedance_sysoptimizer_java_ReflectionUtils_com_ss_android_ugc_aweme_lancet_LogLancet_e(String str, String str2, Throwable th) {
        return 0;
    }

    private static native boolean setModifiersForDalvik(Class<?> cls, int i2, int i3, int i4, String str);

    private ReflectionUtils() {
    }

    public static boolean isArt() {
        String property = System.getProperty("java.vm.version");
        if (property == null || !property.startsWith("2")) {
            return false;
        }
        return true;
    }

    private static String getSuperClassNameInDescriptor(Class<?> cls) {
        Class<? super Object> superclass = cls.getSuperclass();
        if (superclass == null) {
            return "";
        }
        return "L" + superclass.getName().replaceAll("[.]", "/") + ";";
    }

    public static void removeFinal(Field field) {
        if (field != null) {
            int modifiers = field.getModifiers();
            int i2 = Build.VERSION.SDK_INT;
            if (i2 == 19) {
                if (isArt()) {
                    changeAccessFlagsBelowLForArt(field, modifiers & -17);
                } else {
                    changeAccessFlagsBelowLForDalvik(field, modifiers);
                }
            } else if (i2 <= 22) {
                changeAccessFlagsBelowLForArt(field, modifiers & -17);
            } else {
                changeAccessFlagsAboveL(field, modifiers & -17);
            }
        }
    }

    private static void changeAccessFlagsAboveL(Field field, int i2) {
        try {
            Field declaredField = Field.class.getDeclaredField("accessFlags");
            declaredField.setAccessible(true);
            declaredField.setInt(field, i2);
            com_bytedance_sysoptimizer_java_ReflectionUtils_com_ss_android_ugc_aweme_lancet_LogLancet_d("ReflectionUtils", "changeAccessFlagsAboveL succ");
        } catch (Throwable th) {
            com_bytedance_sysoptimizer_java_ReflectionUtils_com_ss_android_ugc_aweme_lancet_LogLancet_e("ReflectionUtils", "changeAccessFlagsAboveL", th);
        }
    }

    private static void changeAccessFlagsBelowLForArt(Field field, int i2) {
        try {
            Field declaredField = Field.class.getDeclaredField("artField");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(field);
            Field declaredField2 = obj.getClass().getDeclaredField("accessFlags");
            declaredField2.setAccessible(true);
            declaredField2.setInt(obj, i2);
            com_bytedance_sysoptimizer_java_ReflectionUtils_com_ss_android_ugc_aweme_lancet_LogLancet_d("ReflectionUtils", "changeAccessFlagsOnL succ");
        } catch (Throwable th) {
            com_bytedance_sysoptimizer_java_ReflectionUtils_com_ss_android_ugc_aweme_lancet_LogLancet_e("ReflectionUtils", "changeAccessFlagBelowL error", th);
        }
    }

    public static void changeIfTableFrom(Object obj, Object obj2) {
        if (obj2 != null && obj != null) {
            try {
                Class<?> cls = obj2.getClass();
                Class<?> cls2 = obj.getClass();
                Field declaredField = Class.class.getDeclaredField("ifTable");
                declaredField.setAccessible(true);
                Object[] objArr = (Object[]) declaredField.get(cls);
                if (!Arrays.equals(objArr, (Object[]) declaredField.get(cls2))) {
                    declaredField.set(cls2, objArr);
                    com_bytedance_sysoptimizer_java_ReflectionUtils_com_ss_android_ugc_aweme_lancet_LogLancet_d("ReflectionUtils", "change ifTable succ");
                }
            } catch (Throwable th) {
                com_bytedance_sysoptimizer_java_ReflectionUtils_com_ss_android_ugc_aweme_lancet_LogLancet_e("ReflectionUtils", "changeIfTable", th);
            }
        }
    }

    private static void changeSuperClass(Class<?> cls, Class<?> cls2) {
        MethodCollector.i(13237);
        if (Build.VERSION.SDK_INT > 19 || isArt()) {
            Field declaredField = Class.class.getDeclaredField("superClass");
            declaredField.setAccessible(true);
            declaredField.set(cls, cls2);
            MethodCollector.o(13237);
            return;
        }
        changeTargetSuperClassToSpecificClassOnDalvik(cls, cls2, getSuperClassNameInDescriptor(cls));
        MethodCollector.o(13237);
    }

    private static void changeAccessFlagsBelowLForDalvik(Field field, int i2) {
        MethodCollector.i(13239);
        if (!sIsInit) {
            sIsInit = SysOptimizer.loadOptimizerLibrary(null);
        }
        if (sIsInit) {
            try {
                Field declaredField = Field.class.getDeclaredField("slot");
                declaredField.setAccessible(true);
                int i3 = declaredField.getInt(field);
                Field declaredField2 = Field.class.getDeclaredField("declaringClass");
                declaredField2.setAccessible(true);
                Class cls = (Class) declaredField2.get(field);
                com_bytedance_sysoptimizer_java_ReflectionUtils_com_ss_android_ugc_aweme_lancet_LogLancet_d("ReflectionUtils", "slot = " + i3 + ", accessFlags = " + i2 + ", modifiers = " + field.getModifiers());
                com_bytedance_sysoptimizer_java_ReflectionUtils_com_ss_android_ugc_aweme_lancet_LogLancet_d("ReflectionUtils", "setModifiers succ = " + setModifiersForDalvik(cls, i3, i2, field.getModifiers(), cls.getName()));
                MethodCollector.o(13239);
                return;
            } catch (Throwable th) {
                com_bytedance_sysoptimizer_java_ReflectionUtils_com_ss_android_ugc_aweme_lancet_LogLancet_e("ReflectionUtils", "slotField", th);
            }
        }
        MethodCollector.o(13239);
    }

    public static void changeField2Target(Object obj, Field field, Object obj2, Object obj3) {
        if (field != null && obj != null && obj2 != null && obj3 != null) {
            try {
                Class<?> cls = obj3.getClass();
                Class<?> cls2 = obj2.getClass();
                if (!cls2.equals(cls)) {
                    changeSuperClass(cls, cls2);
                }
                field.set(obj, obj3);
                com_bytedance_sysoptimizer_java_ReflectionUtils_com_ss_android_ugc_aweme_lancet_LogLancet_d("ReflectionUtils", "changeField2Target succ");
            } catch (Throwable th) {
                com_bytedance_sysoptimizer_java_ReflectionUtils_com_ss_android_ugc_aweme_lancet_LogLancet_e("ReflectionUtils", "changeField2Target", th);
            }
        }
    }
}
