package com.bytedance.platform.godzilla.d;

import com.bytedance.covode.number.Covode;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static final Object[] f41983a = new Object[0];

    /* renamed from: b  reason: collision with root package name */
    public static final Class<?>[] f41984b = new Class[0];

    /* renamed from: c  reason: collision with root package name */
    private static final String f41985c = b.class.getSimpleName();

    private b() {
    }

    static {
        Covode.recordClassIndex(25657);
    }

    public static Object[] b(Object[] objArr) {
        if (objArr == null || objArr.length == 0) {
            return f41983a;
        }
        return objArr;
    }

    public static Class<?>[] a(Object... objArr) {
        Class<?> cls;
        if (objArr == null || objArr.length == 0) {
            return f41984b;
        }
        Class<?>[] clsArr = new Class[objArr.length];
        for (int i2 = 0; i2 < objArr.length; i2++) {
            if (objArr[i2] == null) {
                cls = null;
            } else {
                cls = objArr[i2].getClass();
            }
            clsArr[i2] = cls;
        }
        return clsArr;
    }
}
