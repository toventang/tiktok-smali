package com.ss.ugc.effectplatform.util;

import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class u {

    /* renamed from: a  reason: collision with root package name */
    public static final u f153993a = new u();

    private u() {
    }

    static {
        Covode.recordClassIndex(102690);
    }

    public static boolean a(String str) {
        if (str == null || str.length() == 0) {
            return true;
        }
        return false;
    }

    public static boolean a(String str, String str2) {
        if (!a(str) || !a(str2)) {
            return l.a((Object) str, (Object) str2);
        }
        return true;
    }
}
