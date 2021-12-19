package com.ss.android.ugc.aweme.upvote.d;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.SettingsManager;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final int f142037a = 30;

    /* renamed from: b  reason: collision with root package name */
    public static final a f142038b = new a();

    private a() {
    }

    public static int a() {
        try {
            return SettingsManager.a().a("social_upvote_cache_limit", 30);
        } catch (Throwable unused) {
            return f142037a;
        }
    }

    static {
        Covode.recordClassIndex(92828);
    }
}
