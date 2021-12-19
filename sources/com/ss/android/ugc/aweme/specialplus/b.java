package com.ss.android.ugc.aweme.specialplus;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.SettingsManager;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static final b f134643a = new b();

    private b() {
    }

    static {
        Covode.recordClassIndex(87973);
    }

    public static final boolean a() {
        try {
            return SettingsManager.a().a("enable_special_plus", false);
        } catch (Throwable unused) {
            return false;
        }
    }
}
