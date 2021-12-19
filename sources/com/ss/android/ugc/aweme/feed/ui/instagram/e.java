package com.ss.android.ugc.aweme.feed.ui.instagram;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import com.google.gson.o;
import com.ss.android.ugc.aweme.utils.dg;
import h.f.b.l;
import java.util.List;
import java.util.Locale;

public final class e {
    @c(a = "enable_platforms")

    /* renamed from: a  reason: collision with root package name */
    public List<String> f94806a;
    @c(a = "platform_configs")

    /* renamed from: b  reason: collision with root package name */
    public o f94807b;

    static {
        Covode.recordClassIndex(60140);
    }

    public final c a(String str) {
        l.d(str, "");
        o oVar = this.f94807b;
        if (oVar == null) {
            return null;
        }
        Locale locale = Locale.ENGLISH;
        l.b(locale, "");
        String upperCase = str.toUpperCase(locale);
        l.b(upperCase, "");
        com.google.gson.l c2 = oVar.c(upperCase);
        if (c2 == null) {
            return null;
        }
        return (c) dg.a().a(c2, c.class);
    }
}
