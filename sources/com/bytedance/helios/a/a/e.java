package com.bytedance.helios.a.a;

import com.bytedance.covode.number.Covode;
import h.f.b.l;
import java.lang.reflect.Method;
import java.util.Arrays;

public final class e {

    /* renamed from: a  reason: collision with root package name */
    public static final e f30636a = new e();

    private e() {
    }

    static {
        Covode.recordClassIndex(17793);
    }

    public static Class<?> a(String str) {
        l.c(str, "");
        try {
            return Class.forName(str);
        } catch (Exception unused) {
            return null;
        }
    }

    public static Method a(Class<?> cls, String str, Class<?>... clsArr) {
        l.c(cls, "");
        l.c(str, "");
        l.c(clsArr, "");
        try {
            return cls.getMethod(str, (Class[]) Arrays.copyOf(clsArr, clsArr.length));
        } catch (Exception unused) {
            return null;
        }
    }
}
