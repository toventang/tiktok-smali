package com.ss.android.ugc.aweme.property;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.SettingsManager;

public final class ck {

    /* renamed from: a  reason: collision with root package name */
    public static final long f118409a = 60000;

    /* renamed from: b  reason: collision with root package name */
    public static final ck f118410b = new ck();

    private ck() {
    }

    public static final long a() {
        return SettingsManager.a().a("long_video_threshold", 60000L);
    }

    static {
        Covode.recordClassIndex(76908);
    }
}
