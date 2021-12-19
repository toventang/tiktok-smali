package com.ss.android.ugc.aweme.experiment;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.SettingsManager;

public final class cg {

    /* renamed from: a  reason: collision with root package name */
    public static final cg f89696a = new cg();

    private cg() {
    }

    static {
        Covode.recordClassIndex(56368);
    }

    public static boolean a() {
        try {
            return SettingsManager.a().a("enable_income_plus_reauth", false);
        } catch (Throwable unused) {
            return false;
        }
    }
}
