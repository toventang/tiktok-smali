package com.ss.ugc.effectplatform.util;

import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class r {

    /* renamed from: a  reason: collision with root package name */
    public static final r f153990a = new r();

    private r() {
    }

    static {
        Covode.recordClassIndex(102687);
    }

    public static boolean a(String str, int i2, int i3) {
        l.c(str, "");
        if (!u.a(str) && i2 >= 0 && i3 >= 0 && i2 < i3 && i2 < str.length() && i3 <= str.length()) {
            return true;
        }
        return false;
    }
}
