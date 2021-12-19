package com.bytedance.monitor.a;

import com.bytedance.covode.number.Covode;

public final class f {

    /* renamed from: a  reason: collision with root package name */
    static final Object[] f41405a = new Object[0];

    /* renamed from: b  reason: collision with root package name */
    static final Class<?>[] f41406b = new Class[0];

    static {
        Covode.recordClassIndex(25375);
    }

    static Object[] b(Object[] objArr) {
        if (objArr == null || objArr.length == 0) {
            return f41405a;
        }
        return objArr;
    }

    static Class<?>[] a(Object... objArr) {
        if (objArr == null) {
            return null;
        }
        if (objArr.length == 0) {
            return f41406b;
        }
        Class<?>[] clsArr = new Class[objArr.length];
        for (int i2 = 0; i2 < objArr.length; i2++) {
            clsArr[i2] = objArr[i2] == null ? null : objArr[i2].getClass();
        }
        return clsArr;
    }
}
