package com.bytedance.ies.ugc.aweme.commercialize.splash.setting;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.SettingsManager;

public final class i {

    /* renamed from: a  reason: collision with root package name */
    public static final boolean f34826a = true;

    /* renamed from: b  reason: collision with root package name */
    public static final i f34827b = new i();

    private i() {
    }

    static {
        Covode.recordClassIndex(20890);
    }

    public static boolean a() {
        try {
            return SettingsManager.a().a("splash_one_cold_start", true);
        } catch (Throwable unused) {
            return f34826a;
        }
    }
}
