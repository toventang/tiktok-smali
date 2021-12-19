package com.ss.android.ugc.aweme.ad.preload;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.SettingsManager;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final boolean f66121a = true;

    /* renamed from: b  reason: collision with root package name */
    public static final a f66122b = new a();

    private a() {
    }

    public static final boolean a() {
        try {
            return SettingsManager.a().a("enable_ad_lynx_land_page_preload_optimize", true);
        } catch (Throwable unused) {
            return f66121a;
        }
    }

    static {
        Covode.recordClassIndex(40642);
    }
}
