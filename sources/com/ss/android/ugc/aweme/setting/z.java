package com.ss.android.ugc.aweme.setting;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.SettingsManager;

public final class z {

    /* renamed from: a  reason: collision with root package name */
    public static final z f123072a = new z();

    private z() {
    }

    static {
        Covode.recordClassIndex(80831);
    }

    public static final y a() {
        try {
            return (y) SettingsManager.a().a("non_live_gifting_viewer_setting", y.class);
        } catch (Throwable unused) {
            return null;
        }
    }
}
