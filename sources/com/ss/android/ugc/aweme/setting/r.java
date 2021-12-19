package com.ss.android.ugc.aweme.setting;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.SettingsManager;

public final class r {

    /* renamed from: a  reason: collision with root package name */
    public static final r f122552a = new r();

    private r() {
    }

    static {
        Covode.recordClassIndex(80407);
    }

    public static final boolean a() {
        return SettingsManager.a().a("enable_arcore", false);
    }
}
