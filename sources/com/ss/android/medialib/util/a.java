package com.ss.android.medialib.util;

import com.bytedance.covode.number.Covode;
import java.lang.reflect.Method;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static Method f59810a;

    /* renamed from: b  reason: collision with root package name */
    private static Method f59811b;

    /* renamed from: c  reason: collision with root package name */
    private static Method f59812c;

    /* renamed from: d  reason: collision with root package name */
    private static Method f59813d;

    static {
        Covode.recordClassIndex(36968);
        try {
            f59811b = Class.class.getDeclaredMethod("getDeclaredField", String.class);
            f59810a = Class.class.getDeclaredMethod("getDeclaredMethod", String.class, Class[].class);
            f59812c = Class.class.getDeclaredMethod("getDeclaredConstructor", Class[].class);
            f59813d = Class.class.getDeclaredMethod("forName", String.class);
        } catch (Throwable unused) {
        }
    }
}
