package com.ss.android.ugc.aweme.utils;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.language.d;
import com.ss.android.ugc.aweme.setting.services.SettingServiceImpl;
import h.f.b.l;

public final class fy {

    /* renamed from: a  reason: collision with root package name */
    public static final fy f142960a = new fy();

    private fy() {
    }

    static {
        Covode.recordClassIndex(93556);
    }

    public static String a(String str) {
        l.d(str, "");
        return "https://www.tiktok.com/in_app/redirect?region=" + d.g() + "&language=" + SettingServiceImpl.v().h() + "&projectKey=" + str;
    }
}
