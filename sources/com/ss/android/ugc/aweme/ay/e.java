package com.ss.android.ugc.aweme.ay;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.keva.Keva;

public final class e {

    /* renamed from: a  reason: collision with root package name */
    static final boolean f67794a = Keva.getRepo("ab_repo_cold_boot").getBoolean("fresco_pie_decode_setting", false);

    /* renamed from: b  reason: collision with root package name */
    public static final e f67795b = new e();

    private e() {
    }

    public static final boolean a() {
        return SettingsManager.a().a("fresco_pie_decode", false);
    }

    static {
        Covode.recordClassIndex(41734);
    }
}
