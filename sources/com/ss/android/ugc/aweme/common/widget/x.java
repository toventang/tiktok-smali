package com.ss.android.ugc.aweme.common.widget;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.SettingsManager;

public final class x {

    /* renamed from: a  reason: collision with root package name */
    public static final x f76611a = new x();

    private x() {
    }

    static {
        Covode.recordClassIndex(47298);
    }

    public static final boolean a() {
        if (b() > 0.0d) {
            return true;
        }
        return false;
    }

    private static double b() {
        return SettingsManager.a().a("recommend_fix_splash_bug", 1.5d);
    }
}
