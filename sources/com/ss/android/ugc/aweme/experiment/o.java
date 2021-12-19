package com.ss.android.ugc.aweme.experiment;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.SettingsManager;

public final class o {

    /* renamed from: a  reason: collision with root package name */
    public static final o f90268a = new o();

    private o() {
    }

    static {
        Covode.recordClassIndex(56616);
    }

    public static final boolean a() {
        try {
            return SettingsManager.a().a("cla_crowdsourcing_feature_switch", true);
        } catch (Throwable unused) {
            return false;
        }
    }
}
