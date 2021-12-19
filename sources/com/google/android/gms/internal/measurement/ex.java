package com.google.android.gms.internal.measurement;

import com.bytedance.covode.number.Covode;

final class ex {

    /* renamed from: a  reason: collision with root package name */
    static final Class<?> f50829a = a("libcore.io.Memory");

    /* renamed from: b  reason: collision with root package name */
    private static final boolean f50830b;

    static boolean a() {
        if (f50829a == null || f50830b) {
            return false;
        }
        return true;
    }

    static {
        boolean z;
        Covode.recordClassIndex(31772);
        if (a("org.robolectric.Robolectric") != null) {
            z = true;
        } else {
            z = false;
        }
        f50830b = z;
    }

    private static <T> Class<T> a(String str) {
        try {
            return (Class<T>) Class.forName(str);
        } catch (Throwable unused) {
            return null;
        }
    }
}
