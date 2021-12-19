package com.ss.android.ugc.aweme.property;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.SettingsManager;

public final class bt {

    /* renamed from: a  reason: collision with root package name */
    public static final bt f118385a = new bt();

    private bt() {
    }

    static {
        Covode.recordClassIndex(76890);
    }

    public static final boolean a() {
        if (SettingsManager.a().a("enable_cover_effect", 0) == 1) {
            return true;
        }
        return false;
    }
}
