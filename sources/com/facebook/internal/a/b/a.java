package com.facebook.internal.a.b;

import com.bytedance.covode.number.Covode;
import com.facebook.ab;
import com.facebook.internal.a.b;
import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static boolean f48500a = false;

    /* renamed from: b  reason: collision with root package name */
    private static final Set<Object> f48501b = Collections.newSetFromMap(new WeakHashMap());

    static {
        Covode.recordClassIndex(29250);
    }

    public static boolean a(Object obj) {
        return f48501b.contains(obj);
    }

    public static void a(Throwable th, Object obj) {
        if (f48500a) {
            f48501b.add(obj);
            if (ab.b()) {
                com.facebook.internal.a.a.a(th);
                b.a.a(th, b.EnumC1185b.CrashShield).b();
            }
        }
    }
}
