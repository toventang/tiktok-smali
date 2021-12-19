package com.ss.android.ugc.aweme.ad.feed.c;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.SettingsManager;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    public static final int f65757a = 300;

    /* renamed from: b  reason: collision with root package name */
    public static final c f65758b = new c();

    private c() {
    }

    public static final int a() {
        try {
            return SettingsManager.a().a("interactive_ads_hint_preshow_time_setting", 300);
        } catch (Throwable unused) {
            return f65757a;
        }
    }

    static {
        Covode.recordClassIndex(40469);
    }
}
