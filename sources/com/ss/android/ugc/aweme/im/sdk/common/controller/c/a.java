package com.ss.android.ugc.aweme.im.sdk.common.controller.c;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.SettingsManager;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final long f102192a = 300000;

    /* renamed from: b  reason: collision with root package name */
    public static final a f102193b = new a();

    private a() {
    }

    static {
        Covode.recordClassIndex(65394);
    }

    public static long a() {
        try {
            return SettingsManager.a().a("im_feed_video_status_valid_duration", 300000L);
        } catch (Exception unused) {
            return f102192a;
        }
    }
}
