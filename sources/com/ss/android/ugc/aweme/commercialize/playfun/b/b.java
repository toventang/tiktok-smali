package com.ss.android.ugc.aweme.commercialize.playfun.b;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.SettingsManager;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static final boolean f74987a = true;

    /* renamed from: b  reason: collision with root package name */
    public static final b f74988b = new b();

    private b() {
    }

    public static final boolean a() {
        try {
            return SettingsManager.a().a("enable_ad_playfun_monitor_log", true);
        } catch (Throwable unused) {
            return f74987a;
        }
    }

    static {
        Covode.recordClassIndex(46231);
    }
}
