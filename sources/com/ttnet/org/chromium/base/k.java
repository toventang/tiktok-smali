package com.ttnet.org.chromium.base;

import android.util.Pair;
import com.bytedance.covode.number.Covode;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public final class k {

    /* renamed from: a  reason: collision with root package name */
    public final Object f155250a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f155251b;

    public static class a {
        static {
            Covode.recordClassIndex(103315);
        }
    }

    static {
        Covode.recordClassIndex(103314);
    }

    private static Object b(Method method, Object obj, Object[] objArr) {
        Pair<Boolean, Object> a2 = com.bytedance.helios.sdk.a.a(method, new Object[]{obj, objArr}, 110000, "java.lang.Object", true, "com_ttnet_org_chromium_base_Reflect_java_lang_reflect_Method_invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;");
        if (((Boolean) a2.first).booleanValue()) {
            return a2.second;
        }
        Object invoke = method.invoke(obj, objArr);
        com.bytedance.helios.sdk.a.a(invoke, method, new Object[]{obj, objArr}, "com_ttnet_org_chromium_base_Reflect_java_lang_reflect_Method_invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;");
        return invoke;
    }

    public final k a(String str, Object obj) {
        try {
            b(str).set(this.f155250a, obj);
            return this;
        } catch (Exception e2) {
            throw new l(e2);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0024, code lost:
        r3 = r5.getDeclaredMethods();
        r2 = r3.length;
        r1 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x002a, code lost:
        if (r1 < r2) goto L_0x002c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x002c, code lost:
        r4 = r3[r1];
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0032, code lost:
        if (a(r4, r7, r8) != false) goto L_0x0034;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x003a, code lost:
        return a(r4, r6.f155250a, r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x003b, code lost:
        r1 = r1 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x003e, code lost:
        r5 = r5.getSuperclass();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0042, code lost:
        if (r5 != null) goto L_0x0044;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x007b, code lost:
        throw new java.lang.NoSuchMethodException("No similar method " + r7 + " with params " + java.util.Arrays.toString(r8) + " could be found on type " + a() + ".");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x007c, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0082, code lost:
        throw new com.ttnet.org.chromium.base.l(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:4:?, code lost:
        r5 = a();
        r3 = r5.getMethods();
        r2 = r3.length;
        r1 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0016, code lost:
        if (r1 < r2) goto L_0x0018;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0018, code lost:
        r4 = r3[r1];
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x001e, code lost:
        if (a(r4, r7, r8) != false) goto L_0x0020;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0021, code lost:
        r1 = r1 + 1;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x000b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.ttnet.org.chromium.base.k a(java.lang.String r7, java.lang.Class<?>[] r8, java.lang.Object... r9) {
        /*
        // Method dump skipped, instructions count: 131
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ttnet.org.chromium.base.k.a(java.lang.String, java.lang.Class[], java.lang.Object[]):com.ttnet.org.chromium.base.k");
    }

    public final int hashCode() {
        return this.f155250a.hashCode();
    }

    public final String toString() {
        return this.f155250a.toString();
    }

    private Class<?> a() {
        if (this.f155251b) {
            return (Class) this.f155250a;
        }
        return this.f155250a.getClass();
    }

    private k(Object obj) {
        this.f155250a = obj;
    }

    public static k a(Object obj) {
        return new k(obj);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof k) {
            return this.f155250a.equals(((k) obj).f155250a);
        }
        return false;
    }

    private static Class<?> a(Class<?> cls) {
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

    private Field b(String str) {
        Class<?> a2 = a();
        try {
            return a2.getField(str);
        } catch (NoSuchFieldException e2) {
            do {
                try {
                    return (Field) a((AccessibleObject) a2.getDeclaredField(str));
                } catch (NoSuchFieldException unused) {
                    a2 = a2.getSuperclass();
                    if (a2 == null) {
                        throw new l(e2);
                    }
                }
            } while (a2 == null);
            throw new l(e2);
        }
    }

    private static <T extends AccessibleObject> T a(T t) {
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

    public final k a(String str) {
        return a(str, (Class<?>[]) null, new Object[0]);
    }

    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:1:0x0004 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:4:0x0009 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v2, resolved type: java.lang.Class */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Class] */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Class] */
    /* JADX WARN: Type inference failed for: r0v12, types: [java.lang.reflect.Method] */
    /* JADX WARNING: Can't wrap try/catch for region: R(4:4|5|26|23) */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x001f, code lost:
        if (r5 < r6) goto L_0x0021;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0021, code lost:
        r4 = r7[r5];
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x002b, code lost:
        if (r9.equals(r4.getName()) != false) goto L_0x002d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x002d, code lost:
        r3 = r4.getParameterTypes();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0035, code lost:
        if (com.ttnet.org.chromium.base.g.a() != false) goto L_0x0037;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0037, code lost:
        r2 = r3.length;
        r1 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0039, code lost:
        if (r1 < r2) goto L_0x003b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x003b, code lost:
        r3[r1].getName();
        r1 = r1 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0049, code lost:
        return r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x004a, code lost:
        r5 = r5 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x004d, code lost:
        return r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0053, code lost:
        throw new java.lang.NoSuchMethodException();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:?, code lost:
        r0 = r0.getDeclaredMethod(r9, r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x000e, code lost:
        r0 = r0.getSuperclass();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0012, code lost:
        if (r0 != 0) goto L_0x0009;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0014, code lost:
        r7 = a().getMethods();
        r6 = r7.length;
        r5 = 0;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:4:0x0009 */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0021  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private java.lang.reflect.Method a(java.lang.String r9, java.lang.Class<?>... r10) {
        /*
            r8 = this;
            java.lang.Class r0 = r8.a()
            java.lang.reflect.Method r0 = r0.getMethod(r9, r10)     // Catch:{ NoSuchMethodException -> 0x0009 }
            return r0
        L_0x0009:
            java.lang.reflect.Method r0 = r0.getDeclaredMethod(r9, r10)     // Catch:{ NoSuchMethodException -> 0x000e }
            goto L_0x004d
        L_0x000e:
            java.lang.Class r0 = r0.getSuperclass()
            if (r0 != 0) goto L_0x0009
            java.lang.Class r0 = r8.a()
            java.lang.reflect.Method[] r7 = r0.getMethods()
            int r6 = r7.length
            r0 = 0
            r5 = 0
        L_0x001f:
            if (r5 >= r6) goto L_0x004e
            r4 = r7[r5]
            java.lang.String r0 = r4.getName()
            boolean r0 = r9.equals(r0)
            if (r0 == 0) goto L_0x004a
            java.lang.Class[] r3 = r4.getParameterTypes()
            boolean r0 = com.ttnet.org.chromium.base.g.a()
            if (r0 == 0) goto L_0x0043
            int r2 = r3.length
            r1 = 0
        L_0x0039:
            if (r1 >= r2) goto L_0x0043
            r0 = r3[r1]
            r0.getName()
            int r1 = r1 + 1
            goto L_0x0039
        L_0x0043:
            if (r3 == 0) goto L_0x004a
            int r1 = r3.length
            int r0 = r10.length
            if (r1 != r0) goto L_0x004a
            return r4
        L_0x004a:
            int r5 = r5 + 1
            goto L_0x001f
        L_0x004d:
            return r0
        L_0x004e:
            java.lang.NoSuchMethodException r0 = new java.lang.NoSuchMethodException
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ttnet.org.chromium.base.k.a(java.lang.String, java.lang.Class[]):java.lang.reflect.Method");
    }

    private static boolean a(Class<?>[] clsArr, Class<?>[] clsArr2) {
        if (clsArr.length != clsArr2.length) {
            return false;
        }
        for (int i2 = 0; i2 < clsArr2.length; i2++) {
            if (!(clsArr2[i2] == a.class || a(clsArr[i2]).isAssignableFrom(a(clsArr2[i2])))) {
                return false;
            }
        }
        return true;
    }

    private static boolean a(Method method, String str, Class<?>[] clsArr) {
        if (!method.getName().equals(str) || !a(method.getParameterTypes(), clsArr)) {
            return false;
        }
        return true;
    }

    private static k a(Method method, Object obj, Object... objArr) {
        try {
            a((AccessibleObject) method);
            if (method.getReturnType() != Void.TYPE) {
                return a(b(method, obj, objArr));
            }
            b(method, obj, objArr);
            return a(obj);
        } catch (Exception e2) {
            throw new l(e2);
        }
    }
}
