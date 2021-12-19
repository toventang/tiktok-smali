package com.ss.android.ugc.aweme.specialplus;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.SettingsManager;

public final class f {

    /* renamed from: a  reason: collision with root package name */
    public static final f f134664a = new f();

    private f() {
    }

    static {
        Covode.recordClassIndex(87983);
    }

    public static final SpecialPlusConfig a() {
        try {
            return (SpecialPlusConfig) SettingsManager.a().a("special_plus_conf", SpecialPlusConfig.class);
        } catch (Throwable unused) {
            return null;
        }
    }
}
