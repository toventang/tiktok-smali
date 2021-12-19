package com.ss.android.ugc.aweme.experiment;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.ClientExpManager;
import com.bytedance.ies.abmock.b;
import com.ss.android.ugc.aweme.language.d;
import h.f.b.l;
import java.util.Locale;
import java.util.Objects;

public final class gz {

    /* renamed from: a  reason: collision with root package name */
    public static final gz f90190a = new gz();

    private gz() {
    }

    static {
        Covode.recordClassIndex(56577);
    }

    private static int c() {
        return b.a().a("topic_interest_selection_style", ClientExpManager.topic_interest_selection_style());
    }

    public static boolean a() {
        if (!d() || c() == 0 || c() == 5) {
            return true;
        }
        return false;
    }

    public static boolean b() {
        if (!d() || c() != 4) {
            return false;
        }
        return true;
    }

    private static boolean d() {
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
