package com.ss.android.ugc.aweme.settings;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.SettingsManager;

public final class ae {

    /* renamed from: a  reason: collision with root package name */
    public static final ad f123087a = null;

    /* renamed from: b  reason: collision with root package name */
    public static final ae f123088b = new ae();

    private ae() {
    }

    static {
        Covode.recordClassIndex(80842);
    }

    public static final ad a() {
        try {
            return (ad) SettingsManager.a().a("send_analytics_event_data", ad.class, f123087a);
        } catch (Throwable unused) {
            return f123087a;
        }
    }
}
