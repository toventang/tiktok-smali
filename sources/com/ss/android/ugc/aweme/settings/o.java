package com.ss.android.ugc.aweme.settings;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.SettingsManager;

public final class o {

    /* renamed from: a  reason: collision with root package name */
    public static final o f123124a = new o();

    private o() {
    }

    static {
        Covode.recordClassIndex(80862);
    }

    public static final boolean a() {
        if (SettingsManager.a().a("tool_enable_recover_publish_after_app_destroy", false) || m.a()) {
            return true;
        }
        return false;
    }
}
