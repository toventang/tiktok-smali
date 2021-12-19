package com.ss.android.ugc.aweme.account.experiment;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.SettingsManager;

public final class i {

    /* renamed from: a  reason: collision with root package name */
    public static final boolean f63005a = false;

    /* renamed from: b  reason: collision with root package name */
    public static final i f63006b = new i();

    private i() {
    }

    static {
        Covode.recordClassIndex(38808);
    }

    public static final boolean a() {
        try {
            return SettingsManager.a().a("enable_country_code_local_alpha_sort", false);
        } catch (Throwable unused) {
            return f63005a;
        }
    }
}
