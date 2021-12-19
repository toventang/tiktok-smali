package com.ss.android.ugc.aweme.settings;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.SettingsManager;

public final class x {

    /* renamed from: a  reason: collision with root package name */
    public static final int f123144a = 18;

    /* renamed from: b  reason: collision with root package name */
    public static final x f123145b = new x();

    private x() {
    }

    public static int a() {
        int i2 = f123144a;
        try {
            return SettingsManager.a().a("music_play_retry_count_videocache", 18);
        } catch (Throwable unused) {
            return i2;
        }
    }

    static {
        Covode.recordClassIndex(80873);
    }
}
