package com.ss.android.ugc.aweme.setting;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.SettingsManager;

public final class w {

    /* renamed from: a  reason: collision with root package name */
    public static final w f123065a = new w();

    private w() {
    }

    static {
        Covode.recordClassIndex(80828);
    }

    public static final boolean a() {
        return SettingsManager.a().a("enable_update_frame_query_times", true);
    }
}
