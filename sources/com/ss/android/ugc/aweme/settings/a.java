package com.ss.android.ugc.aweme.settings;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.SettingsManager;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final boolean f123073a = true;

    /* renamed from: b  reason: collision with root package name */
    public static final a f123074b = new a();

    private a() {
    }

    public static final boolean a() {
        try {
            return SettingsManager.a().a("enable_ad_geckox_cache_config", true);
        } catch (Throwable unused) {
            return f123073a;
        }
    }

    static {
        Covode.recordClassIndex(80834);
    }
}
