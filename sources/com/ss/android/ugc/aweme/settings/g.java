package com.ss.android.ugc.aweme.settings;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.SettingsManager;

public final class g {

    /* renamed from: a  reason: collision with root package name */
    public static final g f123107a = new g();

    private g() {
    }

    static {
        Covode.recordClassIndex(80853);
    }

    public static final boolean a() {
        return SettingsManager.a().a("enable_force_ve_sw_when_opt", false);
    }
}
