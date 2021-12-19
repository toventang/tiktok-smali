package com.bytedance.ies.ugc.aweme.commercialize.splash.setting;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.SettingsManager;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static final boolean f34801a = false;

    /* renamed from: b  reason: collision with root package name */
    public static final b f34802b = new b();

    private b() {
    }

    static {
        Covode.recordClassIndex(20876);
    }

    public static boolean a() {
        try {
            return SettingsManager.a().a("pre_topview_video", false);
        } catch (Throwable unused) {
            return f34801a;
        }
    }
}
