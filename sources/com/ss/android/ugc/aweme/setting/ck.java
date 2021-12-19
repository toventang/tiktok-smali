package com.ss.android.ugc.aweme.setting;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.SettingsManager;
import h.f.b.l;

public final class ck {

    /* renamed from: a  reason: collision with root package name */
    public static final String f122174a = "";

    /* renamed from: b  reason: collision with root package name */
    public static final ck f122175b = new ck();

    private ck() {
    }

    static {
        Covode.recordClassIndex(80094);
    }

    public static final String a() {
        try {
            String a2 = SettingsManager.a().a("profile_badge_android_cta", "");
            l.b(a2, "");
            return a2;
        } catch (Throwable unused) {
            return f122174a;
        }
    }
}
