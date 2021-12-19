package com.ss.android.ugc.aweme.account.experiment;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.ClientExpManager;
import com.bytedance.ies.abmock.b;
import com.ss.android.ugc.aweme.language.d;
import h.a.i;
import h.f.b.l;
import java.util.Locale;
import java.util.Objects;

public final class n {

    /* renamed from: a  reason: collision with root package name */
    public static final n f63022a = new n();

    private n() {
    }

    static {
        Covode.recordClassIndex(38818);
    }

    public static boolean a() {
        if (!d() || c() != 1) {
            return false;
        }
        return true;
    }

    private static int c() {
        return b.a().a("onboarding_email_consent", ClientExpManager.onboarding_email_consent());
    }

    public static boolean b() {
        if (!d() || c() != 2) {
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
        return i.a(new String[]{"GB", "JP", "ID", "KR"}, upperCase);
    }
}
