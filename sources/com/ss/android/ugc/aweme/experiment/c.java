package com.ss.android.ugc.aweme.experiment;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.SettingsManager;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    public static final boolean f89683a = true;

    /* renamed from: b  reason: collision with root package name */
    public static final c f89684b = new c();

    private c() {
    }

    public static final boolean a() {
        try {
            return SettingsManager.a().a("enable_ad_fake_user_profile_bugfix", true);
        } catch (Throwable unused) {
            return f89683a;
        }
    }

    static {
        Covode.recordClassIndex(56359);
    }
}
