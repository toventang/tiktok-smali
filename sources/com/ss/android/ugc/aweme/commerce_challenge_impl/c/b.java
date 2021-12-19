package com.ss.android.ugc.aweme.commerce_challenge_impl.c;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.SettingsManager;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static final boolean f73542a = false;

    /* renamed from: b  reason: collision with root package name */
    public static final b f73543b = new b();

    private b() {
    }

    static {
        Covode.recordClassIndex(45263);
    }

    public static final boolean a() {
        try {
            return SettingsManager.a().a("enable_emoji_of_non_commerce_hashtag", false);
        } catch (Throwable unused) {
            return f73542a;
        }
    }
}
