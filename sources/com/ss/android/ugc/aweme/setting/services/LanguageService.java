package com.ss.android.ugc.aweme.setting.services;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.i18n.language.a;
import com.ss.android.ugc.aweme.i18n.language.i18n.b;
import com.ss.android.ugc.aweme.main.service.ILanguageService;
import h.f.b.l;

public final class LanguageService implements ILanguageService {
    static {
        Covode.recordClassIndex(80509);
    }

    @Override // com.ss.android.ugc.aweme.main.service.ILanguageService
    public final String a() {
        String a2 = b.a(a.a());
        l.b(a2, "");
        return a2;
    }
}
