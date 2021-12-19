package com.ss.android.ugc.aweme.setting;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.SettingsManager;
import h.f.b.l;

public final class cl {

    /* renamed from: a  reason: collision with root package name */
    public static final String f122176a = "";

    /* renamed from: b  reason: collision with root package name */
    public static final cl f122177b = new cl();

    private cl() {
    }

    static {
        Covode.recordClassIndex(80095);
    }

    public static final String a() {
        try {
            String a2 = SettingsManager.a().a("profile_badge_android_url", "");
            l.b(a2, "");
            return a2;
        } catch (Throwable unused) {
            return f122176a;
        }
    }
}
