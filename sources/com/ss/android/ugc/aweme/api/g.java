package com.ss.android.ugc.aweme.api;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.SettingsManager;

public final class g {

    /* renamed from: a  reason: collision with root package name */
    public static final g f66451a = new g();

    private g() {
    }

    static {
        Covode.recordClassIndex(40842);
    }

    public static final int a() {
        try {
            return SettingsManager.a().a("flow_info_interval_seconds", 3600);
        } catch (Throwable unused) {
            return 3600;
        }
    }
}
