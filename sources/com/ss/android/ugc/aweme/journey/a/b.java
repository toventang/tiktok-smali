package com.ss.android.ugc.aweme.journey.a;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.language.d;
import h.f.b.l;
import java.util.Locale;
import java.util.Objects;

public final class b {
    static {
        Covode.recordClassIndex(67221);
    }

    public static final boolean a() {
        String a2 = d.a();
        l.b(a2, "");
        Locale locale = Locale.US;
        l.b(locale, "");
        Objects.requireNonNull(a2, "null cannot be cast to non-null type java.lang.String");
        String upperCase = a2.toUpperCase(locale);
        l.b(upperCase, "");
        return l.a((Object) upperCase, (Object) "US");
    }
}
