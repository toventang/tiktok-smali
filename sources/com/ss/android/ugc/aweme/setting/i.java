package com.ss.android.ugc.aweme.setting;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.SettingsManager;

public final class i {

    /* renamed from: a  reason: collision with root package name */
    public static final i f122201a = new i();

    private i() {
    }

    static {
        Covode.recordClassIndex(80115);
    }

    public static final h a() {
        try {
            return (h) SettingsManager.a().a("creator_portal_locale", h.class);
        } catch (Throwable unused) {
            return null;
        }
    }
}
