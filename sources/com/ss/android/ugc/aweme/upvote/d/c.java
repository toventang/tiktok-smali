package com.ss.android.ugc.aweme.upvote.d;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.SettingsManager;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    public static final int f142043a = 50;

    /* renamed from: b  reason: collision with root package name */
    public static final c f142044b = new c();

    private c() {
    }

    public static int a() {
        try {
            return SettingsManager.a().a("social_upvote_publish_cache_limit", 50);
        } catch (Throwable unused) {
            return f142043a;
        }
    }

    static {
        Covode.recordClassIndex(92831);
    }
}
