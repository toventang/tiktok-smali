package com.ss.android.ugc.aweme.account.util;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.a;
import com.ss.android.ugc.aweme.app.services.IRegionService;
import com.ss.android.ugc.aweme.main.service.ILanguageService;
import h.f.b.l;

public final class o {

    /* renamed from: a  reason: collision with root package name */
    public static final o f65497a = new o();

    private o() {
    }

    static {
        Covode.recordClassIndex(40279);
    }

    public static String a(String str) {
        l.d(str, "");
        return "https://www.tiktok.com/in_app/redirect?region=" + ((IRegionService) a.a(IRegionService.class)).a() + "&language=" + ((ILanguageService) a.a(ILanguageService.class)).a() + "&projectKey=" + str;
    }
}
