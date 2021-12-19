package com.ss.android.ugc.aweme.property;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.SettingsManager;

public final class ak {

    /* renamed from: a  reason: collision with root package name */
    public static final ak f118335a = new ak();

    private ak() {
    }

    static {
        Covode.recordClassIndex(76851);
    }

    public static boolean a() {
        return SettingsManager.a().a("enable_default_open_hd_video_switch", false);
    }
}
