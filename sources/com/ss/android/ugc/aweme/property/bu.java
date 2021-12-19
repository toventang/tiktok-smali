package com.ss.android.ugc.aweme.property;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.SettingsManager;

public final class bu {

    /* renamed from: a  reason: collision with root package name */
    public static final bu f118386a = new bu();

    private bu() {
    }

    static {
        Covode.recordClassIndex(76891);
    }

    public static final boolean a() {
        return SettingsManager.a().a("tool_enable_veeditor_seek_opti", false);
    }
}
