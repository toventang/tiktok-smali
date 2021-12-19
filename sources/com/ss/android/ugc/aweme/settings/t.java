package com.ss.android.ugc.aweme.settings;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.SettingsManager;

public final class t {

    /* renamed from: a  reason: collision with root package name */
    public static final s f123132a = new s((byte) 0);

    /* renamed from: b  reason: collision with root package name */
    public static final t f123133b = new t();

    private t() {
    }

    static {
        Covode.recordClassIndex(80867);
    }

    public static s a() {
        try {
            SettingsManager a2 = SettingsManager.a();
            s sVar = f123132a;
            s sVar2 = (s) a2.a("js2_xss_config", s.class, sVar);
            return sVar2 == null ? sVar : sVar2;
        } catch (Throwable unused) {
            return f123132a;
        }
    }
}
