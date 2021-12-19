package com.ss.android.ugc.tiktok.security.c;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.SettingsManager;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final boolean f149047a = false;

    /* renamed from: b  reason: collision with root package name */
    public static final a f149048b = new a();

    private a() {
    }

    static {
        Covode.recordClassIndex(98173);
    }

    public static boolean a() {
        try {
            return SettingsManager.a().a("hybrid_sec_route_monitor_switch", false);
        } catch (Throwable unused) {
            return f149047a;
        }
    }
}
