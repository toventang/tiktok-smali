package com.ss.android.ugc.aweme.commercialize.egg.impl.d;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.SettingsManager;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static final boolean f74023a = true;

    /* renamed from: b  reason: collision with root package name */
    public static final b f74024b = new b();

    private b() {
    }

    public static final boolean a() {
        try {
            return SettingsManager.a().a("enable_commerce_egg_monitor_log", true);
        } catch (Throwable unused) {
            return f74023a;
        }
    }

    static {
        Covode.recordClassIndex(45585);
    }
}
