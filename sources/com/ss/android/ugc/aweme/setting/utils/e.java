package com.ss.android.ugc.aweme.setting.utils;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.SettingsManager;

public final class e {

    /* renamed from: a  reason: collision with root package name */
    public static final String f123037a = "https://www.tiktok.com/falcon/forest/nebula/ad_experience_analysis?hide_nav_bar=1";

    /* renamed from: b  reason: collision with root package name */
    public static final e f123038b = new e();

    private e() {
    }

    static {
        Covode.recordClassIndex(80794);
    }

    public static final String a() {
        try {
            return "aweme://webview/?url=" + SettingsManager.a().a("low_quality_entry_setting", "https://www.tiktok.com/falcon/forest/nebula/ad_experience_analysis?hide_nav_bar=1");
        } catch (Throwable unused) {
            return f123037a;
        }
    }
}
