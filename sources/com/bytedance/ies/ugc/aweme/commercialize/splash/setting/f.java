package com.bytedance.ies.ugc.aweme.commercialize.splash.setting;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.SettingsManager;

public final class f {

    /* renamed from: a  reason: collision with root package name */
    public static final boolean f34808a = true;

    /* renamed from: b  reason: collision with root package name */
    public static final f f34809b = new f();

    private f() {
    }

    static {
        Covode.recordClassIndex(20880);
    }

    public static final boolean a() {
        try {
            return SettingsManager.a().a("splash_ad_support_video_engine", true);
        } catch (Throwable unused) {
            return f34808a;
        }
    }
}
