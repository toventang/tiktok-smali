package com.ss.android.ugc.aweme.profile.settings;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.SettingsManager;
import h.f.b.l;

public final class e {

    /* renamed from: a  reason: collision with root package name */
    public static final String f116633a = "";

    /* renamed from: b  reason: collision with root package name */
    public static final e f116634b = new e();

    private e() {
    }

    static {
        Covode.recordClassIndex(75356);
    }

    public static String a() {
        String str;
        try {
            str = SettingsManager.a().a("yt_aes_key", "");
        } catch (Throwable unused) {
            str = "";
        }
        l.b(str, "");
        return str;
    }
}
