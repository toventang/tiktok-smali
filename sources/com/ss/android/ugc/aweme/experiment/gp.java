package com.ss.android.ugc.aweme.experiment;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.SettingsManager;

public final class gp {

    /* renamed from: a  reason: collision with root package name */
    public static final int f90159a = 30;

    /* renamed from: b  reason: collision with root package name */
    public static final gp f90160b = new gp();

    private gp() {
    }

    public static int a() {
        try {
            return SettingsManager.a().a("period_social_recommend_flow", 30);
        } catch (Throwable unused) {
            return f90159a;
        }
    }

    static {
        Covode.recordClassIndex(56561);
    }
}
