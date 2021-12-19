package com.ss.android.ugc.aweme.settings;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.SettingsManager;

public final class i {

    /* renamed from: a  reason: collision with root package name */
    public static final i f123110a = new i();

    private i() {
    }

    static {
        Covode.recordClassIndex(80855);
    }

    public static final boolean a() {
        return SettingsManager.a().a("tool_enable_legacy_publish_terminal_monitor_report", true);
    }
}
