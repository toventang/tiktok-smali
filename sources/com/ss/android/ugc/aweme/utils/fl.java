package com.ss.android.ugc.aweme.utils;

import com.a;
import com.bytedance.covode.number.Covode;
import h.f.b.l;
import h.m.p;
import java.util.Arrays;
import java.util.Objects;

public final class fl {

    /* renamed from: a  reason: collision with root package name */
    public static final fl f142937a = new fl();

    private fl() {
    }

    static {
        Covode.recordClassIndex(93527);
    }

    public static String a(long j2) {
        String a2 = a.a("%.1f", Arrays.copyOf(new Object[]{Float.valueOf(((float) j2) / 1048576.0f)}, 1));
        l.b(a2, "");
        if (!p.c(a2, "0", false) || !p.a((CharSequence) a2, (CharSequence) ".", false)) {
            return a2;
        }
        int a3 = p.a((CharSequence) a2, ".", 0, false, 6);
        Objects.requireNonNull(a2, "null cannot be cast to non-null type java.lang.String");
        String substring = a2.substring(0, a3);
        l.b(substring, "");
        return substring;
    }
}
