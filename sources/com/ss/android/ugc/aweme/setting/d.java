package com.ss.android.ugc.aweme.setting;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.SettingsManager;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    public static final d f122178a = new d();

    private d() {
    }

    static {
        Covode.recordClassIndex(80096);
    }

    public static final long a() {
        return Math.min(b(), 900000L);
    }

    private static long b() {
        return (long) SettingsManager.a().a("allow_long_video_threshold", 0);
    }
}
