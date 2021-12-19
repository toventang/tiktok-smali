package com.ss.android.ugc.aweme.tcm.impl.d;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.profile.model.TcmConfig;

public final class e {

    /* renamed from: a  reason: collision with root package name */
    public static final TcmConfig f138622a = null;

    /* renamed from: b  reason: collision with root package name */
    public static final e f138623b = new e();

    private e() {
    }

    static {
        Covode.recordClassIndex(90685);
    }

    public static final TcmConfig a() {
        try {
            return (TcmConfig) SettingsManager.a().a("tcm_config", TcmConfig.class, f138622a);
        } catch (Exception unused) {
            return null;
        }
    }
}
