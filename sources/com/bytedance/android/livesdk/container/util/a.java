package com.bytedance.android.livesdk.container.util;

import com.bytedance.covode.number.Covode;
import h.f.b.l;
import h.m.p;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final a f16882a = new a();

    private a() {
    }

    static {
        Covode.recordClassIndex(9374);
    }

    public static String a(String str) {
        l.d(str, "");
        if (str.length() == 8 || str.length() == 9) {
            if (p.b(str, "#", false)) {
                str = p.a(str, 1);
            }
            return "#".concat(String.valueOf(p.k(str) + p.b(str, 2)));
        } else if (str.length() == 6) {
            return "#".concat(String.valueOf(str));
        } else {
            return str;
        }
    }
}
