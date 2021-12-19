package com.ss.android.ugc.aweme.shortvideo.k;

import com.bytedance.android.livesdk.livesetting.pullstream.LiveNetAdaptiveHurryTimeSetting;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.SettingsManager;

public final class j {

    /* renamed from: a  reason: collision with root package name */
    public static final int f128630a = LiveNetAdaptiveHurryTimeSetting.DEFAULT;

    /* renamed from: b  reason: collision with root package name */
    public static final j f128631b = new j();

    private j() {
    }

    public static final int a() {
        return SettingsManager.a().a("add_video_by_paste_url_max_length", LiveNetAdaptiveHurryTimeSetting.DEFAULT);
    }

    static {
        Covode.recordClassIndex(84327);
    }
}
