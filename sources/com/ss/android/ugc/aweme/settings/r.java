package com.ss.android.ugc.aweme.settings;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.SettingsManager;

public final class r {

    /* renamed from: a  reason: collision with root package name */
    public static final boolean f123128a = true;

    /* renamed from: b  reason: collision with root package name */
    public static final r f123129b = new r();

    private r() {
    }

    public static boolean a() {
        try {
            return SettingsManager.a().a("google_multi_login", true);
        } catch (Throwable unused) {
            return true;
        }
    }

    static {
        Covode.recordClassIndex(80865);
    }
}
