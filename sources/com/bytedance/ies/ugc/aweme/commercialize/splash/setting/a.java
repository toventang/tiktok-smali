package com.bytedance.ies.ugc.aweme.commercialize.splash.setting;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.SettingsManager;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final boolean f34799a = true;

    /* renamed from: b  reason: collision with root package name */
    public static final a f34800b = new a();

    private a() {
    }

    static {
        Covode.recordClassIndex(20875);
    }

    public static boolean a() {
        try {
            return SettingsManager.a().a("enable_force_skip_topview", true);
        } catch (Throwable unused) {
            return f34799a;
        }
    }
}
