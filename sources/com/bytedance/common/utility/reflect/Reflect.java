package com.bytedance.common.utility.reflect;

import android.util.Pair;
import com.bytedance.covode.number.Covode;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Proxy;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;

public final class Reflect {
    private final boolean isClass;
    public final Object object;

    public static class a {
        static {
            Covode.recordClassIndex(15924);
        }
    }

    static {
        Covode.recordClassIndex(15922);
    }

    private static Object com_bytedance_common_utility_reflect_Reflect_java_lang_reflect_Method_invoke(Method method, Object obj, Object[] objArr) {
        Pair<Boolean, Object> a2 = com.bytedance.helios.sdk.a.a(method, new Object[]{obj, objArr}, 110000, "java.lang.Object", true, "com_bytedance_common_utility_reflect_Reflect_java_lang_reflect_Method_invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;");
        if (((Boolean) a2.first).booleanValue()) {
            return a2.second;
        }
        Object invoke = method.invoke(obj, objArr);
        com.bytedance.helios.sdk.a.a(invoke, method, new Object[]{obj, objArr}, "com_bytedance_common_utility_reflect_Reflect_java_lang_reflect_Method_invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;");
        return invoke;
    }

    public final <T> T get() {
        return (T) this.object;
    }

    public final Reflect create() {
        return create(new Object[0]);
    }

    public final int hashCode() {
        return this.object.hashCode();
    }

    public final String toString() {
        return this.object.toString();
    }

    public final Class<?> type() {
        if (this.isClass) {
            return (Class) this.object;
        }
        return this.object.getClass();
    }

    public final Map<String, Reflect> fields() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Class<?> type = type();
        do {
            Field[] declaredFields = type.getDeclaredFields();
            for (Field field : declaredFields) {
                if ((!this.isClass) ^ Modifier.isStatic(field.getModifiers())) {
                    String name = field.getName();
                    if (!linkedHashMap.containsKey(name)) {
                        linkedHashMap.put(name, field(name, new Class[0]));
                    }
                }
            }
            type = type.getSuperclass();
        } while (type != null);
        return linkedHashMap;
    }

    private Reflect(Object obj) {
        this.object = obj;
    }

    public static Reflect on(Class<?> cls) {
        return new Reflect(cls);
    }

    private Reflect(Class<?> cls) {
        this.object = cls;
        this.isClass = true;
    }

    private static Class<?> forName(String str) {
        try {
            return Class.forName(str);
        } catch (Exception e2) {
            throw new b(e2);
        }
    }

    public static Reflect on(Object obj) {
        return new Reflect(obj);
    }

    private static Object unwrap(Object obj) {
        if (obj instanceof Reflect) {
            return ((Reflect) obj).get();
        }
        return obj;
    }

    public final Reflect call(String str) {
        return call(str, null, new Object[0]);
    }

    public static Reflect on(String str) {
        return on(forName(str));
    }

    public static Class<?>[] types(Object... objArr) {
        Class<?> cls;
        if (objArr == null) {
            return new Class[0];
        }
        Class<?>[] clsArr = new Class[objArr.length];
        for (int i2 = 0; i2 < objArr.length; i2++) {
            Object obj = objArr[i2];
            if (obj == null) {
                cls = a.class;
            } else {
                cls = obj.getClass();
            }
            clsArr[i2] = cls;
        }
        return clsArr;
    }

    public final <P> P as(Class<P> cls) {
        final boolean z = this.object instanceof Map;
        AnonymousClass1 r3 = new InvocationHandler() {
            /* class com.bytedance.common.utility.reflect.Reflect.AnonymousClass1 */

            static {
                Covode.recordClassIndex(15923);
            }

            @Override // java.lang.reflect.InvocationHandler
            public final Object invoke(Object obj, Method method, Object[] objArr) {
                int length;
                String name = method.getName();
                try {
                    return Reflect.on(Reflect.this.object).call(name, Reflect.types(objArr), objArr).get();
                } catch (b e2) {
                    if (z) {
                        Map map = (Map) Reflect.this.object;
                        if (objArr == null) {
                            length = 0;
                        } else {
                            length = objArr.length;
                        }
                        if (length == 0 && name.startsWith("get")) {
                            return map.get(Reflect.property(name.substring(3)));
                        }
                        if (length == 0 && name.startsWith("is")) {
                            return map.get(Reflect.property(name.substring(2)));
                        }
                        if (length == 1 && name.startsWith("set")) {
                            map.put(Reflect.property(name.substring(3)), objArr[0]);
                            return null;
                        }
                    }
                    throw e2;
                }
            }
        };
        return (P) Proxy.newProxyInstance(cls.getClassLoader(), new Class[]{cls}, r3);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof Reflect) {
            return this.object.equals(((Reflect) obj).get());
        }
        return false;
    }

    public static <T extends AccessibleObject> T accessible(T t) {
        if (t == null) {
            return null;
        }
        if (t instanceof Member) {
            Member member = (Member) t;
            if (Modifier.isPublic(member.getModifiers()) && Modifier.isPublic(member.getDeclaringClass().getModifiers())) {
                return t;
            }
        }
        if (!t.isAccessible()) {
            t.setAccessible(true);
        }
        return t;
    }

    public static String property(String str) {
        int length = str.length();
        if (length == 0) {
            return "";
        }
        if (length == 1) {
            return str.toLowerCase(Locale.getDefault());
        }
        return str.substring(0, 1).toLowerCase(Locale.getDefault()) + str.substring(1);
    }

    public final Reflect create(Object... objArr) {
        Class<?>[] types = types(objArr);
        try {
            return on(type().getDeclaredConstructor(types), objArr);
        } catch (NoSuchMethodException e2) {
            Constructor<?>[] declaredConstructors = type().getDeclaredConstructors();
            for (Constructor<?> constructor : declaredConstructors) {
                if (match(constructor.getParameterTypes(), types)) {
                    return on(constructor, objArr);
                }
            }
            throw new b(e2);
        }
    }

    public static Class<?> wrapper(Class<?> cls) {
        if (cls == null) {
            return null;
        }
        if (!cls.isPrimitive()) {
            return cls;
        }
        if (Boolean.TYPE == cls) {
            return Boolean.class;
        }
        if (Integer.TYPE == cls) {
            return Integer.class;
        }
        if (Long.TYPE == cls) {
            return Long.class;
        }
        if (Short.TYPE == cls) {
            return Short.class;
        }
        if (Byte.TYPE == cls) {
            return Byte.class;
        }
        if (Double.TYPE == cls) {
            return Double.class;
        }
        if (Float.TYPE == cls) {
            return Float.class;
        }
        if (Character.TYPE == cls) {
            return Character.class;
        }
        if (Void.TYPE == cls) {
            return Void.class;
        }
        return cls;
    }

    public final Field exactField(String str, Class<?>... clsArr) {
        return field0(str, clsArr);
    }

    public final <T> T get(String str, Class<?>... clsArr) {
        return (T) field(str, clsArr).get();
    }

    public final Reflect field(String str, Class<?>... clsArr) {
        try {
            return on(field0(str, clsArr).get(this.object));
        } catch (Exception e2) {
            throw new b(e2);
        }
    }

    public final Reflect set(String str, Object obj) {
        try {
            field0(str, new Class[0]).set(this.object, unwrap(obj));
            return this;
        } catch (Exception e2) {
            throw new b(e2);
        }
    }

    private boolean match(Class<?>[] clsArr, Class<?>[] clsArr2) {
        if (clsArr.length != clsArr2.length) {
            return false;
        }
        for (int i2 = 0; i2 < clsArr2.length; i2++) {
            if (!(clsArr2[i2] == a.class || wrapper(clsArr[i2]).isAssignableFrom(wrapper(clsArr2[i2])))) {
                return false;
            }
        }
        return true;
    }

    private static Reflect on(Constructor<?> constructor, Object... objArr) {
        try {
            return on(((Constructor) accessible(constructor)).newInstance(objArr));
        } catch (Exception e2) {
            throw new b(e2);
        }
    }

    private Field field0(String str, Class<?>... clsArr) {
        Class<?> type = type();
        if (clsArr == null || clsArr.length <= 0) {
            try {
                return type.getField(str);
            } catch (NoSuchFieldException e2) {
                do {
                    try {
                        return (Field) accessible(type.getDeclaredField(str));
                    } catch (NoSuchFieldException e3) {
                        e3.printStackTrace();
                        type = type.getSuperclass();
                        if (type != null) {
                            throw new b(e2);
                        }
                    }
                } while (type != null);
                throw new b(e2);
            }
        } else {
            do {
                try {
                    Field[] declaredFields = type.getDeclaredFields();
                    for (Field field : declaredFields) {
                        Class<?> type2 = field.getType();
                        if (type2 != null && type2.getName().equals(clsArr[0].getName()) && field.getName().equals(str)) {
                            return (Field) accessible(field);
                        }
                    }
                } catch (Exception e4) {
                    e4.printStackTrace();
                }
                type = type.getSuperclass();
            } while (type != null);
            throw new b("NoSuchFieldException");
        }
    }

    private Method similarMethod(String str, Class<?>[] clsArr) {
        Class<?> type = type();
        Method[] methods = type.getMethods();
        for (Method method : methods) {
            if (isSimilarSignature(method, str, clsArr)) {
                return method;
            }
        }
        do {
            Method[] declaredMethods = type.getDeclaredMethods();
            for (Method method2 : declaredMethods) {
                if (isSimilarSignature(method2, str, clsArr)) {
                    return method2;
                }
            }
            type = type.getSuperclass();
        } while (type != null);
        throw new NoSuchMethodException("No similar method " + str + " with params " + Arrays.toString(clsArr) + " could be found on type " + type() + ".");
    }

    private boolean isSimilarSignature(Method method, String str, Class<?>[] clsArr) {
        if (!method.getName().equals(str) || !match(method.getParameterTypes(), clsArr)) {
            return false;
        }
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0015, code lost:
        return on(similarMethod(r3, r4), r2.object, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0016, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x001c, code lost:
        throw new com.bytedance.common.utility.reflect.b(r1);
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x000b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.bytedance.common.utility.reflect.Reflect call(java.lang.String r3, java.lang.Class<?>[] r4, java.lang.Object... r5) {
        /*
            r2 = this;
            java.lang.reflect.Method r1 = r2.exactMethod(r3, r4, r5)     // Catch:{ NoSuchMethodException -> 0x000b }
            java.lang.Object r0 = r2.object     // Catch:{ NoSuchMethodException -> 0x000b }
            com.bytedance.common.utility.reflect.Reflect r0 = on(r1, r0, r5)     // Catch:{ NoSuchMethodException -> 0x000b }
            return r0
        L_0x000b:
            java.lang.reflect.Method r1 = r2.similarMethod(r3, r4)     // Catch:{ NoSuchMethodException -> 0x0016 }
            java.lang.Object r0 = r2.object     // Catch:{ NoSuchMethodException -> 0x0016 }
            com.bytedance.common.utility.reflect.Reflect r0 = on(r1, r0, r5)     // Catch:{ NoSuchMethodException -> 0x0016 }
            return r0
        L_0x0016:
            r1 = move-exception
            com.bytedance.common.utility.reflect.b r0 = new com.bytedance.common.utility.reflect.b
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.common.utility.reflect.Reflect.call(java.lang.String, java.lang.Class[], java.lang.Object[]):com.bytedance.common.utility.reflect.Reflect");
    }

    private static Reflect on(Method method, Object obj, Object... objArr) {
        try {
            accessible(method);
            if (method.getReturnType() != Void.TYPE) {
                return on(com_bytedance_common_utility_reflect_Reflect_java_lang_reflect_Method_invoke(method, obj, objArr));
            }
            com_bytedance_common_utility_reflect_Reflect_java_lang_reflect_Method_invoke(method, obj, objArr);
            return on(obj);
        } catch (Exception e2) {
            throw new b(e2);
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(4:4|5|22|19) */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0022, code lost:
        if (r3 < r4) goto L_0x0024;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0024, code lost:
        r2 = r5[r3];
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x002e, code lost:
        if (r7.equals(r2.getName()) != false) goto L_0x0030;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0030, code lost:
        r0 = r2.getParameterTypes();
        com.bytedance.common.utility.Logger.debug();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x003d, code lost:
        return r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x003e, code lost:
        r3 = r3 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0041, code lost:
        return r1.getDeclaredMethod(r7, r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0047, code lost:
        throw new java.lang.NoSuchMethodException();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x000e, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x000f, code lost:
        r0.printStackTrace();
        r1 = r1.getSuperclass();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0016, code lost:
        if (r1 != null) goto L_0x0009;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0018, code lost:
        r5 = type().getMethods();
        r4 = r5.length;
        r3 = 0;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:4:0x0009 */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0024  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.reflect.Method exactMethod(java.lang.String r7, java.lang.Class<?>[] r8, java.lang.Object... r9) {
        /*
            r6 = this;
            java.lang.Class r1 = r6.type()
            java.lang.reflect.Method r0 = r1.getMethod(r7, r8)     // Catch:{ NoSuchMethodException -> 0x0009 }
            return r0
        L_0x0009:
            java.lang.reflect.Method r0 = r1.getDeclaredMethod(r7, r8)     // Catch:{ NoSuchMethodException -> 0x000e }
            goto L_0x0041
        L_0x000e:
            r0 = move-exception
            r0.printStackTrace()
            java.lang.Class r1 = r1.getSuperclass()
            if (r1 != 0) goto L_0x0009
            java.lang.Class r0 = r6.type()
            java.lang.reflect.Method[] r5 = r0.getMethods()
            int r4 = r5.length
            r3 = 0
        L_0x0022:
            if (r3 >= r4) goto L_0x0042
            r2 = r5[r3]
            java.lang.String r0 = r2.getName()
            boolean r0 = r7.equals(r0)
            if (r0 == 0) goto L_0x003e
            java.lang.Class[] r0 = r2.getParameterTypes()
            com.bytedance.common.utility.Logger.debug()
            if (r0 == 0) goto L_0x003e
            int r1 = r0.length
            int r0 = r8.length
            if (r1 != r0) goto L_0x003e
            return r2
        L_0x003e:
            int r3 = r3 + 1
            goto L_0x0022
        L_0x0041:
            return r0
        L_0x0042:
            java.lang.NoSuchMethodException r0 = new java.lang.NoSuchMethodException
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.common.utility.reflect.Reflect.exactMethod(java.lang.String, java.lang.Class[], java.lang.Object[]):java.lang.reflect.Method");
    }
}
