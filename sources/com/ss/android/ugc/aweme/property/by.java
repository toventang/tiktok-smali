package com.ss.android.ugc.aweme.property;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.SettingsManager;

public final class by {

    /* renamed from: a  reason: collision with root package name */
    public static final by f118390a = new by();

    private by() {
    }

    static {
        Covode.recordClassIndex(76895);
    }

    public static final boolean a() {
        if (b() == 1) {
            return true;
        }
        return false;
    }

    public static final int b() {
        return SettingsManager.a().a("use_hardcode", 0);
    }
}
