package com.ss.android.ugc.aweme.settings;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.SettingsManager;

public final class k {

    /* renamed from: a  reason: collision with root package name */
    public static final k f123112a = new k();

    private k() {
    }

    static {
        Covode.recordClassIndex(80857);
    }

    public static final boolean a() {
        return SettingsManager.a().a("tool_enable_publish_input_exception_rethrow", false);
    }
}
