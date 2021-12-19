package com.google.gson.internal.a;

import com.bytedance.covode.number.Covode;
import com.google.gson.m;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;

final class c extends b {

    /* renamed from: b  reason: collision with root package name */
    private static Class f54739b;

    /* renamed from: c  reason: collision with root package name */
    private final Object f54740c = a();

    /* renamed from: d  reason: collision with root package name */
    private final Field f54741d = b();

    static {
        Covode.recordClassIndex(33944);
    }

    c() {
    }

    private static Field b() {
        try {
            return AccessibleObject.class.getDeclaredField("override");
        } catch (NoSuchFieldException unused) {
            return null;
        }
    }

    private static Object a() {
        try {
            Class<?> cls = Class.forName("sun.misc.Unsafe");
            f54739b = cls;
            Field declaredField = cls.getDeclaredField("theUnsafe");
            declaredField.setAccessible(true);
            return declaredField.get(null);
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // com.google.gson.internal.a.b
    public final void a(AccessibleObject accessibleObject) {
        if (!b(accessibleObject)) {
            try {
                accessibleObject.setAccessible(true);
            } catch (SecurityException e2) {
                throw new m("Gson couldn't modify fields for " + accessibleObject + "\nand sun.misc.Unsafe not found.\nEither write a custom type adapter, or make fields accessible, or include sun.misc.Unsafe.", e2);
            }
        }
    }

    private boolean b(AccessibleObject accessibleObject) {
        if (!(this.f54740c == null || this.f54741d == null)) {
            try {
                long longValue = ((Long) f54739b.getMethod("objectFieldOffset", Field.class).invoke(this.f54740c, this.f54741d)).longValue();
                f54739b.getMethod("putBoolean", Object.class, Long.TYPE, Boolean.TYPE).invoke(this.f54740c, accessibleObject, Long.valueOf(longValue), true);
                return true;
            } catch (Exception unused) {
            }
        }
        return false;
    }
}
