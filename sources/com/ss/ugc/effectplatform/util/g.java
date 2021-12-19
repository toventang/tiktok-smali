package com.ss.ugc.effectplatform.util;

import com.bytedance.covode.number.Covode;
import d.a.d.a.d;
import h.f.b.l;

public final class g {

    /* renamed from: a  reason: collision with root package name */
    public static final g f153962a = new g();

    private g() {
    }

    static {
        Covode.recordClassIndex(102672);
    }

    public static String a(String str) {
        return str + d.f156619a + "effect_version";
    }

    public static String b(String str, String str2) {
        return str + d.f156619a + "category_version" + str2;
    }

    public static String a(String str, String str2) {
        return "effectchannel" + str2 + str;
    }

    public static String a(String str, String str2, int i2, int i3, int i4) {
        l.c(str, "");
        return str + d.f156619a + "effectchannel" + str2 + i2 + "_" + i3 + "_" + i4;
    }

    public static String a(String str, String str2, boolean z, String str3, int i2, int i3) {
        l.c(str2, "");
        if (z) {
            str2 = str2 + str3 + i2 + i3;
        }
        return str2 + d.f156619a + "effectchannel" + str;
    }
}
