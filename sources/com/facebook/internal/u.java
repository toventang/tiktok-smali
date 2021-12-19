package com.facebook.internal;

import com.bytedance.covode.number.Covode;

public final class u {

    /* renamed from: a  reason: collision with root package name */
    public static volatile String f48680a;

    static {
        Covode.recordClassIndex(29353);
    }

    public static boolean a() {
        if (f48680a == null || !f48680a.startsWith("Unity.")) {
            return false;
        }
        return true;
    }
}
