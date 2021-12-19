package com.ss.android.ugc.aweme.property;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.SettingsManager;

public final class eh {

    /* renamed from: a  reason: collision with root package name */
    public static final eh f118488a = new eh();

    private eh() {
    }

    static {
        Covode.recordClassIndex(76962);
    }

    public static final boolean a() {
        if (b() == 1) {
            return true;
        }
        return false;
    }

    public static final int b() {
        return SettingsManager.a().a("use_synthetic_hardcode", 0);
    }
}
