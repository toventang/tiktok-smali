package com.ss.android.ugc.aweme.i18n.language.a;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.d;
import com.bytedance.keva.Keva;
import h.f.b.l;

public final class i {

    /* renamed from: a  reason: collision with root package name */
    public static final i f99790a = new i();

    private i() {
    }

    static {
        Covode.recordClassIndex(63622);
    }

    public static final int a() {
        return b().getInt("languageDialogShowState", 0);
    }

    private static Keva b() {
        Keva repoFromSp = Keva.getRepoFromSp(d.a(), "InitialChooseLanguagePreferences", 0);
        l.b(repoFromSp, "");
        return repoFromSp;
    }

    public static final void a(int i2) {
        b().storeInt("languageDialogShowState", i2);
    }
}
