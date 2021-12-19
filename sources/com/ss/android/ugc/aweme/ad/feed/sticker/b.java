package com.ss.android.ugc.aweme.ad.feed.sticker;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.SettingsManager;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static final int f66034a = 300;

    /* renamed from: b  reason: collision with root package name */
    public static final b f66035b = new b();

    private b() {
    }

    public static final int a() {
        try {
            return SettingsManager.a().a("lynx_sticker_delay_setting", 300);
        } catch (Throwable unused) {
            return f66034a;
        }
    }

    static {
        Covode.recordClassIndex(40611);
    }
}
