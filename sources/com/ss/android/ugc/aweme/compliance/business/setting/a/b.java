package com.ss.android.ugc.aweme.compliance.business.setting.a;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.language.d;
import com.ss.android.ugc.aweme.setting.services.SettingServiceImpl;
import h.f.b.l;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static final b f77172a = new b();

    private b() {
    }

    static {
        Covode.recordClassIndex(47719);
    }

    public static final String a(String str) {
        l.d(str, "");
        return "https://www.tiktok.com/in_app/redirect?region=" + d.g() + "&language=" + SettingServiceImpl.v().h() + "&projectKey=" + str;
    }
}
