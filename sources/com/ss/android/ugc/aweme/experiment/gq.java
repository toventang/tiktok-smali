package com.ss.android.ugc.aweme.experiment;

import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class gq {

    /* renamed from: a  reason: collision with root package name */
    public static final boolean f90161a = true;

    /* renamed from: b  reason: collision with root package name */
    public static final gq f90162b = new gq();

    private gq() {
    }

    static {
        Covode.recordClassIndex(56562);
    }

    public static boolean a() {
        try {
            Class<?> cls = Class.forName("android.os.SystemProperties");
            Object invoke = cls.getDeclaredMethod("get", String.class).invoke(cls, "ro.miui.ui.version.name");
            if (invoke != null) {
                String str = (String) invoke;
                if (str != null) {
                    String substring = str.substring(1);
                    l.b(substring, "");
                    if (Integer.parseInt(substring) >= 12) {
                        return true;
                    }
                    return false;
                }
                throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
        } catch (Exception unused) {
            return false;
        }
    }
}
