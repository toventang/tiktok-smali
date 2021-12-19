package com.ss.android.ugc.aweme.settingsrequest.b;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.SettingsManager;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static final b f123178a = new b();

    private b() {
    }

    static {
        Covode.recordClassIndex(80905);
    }

    public static boolean a() {
        return SettingsManager.a().a("use_new_get_abtest_method", false);
    }
}
