package com.ss.android.ugc.aweme.commercialize.f;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.SettingsManager;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final a f74056a = new a();

    private a() {
    }

    static {
        Covode.recordClassIndex(45610);
    }

    public static final int a() {
        try {
            return SettingsManager.a().a("omsdk_session_delay_second", 0);
        } catch (Throwable unused) {
            return 0;
        }
    }
}
