package com.ss.android.ugc.aweme.feed.v;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.SettingsManager;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final boolean f95147a = false;

    /* renamed from: b  reason: collision with root package name */
    public static final a f95148b = new a();

    private a() {
    }

    static {
        Covode.recordClassIndex(60305);
    }

    public static final boolean a() {
        try {
            return SettingsManager.a().a("expand_the_character_limit_of_video_caption_enable_for_consumers", false);
        } catch (Throwable unused) {
            return f95147a;
        }
    }
}
