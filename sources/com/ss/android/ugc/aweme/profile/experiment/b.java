package com.ss.android.ugc.aweme.profile.experiment;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.SettingsManager;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static final b f116335a = new b();

    private b() {
    }

    static {
        Covode.recordClassIndex(75112);
    }

    public static final boolean a() {
        try {
            return SettingsManager.a().a("enable_profile_add_nonprofit", false);
        } catch (Throwable unused) {
            return false;
        }
    }
}
