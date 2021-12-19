package com.ss.android.ugc.aweme.im.service.c;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.SettingsManager;

public final class j {

    /* renamed from: a  reason: collision with root package name */
    public static final long f103856a = 86400;

    /* renamed from: b  reason: collision with root package name */
    public static final j f103857b = new j();

    private j() {
    }

    public static final long a() {
        return SettingsManager.a().a("im_mention_check_valid_duration_for_cold_start", 86400L);
    }

    static {
        Covode.recordClassIndex(66524);
    }
}
