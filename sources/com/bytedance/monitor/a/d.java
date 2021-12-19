package com.bytedance.monitor.a;

import com.bytedance.covode.number.Covode;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Member;
import java.lang.reflect.Modifier;
import java.util.HashMap;
import java.util.Map;

/* access modifiers changed from: package-private */
public final class d {

    /* renamed from: a  reason: collision with root package name */
    private static final Class<?>[] f41401a = {Byte.TYPE, Short.TYPE, Character.TYPE, Integer.TYPE, Long.TYPE, Float.TYPE, Double.TYPE};

    /* renamed from: b  reason: collision with root package name */
    private static final Map<Class<?>, Class<?>> f41402b;

    /* renamed from: c  reason: collision with root package name */
    private static final Map<Class<?>, Class<?>> f41403c = new HashMap();

    /* JADX DEBUG: Multi-variable search result rejected for r0v23, resolved type: java.util.Map<java.lang.Class<?>, java.lang.Class<?>> */
    /* JADX WARN: Multi-variable type inference failed */
    static {
        Covode.recordClassIndex(25373);
        HashMap hashMap = new HashMap();
        f41402b = hashMap;
        hashMap.put(Boolean.TYPE, Boolean.class);
        hashMap.put(Byte.TYPE, Byte.class);
        hashMap.put(Character.TYPE, Character.class);
        hashMap.put(Short.TYPE, Short.class);
        hashMap.put(Integer.TYPE, Integer.class);
        hashMap.put(Long.TYPE, Long.class);
        hashMap.put(Double.TYPE, Double.class);
        hashMap.put(Float.TYPE, Float.class);
        Class cls = Void.TYPE;
        hashMap.put(cls, cls);
        for (Object obj : hashMap.keySet()) {
            Class<?> cls2 = f41402b.get(obj);
            if (!obj.equals(cls2)) {
                f41403c.put(cls2, obj);
            }
        }
    }

    private static Class<?> a(Class<?> cls) {
        return f41403c.get(cls);
    }

    static boolean a(AccessibleObject accessibleObject) {
        if (accessibleObject != null && !accessibleObject.isAccessible()) {
            Member member = (Member) accessibleObject;
            if (!accessibleObject.isAccessible() && Modifier.isPublic(member.getModifiers()) && (member.getDeclaringClass().getModifiers() & 7) == 0) {
                try {
                    accessibleObject.setAccessible(true);
                    return true;
                } catch (SecurityException unused) {
                }
            }
        }
        return false;
    }

    static float a(Class<?>[] clsArr, Class<?>[] clsArr2) {
        float f2;
        float f3 = 0.0f;
        for (int i2 = 0; i2 < clsArr.length; i2++) {
            Class<?> cls = clsArr[i2];
            Class<?> cls2 = clsArr2[i2];
            if (!cls2.isPrimitive()) {
                f2 = 0.0f;
                while (true) {
                    if (cls != null) {
                        if (cls2.equals(cls)) {
                            break;
                        }
                        if (cls2.isInterface() && a(cls, cls2)) {
                            f2 += 0.25f;
                            break;
                        }
                        f2 += 1.0f;
                        cls = cls.getSuperclass();
                    } else {
                        f2 += 1.5f;
                        break;
                    }
                }
            } else {
                if (!cls.isPrimitive()) {
                    cls = a(cls);
                    f2 = 0.1f;
                } else {
                    f2 = 0.0f;
                }
                int i3 = 0;
                while (cls != cls2) {
                    Class<?>[] clsArr3 = f41401a;
                    if (i3 >= clsArr3.length) {
                        break;
                    }
                    if (cls == clsArr3[i3]) {
                        f2 += 0.1f;
                        if (i3 < clsArr3.length - 1) {
                            cls = clsArr3[i3 + 1];
                        }
                    }
                    i3++;
                }
            }
            f3 += f2;
        }
        return f3;
    }

    static boolean a(Class<?> cls, Class<?> cls2) {
        if (cls2 == null) {
            return false;
        }
        if (cls == null) {
            if (!cls2.isPrimitive()) {
                return true;
            }
            return false;
        } else if (cls.isPrimitive() && !cls2.isPrimitive() && cls.isPrimitive() && (cls = f41402b.get(cls)) == null) {
            return false;
        } else {
            if (cls2.isPrimitive() && !cls.isPrimitive() && (cls = a(cls)) == null) {
                return false;
            }
            if (cls.equals(cls2)) {
                return true;
            }
            if (!cls.isPrimitive()) {
                return cls2.isAssignableFrom(cls);
            }
            if (!cls2.isPrimitive()) {
                return false;
            }
            if (Integer.TYPE.equals(cls)) {
                if (Long.TYPE.equals(cls2) || Float.TYPE.equals(cls2) || Double.TYPE.equals(cls2)) {
                    return true;
                }
                return false;
            } else if (Long.TYPE.equals(cls)) {
                if (Float.TYPE.equals(cls2) || Double.TYPE.equals(cls2)) {
                    return true;
                }
                return false;
            } else if (Boolean.TYPE.equals(cls) || Double.TYPE.equals(cls)) {
                return false;
            } else {
                if (Float.TYPE.equals(cls)) {
                    return Double.TYPE.equals(cls2);
                }
                if (Character.TYPE.equals(cls)) {
                    if (Integer.TYPE.equals(cls2) || Long.TYPE.equals(cls2) || Float.TYPE.equals(cls2) || Double.TYPE.equals(cls2)) {
                        return true;
                    }
                    return false;
                } else if (Short.TYPE.equals(cls)) {
                    if (Integer.TYPE.equals(cls2) || Long.TYPE.equals(cls2) || Float.TYPE.equals(cls2) || Double.TYPE.equals(cls2)) {
                        return true;
                    }
                    return false;
                } else if (!Byte.TYPE.equals(cls)) {
                    return false;
                } else {
                    if (Short.TYPE.equals(cls2) || Integer.TYPE.equals(cls2) || Long.TYPE.equals(cls2) || Float.TYPE.equals(cls2) || Double.TYPE.equals(cls2)) {
                        return true;
                    }
                    return false;
                }
            }
        }
    }
}
