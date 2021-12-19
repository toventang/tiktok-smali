package com.ss.android.ugc.aweme.ad.settings;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.SettingsManager;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static final boolean f66150a = true;

    /* renamed from: b  reason: collision with root package name */
    public static final b f66151b = new b();

    private b() {
    }

    public static boolean a() {
        try {
            return SettingsManager.a().a("upload_ad_web_preload_info", true);
        } catch (Throwable unused) {
            return f66150a;
        }
    }

    static {
        Covode.recordClassIndex(40666);
    }
}
