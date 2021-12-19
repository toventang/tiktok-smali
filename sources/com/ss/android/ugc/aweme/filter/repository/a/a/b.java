package com.ss.android.ugc.aweme.filter.repository.a.a;

import com.bytedance.covode.number.Covode;
import h.f.b.l;
import h.m.p;
import java.io.File;

public final class b {
    static {
        Covode.recordClassIndex(60542);
    }

    public static final String a(String str) {
        l.d(str, "");
        String str2 = File.separator;
        l.b(str2, "");
        if (p.c(str, str2, false)) {
            return str;
        }
        return str + File.separator;
    }
}
